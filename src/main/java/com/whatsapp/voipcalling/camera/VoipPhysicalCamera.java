package com.whatsapp.voipcalling.camera;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass39I;
import X.AnonymousClass3A0;
import X.AnonymousClass3A1;
import X.AnonymousClass3A2;
import X.AnonymousClass3A3;
import X.AnonymousClass3A4;
import X.AnonymousClass3AB;
import X.AnonymousClass3AC;
import X.AnonymousClass3AD;
import X.AnonymousClass3AE;
import X.AnonymousClass3AF;
import X.AnonymousClass3AG;
import X.C677239y;
import X.CallableC677339z;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public long cameraCallbackCount;
    public final AnonymousClass3AD cameraEventsDispatcher = new AnonymousClass3AD(this);
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public volatile boolean textureApiFailed;
    public AnonymousClass39I textureHolder;
    public final long thresholdRestartCameraMillis = 2000;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final Map virtualCameras = new HashMap();

    public abstract int closeOnCameraThread();

    public abstract Point getAdjustedPreviewSize();

    public abstract AnonymousClass3AF getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract AnonymousClass3AG getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public abstract void onFrameAvailableOnCameraThread();

    public abstract int setVideoPortOnCameraThread(VideoPort videoPort2);

    public abstract int startOnCameraThread();

    public abstract int stopOnCameraThread();

    public abstract void updatePreviewOrientation();

    public VoipPhysicalCamera() {
        AnonymousClass3AB r0 = new AnonymousClass3AB();
        this.cameraThread = r0;
        r0.start();
        this.cameraThreadHandler = new AnonymousClass3AC(this, this.cameraThread.getLooper());
    }

    public final void addCameraEventsListener(AnonymousClass3AE r3) {
        AnonymousClass3AD r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.add(r3);
        }
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    public final synchronized void close(boolean z) {
        HandlerThread handlerThread;
        Log.i("voip/video/VoipCamera/close Enter");
        if (((Boolean) syncRunOnCameraThread(new AnonymousClass3A2(this, z), Boolean.FALSE)).booleanValue() && (handlerThread = this.cameraThread) != null) {
            handlerThread.quit();
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public void createTexture() {
        boolean z = false;
        if (this.videoPort != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "videoport should not be null in createTexture");
        AnonymousClass39I r0 = this.textureHolder;
        if (r0 == null) {
            r0 = this.videoPort.createSurfaceTexture();
            this.textureHolder = r0;
        }
        if (r0 == null) {
            Log.e("voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture");
            this.textureApiFailed = true;
            return;
        }
        r0.A01.setOnFrameAvailableListener(new C677239y(this));
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int fpsRangeScore(int i, int i2, int i3) {
        int i4;
        if (i <= 5000) {
            i4 = -(5000 - i);
        } else {
            i4 = (-(i - 5000)) << 2;
        }
        return (i4 - Math.abs(i2 - i3)) / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    public final int getAverageCaptureFps() {
        long j = this.totalElapsedCameraCallbackTime;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j);
    }

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    public /* synthetic */ Boolean lambda$close$2766$VoipPhysicalCamera(boolean z) {
        if (z) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() != 0) {
            return Boolean.FALSE;
        }
        closeOnCameraThread();
        return Boolean.TRUE;
    }

    public /* synthetic */ void lambda$createTexture$2769$VoipPhysicalCamera(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public /* synthetic */ Integer lambda$registerVirtualCamera$2767$VoipPhysicalCamera(VoipCamera voipCamera) {
        if (this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity))) {
            return 0;
        }
        this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        return 0;
    }

    public /* synthetic */ Integer lambda$setVideoPort$2764$VoipPhysicalCamera(VideoPort videoPort2) {
        return Integer.valueOf(setVideoPortOnCameraThread(videoPort2));
    }

    public /* synthetic */ Integer lambda$stop$2765$VoipPhysicalCamera() {
        int i;
        Iterator it = this.virtualCameras.entrySet().iterator();
        boolean z = true;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            } else if (((VoipCamera) ((Map.Entry) it.next()).getValue()).started) {
                z = false;
            }
        }
        if (z) {
            i = stopOnCameraThread();
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ void lambda$syncRunOnCameraThread$2763$VoipPhysicalCamera(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public /* synthetic */ Integer lambda$unregisterVirtualCamera$2768$VoipPhysicalCamera(VoipCamera voipCamera) {
        int i;
        if (this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity))) {
            this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        }
        if (this.virtualCameras.size() == 0) {
            i = stopOnCameraThread();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    private void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    public int registerVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/Add new virtual camera with user identity ");
        A0S.append(voipCamera.userIdentity);
        Log.i(A0S.toString());
        return ((Number) syncRunOnCameraThread(new AnonymousClass3A0(this, voipCamera), -1)).intValue();
    }

    public void releaseTexture() {
        if (this.textureHolder != null) {
            boolean z = false;
            if (this.videoPort != null) {
                z = true;
            }
            AnonymousClass00E.A08(z, "video port should not be null in releaseTexture");
            this.textureHolder.A01.setOnFrameAvailableListener(null);
            clearFrameAvailableMessages();
            this.videoPort.releaseSurfaceTexture(this.textureHolder);
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(AnonymousClass3AE r3) {
        AnonymousClass3AD r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.remove(r3);
        }
    }

    public final void setPassiveMode(boolean z) {
        this.passiveMode = z;
    }

    public final synchronized int setVideoPort(VideoPort videoPort2) {
        int intValue;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        intValue = ((Integer) syncRunOnCameraThread(new AnonymousClass3A3(this, videoPort2), -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/setVideoPort Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
        return intValue;
    }

    public final synchronized int start() {
        String str;
        int intValue;
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/start Enter in ");
        if (this.passiveMode) {
            str = "passive ";
        } else {
            str = "active ";
        }
        sb.append(str);
        sb.append("mode");
        Log.i(sb.toString());
        intValue = ((Integer) syncRunOnCameraThread(new AnonymousClass3A4(this), -100)).intValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/video/VoipCamera/start Exit with ");
        sb2.append(intValue);
        Log.i(sb2.toString());
        return intValue;
    }

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        int intValue = ((Integer) syncRunOnCameraThread(new AnonymousClass3A1(this), -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/stop Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
    }

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        return this.cameraThreadHandler.post(new RunnableEBaseShape2S0300000_I1(this, exchanger, callable, 46)) ? exchange(exchanger, null) : obj;
    }

    public int unregisterVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/Remove virtual camera with user identity ");
        A0S.append(voipCamera.userIdentity);
        Log.i(A0S.toString());
        return ((Number) syncRunOnCameraThread(new CallableC677339z(this, voipCamera), -1)).intValue();
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime = (elapsedRealtime - this.lastCameraCallbackTs) + this.totalElapsedCameraCallbackTime;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }
}
