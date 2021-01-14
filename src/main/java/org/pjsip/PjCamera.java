package org.pjsip;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass39I;
import X.AnonymousClass3AD;
import X.AnonymousClass3AE;
import X.AnonymousClass3AF;
import X.AnonymousClass3AG;
import X.C67933Bb;
import X.CallableC67923Ba;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.hardware.Camera;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final AnonymousClass3AF cameraInfo;
    public volatile int cameraStartMode = 0;
    public final Object frameLock = new Object();
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public boolean receivedCameraError = false;

    public PjCamera(int i, int i2, int i3, int i4, int i5, long j) {
        StringBuilder A0U = AnonymousClass008.A0U("voip/video/VoipCamera/create idx: ", i, ", size:", i2, "x");
        A0U.append(i3);
        A0U.append(", format: 0x");
        A0U.append(Integer.toHexString(i4));
        A0U.append(", fps * 1000: ");
        A0U.append(i5);
        A0U.append(", this ");
        A0U.append(this);
        A0U.append(", class ");
        A0U.append(PjCamera.class);
        A0U.append("@");
        A0U.append(PjCamera.class.hashCode());
        A0U.append(", class loader ");
        A0U.append(PjCamera.class.getClassLoader());
        A0U.append(", hash: ");
        A0U.append(System.identityHashCode(PjCamera.class.getClassLoader()));
        Log.i(A0U.toString());
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo2);
        this.camIdx = i;
        this.cameraInfo = new AnonymousClass3AF(i2, i3, i4, i5, cameraInfo2.facing == 1, cameraInfo2.orientation, i);
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        AnonymousClass00E.A08(!this.isRunning, "close should only be called after stop.");
        AnonymousClass3AD r3 = this.cameraEventsDispatcher;
        Iterator it = r3.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3AE) it.next()).AEG(r3.A01);
        }
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public AnonymousClass3AF getCameraInfo() {
        return this.cameraInfo;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public synchronized int getCameraStartMode() {
        return this.cameraStartMode;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public AnonymousClass3AG getLastCachedFrame() {
        byte[] bArr = this.lastCachedFrameData;
        if (bArr == null) {
            return null;
        }
        AnonymousClass3AG r2 = new AnonymousClass3AG();
        r2.A05 = bArr;
        AnonymousClass3AF r1 = this.cameraInfo;
        r2.A03 = r1.A05;
        r2.A01 = r1.A02;
        r2.A00 = r1.A00;
        r2.A02 = r1.A04;
        r2.A04 = r1.A06;
        return r2;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getLatestFrame(ByteBuffer byteBuffer) {
        AnonymousClass00E.A08(this.passiveMode, "Should be here only in passive mode");
        if (!this.passiveMode) {
            return -1;
        }
        synchronized (this.frameLock) {
            if (!this.newFrameAvailable) {
                return 0;
            }
            int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
            byteBuffer.rewind();
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(this.lastCachedFrameData, 0, min);
            this.newFrameAvailable = false;
            return min;
        }
    }

    public static int getPreviewSizeForFormat(int i, int i2, int i3) {
        if (i3 == 842094169) {
            int ceil = ((int) Math.ceil(((double) i) / 16.0d)) << 4;
            return Math.max(((i * i2) * 3) >> 1, ((((((int) Math.ceil(((double) (ceil >> 1)) / 16.0d)) << 4) * i2) >> 1) << 1) + (ceil * i2));
        }
        return (ImageFormat.getBitsPerPixel(i3) * (i * i2)) >> 3;
    }

    public /* synthetic */ void lambda$startOnCameraThread$2840$PjCamera(int i, Camera camera2) {
        AnonymousClass008.A0u("camera error occurred: ", i);
        this.receivedCameraError = true;
        if (i == 2) {
            AnonymousClass3AD r3 = this.cameraEventsDispatcher;
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3AE) it.next()).AFm(r3.A01);
            }
        } else if (i != 100) {
            this.cameraEventsDispatcher.A00();
        } else {
            AnonymousClass3AD r32 = this.cameraEventsDispatcher;
            Iterator it2 = r32.A00.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass3AE) it2.next()).AJz(r32.A01);
            }
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void onFrameAvailableOnCameraThread() {
        boolean z = false;
        if (this.videoPort != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "videoport should not be null while receiving frames");
        AnonymousClass39I r3 = this.textureHolder;
        if (r3 != null) {
            VideoPort videoPort = this.videoPort;
            AnonymousClass3AF r0 = this.cameraInfo;
            videoPort.renderTexture(r3, r0.A05, r0.A02);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera2) {
        byte[] bArr2;
        if (!(camera2 == null || bArr == null)) {
            Camera camera3 = this.camera;
            if (camera2 != camera3) {
                StringBuilder A0S = AnonymousClass008.A0S("Unexpected camera in callback! current camera = ");
                A0S.append(camera3);
                A0S.append(", callback camera is ");
                A0S.append(camera2);
                Log.w(A0S.toString());
                return;
            }
            updateCameraCallbackCheck();
            if (this.isRunning) {
                if (this.passiveMode) {
                    synchronized (this.frameLock) {
                        bArr2 = this.lastCachedFrameData;
                        this.lastCachedFrameData = bArr;
                        this.newFrameAvailable = true;
                    }
                    bArr = bArr2;
                } else {
                    for (Map.Entry entry : this.virtualCameras.entrySet()) {
                        if (((VoipCamera) entry.getValue()).started) {
                            ((VoipCamera) entry.getValue()).frameCallback(bArr, bArr.length);
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            if (this.cameraStartMode == 0) {
                camera2.addCallbackBuffer(bArr);
            }
        }
    }

    private int preparePreviewOnCameraThread() {
        if (this.videoPort != null) {
            createTexture();
            try {
                AnonymousClass39I r0 = this.textureHolder;
                if (r0 != null) {
                    Camera camera2 = this.camera;
                    if (camera2 != null) {
                        camera2.setPreviewTexture(r0.A01);
                    } else {
                        throw null;
                    }
                } else {
                    Camera camera3 = this.camera;
                    if (camera3 != null) {
                        camera3.setPreviewDisplay(this.videoPort.getSurfaceHolder());
                    } else {
                        throw null;
                    }
                }
                this.videoPort.setScaleType(0);
                return 0;
            } catch (IOException e) {
                Log.e(e);
                return -2;
            }
        } else {
            throw null;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int i;
        int i2;
        VideoPort videoPort2 = this.videoPort;
        int i3 = 0;
        if (videoPort2 == videoPort) {
            return 0;
        }
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
        if (videoPort != null) {
            i = videoPort.hashCode();
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" from ");
        if (videoPort2 != null) {
            i2 = videoPort2.hashCode();
        } else {
            i2 = 0;
        }
        A0S.append(i2);
        A0S.append(", running: ");
        AnonymousClass008.A1a(A0S, this.isRunning);
        if (!this.isRunning) {
            this.videoPort = videoPort;
            if (!(videoPort == null || (i3 = startOnCameraThread()) == 0)) {
                stopOnCameraThread();
                this.videoPort = videoPort2;
            }
            return i3;
        } else if (videoPort != null) {
            stopPreviewOnCameraThread(true);
            this.videoPort = videoPort;
            if (preparePreviewOnCameraThread() != 0) {
                stopOnCameraThread();
                this.videoPort = videoPort2;
                return -7;
            }
            Camera camera2 = this.camera;
            if (camera2 != null) {
                camera2.setPreviewCallback(this);
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread(this);
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            }
            throw null;
        } else {
            int stopOnCameraThread = stopOnCameraThread();
            this.videoPort = null;
            return stopOnCameraThread;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int startOnCameraThread() {
        List<int[]> supportedPreviewFpsRange;
        if (this.isRunning) {
            return 0;
        }
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = ");
        A0S.append(this.videoPort);
        A0S.append(" at start mode: ");
        AnonymousClass008.A1L(A0S, this.cameraStartMode);
        if (this.camera == null) {
            try {
                Camera open = Camera.open(this.camIdx);
                this.camera = open;
                if (open == null) {
                    Log.e("camera is null after open");
                    return -5;
                }
                open.setErrorCallback(new C67933Bb(this));
            } catch (Exception e) {
                Log.e(e);
                return -4;
            }
        }
        if (this.videoPort == null) {
            return 0;
        }
        if (preparePreviewOnCameraThread() != 0) {
            return -2;
        }
        try {
            Camera.Parameters parameters = this.camera.getParameters();
            AnonymousClass3AF r0 = this.cameraInfo;
            parameters.setPreviewSize(r0.A05, r0.A02);
            parameters.setPreviewFormat(this.cameraInfo.A00);
            StringBuilder sb = new StringBuilder("voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: ");
            sb.append(this.cameraStartMode);
            sb.append(" width: ");
            AnonymousClass3AF r1 = this.cameraInfo;
            sb.append(r1.A05);
            sb.append(" height: ");
            sb.append(r1.A02);
            sb.append(" format: ");
            AnonymousClass008.A1L(sb, r1.A00);
            int i = 2;
            if (this.cameraStartMode > 2) {
                this.cameraStartMode = 2;
            }
            if (!(this.cameraStartMode == 2 || (supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange()) == null)) {
                int[] iArr = null;
                int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    if (iArr2.length == 2) {
                        int i3 = iArr2[0];
                        int i4 = iArr2[1];
                        int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(i3, i4, this.cameraInfo.A01);
                        StringBuilder A0S2 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread check fps [");
                        A0S2.append(i3);
                        A0S2.append(", ");
                        A0S2.append(i4);
                        A0S2.append("], score: ");
                        A0S2.append(fpsRangeScore);
                        Log.i(A0S2.toString());
                        if (fpsRangeScore > i2) {
                            iArr = iArr2;
                            i2 = fpsRangeScore;
                        }
                    }
                }
                if (iArr != null) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread with fps range [");
                    A0S3.append(iArr[0]);
                    A0S3.append(", ");
                    AnonymousClass008.A1O(A0S3, iArr[1], "], score: ", i2, ", supported ranges : ");
                    A0S3.append(parameters.get("preview-fps-range-values"));
                    Log.i(A0S3.toString());
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                }
            }
            if (this.cameraStartMode == 0) {
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null) {
                    if (supportedFocusModes.contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    } else if (supportedFocusModes.contains("infinity")) {
                        parameters.setFocusMode("infinity");
                    }
                }
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (!(supportedFlashModes == null || parameters.getFlashMode() == null || !supportedFlashModes.contains("off"))) {
                    parameters.setFlashMode("off");
                }
                if (parameters.isAutoExposureLockSupported()) {
                    parameters.setAutoExposureLock(false);
                }
                if (parameters.isAutoWhiteBalanceLockSupported()) {
                    parameters.setAutoWhiteBalanceLock(false);
                }
                StringBuilder A0S4 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread with scene mode: ");
                A0S4.append(parameters.getSceneMode());
                A0S4.append(", supported scene mode: [");
                A0S4.append(parameters.get("scene-mode-values"));
                A0S4.append("]");
                A0S4.append(", focus mode: ");
                A0S4.append(parameters.getFocusMode());
                A0S4.append(", supported focus mode: [");
                A0S4.append(parameters.get("focus-mode-values"));
                A0S4.append("]");
                A0S4.append(", flash mode: ");
                A0S4.append(parameters.getFlashMode());
                A0S4.append(", supported flash mode: [");
                A0S4.append(parameters.get("flash-mode-values"));
                A0S4.append("]");
                A0S4.append(", white balance: ");
                A0S4.append(parameters.getWhiteBalance());
                A0S4.append(", supported white balance: [");
                A0S4.append(parameters.get("whitebalance-values"));
                A0S4.append("], white balance lock: ");
                A0S4.append(parameters.getAutoWhiteBalanceLock());
                A0S4.append(", exposure: ");
                A0S4.append(parameters.getExposureCompensation());
                A0S4.append(", supported exposure range: [");
                A0S4.append(parameters.getMinExposureCompensation());
                A0S4.append(parameters.getMaxExposureCompensation());
                A0S4.append("], ");
                A0S4.append(", exposure lock: ");
                A0S4.append(parameters.getAutoExposureLock());
                Log.i(A0S4.toString());
            }
            try {
                this.camera.setParameters(parameters);
                this.isRunning = true;
                this.receivedCameraError = false;
                if (this.cameraStartMode == 0) {
                    AnonymousClass3AF r02 = this.cameraInfo;
                    int previewSizeForFormat = getPreviewSizeForFormat(r02.A05, r02.A02, r02.A00);
                    try {
                        this.camera.addCallbackBuffer(new byte[previewSizeForFormat]);
                        if (this.passiveMode) {
                            this.lastCachedFrameData = new byte[previewSizeForFormat];
                        } else {
                            i = 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/video/VoipCamera/startOnCameraThread. added ");
                        sb2.append(i);
                        sb2.append(" buffers of ");
                        sb2.append(previewSizeForFormat);
                        Log.i(sb2.toString());
                        this.camera.setPreviewCallbackWithBuffer(this);
                    } catch (OutOfMemoryError e2) {
                        StringBuilder A0S5 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: ");
                        A0S5.append(this.cameraStartMode);
                        A0S5.append(": ");
                        Log.e(A0S5.toString(), e2);
                        return tryNextStartModeOnCameraThread();
                    }
                } else {
                    AnonymousClass008.A1L(AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: "), this.cameraStartMode);
                    this.camera.setPreviewCallback(this);
                }
                updatePreviewOrientationOnCameraThread(this);
                try {
                    this.camera.startPreview();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: ");
                    sb3.append(this.cameraStartMode);
                    Log.i(sb3.toString());
                    startPeriodicCameraCallbackCheck();
                    return 0;
                } catch (Exception e3) {
                    StringBuilder A0S6 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: ");
                    A0S6.append(this.cameraStartMode);
                    A0S6.append(": ");
                    Log.e(A0S6.toString(), e3);
                    return tryNextStartModeOnCameraThread();
                }
            } catch (RuntimeException e4) {
                StringBuilder A0S7 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: ");
                A0S7.append(this.cameraStartMode);
                A0S7.append(": ");
                Log.e(A0S7.toString(), e4);
                AnonymousClass3AD r4 = this.cameraEventsDispatcher;
                int i5 = this.camIdx;
                Iterator it = r4.A00.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass3AE) it.next()).ADl(r4.A01, i5);
                }
                return -3;
            }
        } catch (RuntimeException e5) {
            Log.e("voip/video/VoipCamera/startOnCameraThread camera getParameters threw", e5);
            return -9;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int stopOnCameraThread() {
        boolean z = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    private void stopPreviewOnCameraThread(boolean z) {
        if (z && !this.receivedCameraError) {
            try {
                Camera camera2 = this.camera;
                if (camera2 != null) {
                    camera2.setPreviewCallbackWithBuffer(null);
                    this.camera.stopPreview();
                } else {
                    throw null;
                }
            } catch (RuntimeException e) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e);
            }
        }
        releaseTexture();
    }

    private synchronized int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode++;
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1.getRotation() == 2) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAdjustedPreviewSizeOnCameraThread(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "window"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L_0x0041
            android.view.Display r1 = r0.getDefaultDisplay()
            X.3AF r0 = r5.cameraInfo
            int r0 = r0.A04
            int r0 = r0 % 180
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            int r0 = r1.getRotation()
            if (r0 == 0) goto L_0x0028
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r3 == r0) goto L_0x002c
            r4 = 0
        L_0x002c:
            X.3AF r0 = r5.cameraInfo
            if (r4 == 0) goto L_0x003c
            int r2 = r0.A05
            int r1 = r0.A02
        L_0x0034:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.adjustedPreviewSize = r0
            return
        L_0x003c:
            int r2 = r0.A02
            int r1 = r0.A05
            goto L_0x0034
        L_0x0041:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updateAdjustedPreviewSizeOnCameraThread(android.content.Context):void");
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        AnonymousClass008.A0v("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ", ((Number) syncRunOnCameraThread(new CallableC67923Ba(this), -100)).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 3) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ Exception -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[Catch:{ Exception -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int updatePreviewOrientationOnCameraThread(org.pjsip.PjCamera r8) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updatePreviewOrientationOnCameraThread(org.pjsip.PjCamera):int");
    }
}
