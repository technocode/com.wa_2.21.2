package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Wi  reason: invalid class name and case insensitive filesystem */
public class SurfaceHolder$CallbackC50852Wi extends SurfaceView implements AnonymousClass2E6, SurfaceHolder.Callback {
    public static final String[] A0Y = {"GT-I9195", "GT-I9190", "GT-I9192"};
    public static final String[] A0Z = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public HandlerThread A0A;
    public Display A0B;
    public SurfaceHolder A0C;
    public C18310t9 A0D;
    public C18330tB A0E;
    public C31591dU A0F;
    public C31591dU A0G;
    public AnonymousClass2E5 A0H;
    public AnonymousClass2EF A0I;
    public String A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Handler A0Q = new Handler(Looper.getMainLooper());
    public final C50832Wf A0R;
    public final AnonymousClass2EY A0S;
    public final AnonymousClass03S A0T;
    public final AnonymousClass0L6 A0U = AnonymousClass0L6.A00();
    public final AnonymousClass022 A0V = AnonymousClass022.A00();
    public final float[] A0W = new float[16];
    public volatile byte[] A0X;

    public static int A00(float f) {
        if (f < -995.0f) {
            f = -995.0f;
        } else if (f > 995.0f) {
            f = 995.0f;
        }
        return (int) f;
    }

    @Override // X.AnonymousClass2E6
    public int getCameraApi() {
        return 0;
    }

    @Override // X.AnonymousClass2E6
    public int getCameraType() {
        return 0;
    }

    public SurfaceHolder$CallbackC50852Wi(Context context) {
        super(context, null, 0);
        AnonymousClass03S A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass03S.A00();
        }
        this.A0T = A002;
        this.A0R = new C50832Wf(this);
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = sharedPreferences.getInt("camera_index", 0);
        this.A0J = sharedPreferences.getString("flash_mode", null);
        SurfaceHolder holder = getHolder();
        this.A0C = holder;
        holder.addCallback(this);
        this.A0C.setType(3);
        this.A0B = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.A0I = new AnonymousClass2EF(this, context);
        this.A0S = new AnonymousClass2EY(this.A0R, new AnonymousClass2WO(this));
    }

    public static Camera.Size A01(List list, int i, int i2) {
        double d = (double) i;
        double d2 = d / ((double) i2);
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i3 = size2.width;
            double d3 = (double) i3;
            int i4 = size2.height;
            double d4 = d3 / ((double) i4);
            double d5 = d3 / d;
            if (i3 * i4 >= 153600 && d5 <= 1.5d && Math.abs(d4 - d2) <= 0.1d && A03(size2, size, i, i2)) {
                size = size2;
            }
        }
        if (size == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Camera.Size size3 = (Camera.Size) it2.next();
                if (((double) size3.width) / d <= 1.5d && A03(size3, size, i, i2)) {
                    size = size3;
                }
            }
            if (size == null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Camera.Size size4 = (Camera.Size) it3.next();
                    if (A03(size4, size, i, i2)) {
                        size = size4;
                    }
                }
            }
        }
        return size;
    }

    public static String A02(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            sb.append(size.width);
            sb.append('x');
            sb.append(size.height);
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static boolean A03(Camera.Size size, Camera.Size size2, int i, int i2) {
        if (size2 == null) {
            return true;
        }
        int abs = Math.abs(size2.height - i2);
        int abs2 = Math.abs(size.height - i2);
        int abs3 = Math.abs(size2.width - i);
        if ((Math.abs(size.width - i) * i2) + (abs2 * i) >= (abs3 * i2) + (abs * i)) {
            return false;
        }
        return true;
    }

    public final void A04() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0O = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    StringBuilder sb = new StringBuilder();
                    sb.append("cameraview/release-media-recorder/flash ");
                    sb.append(parameters.getFlashMode());
                    Log.d(sb.toString());
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0L = false;
                    }
                } catch (RuntimeException e) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        C31591dU r0 = this.A0F;
        if (r0 != null) {
            r0.A02();
            this.A0F = null;
        }
        C18330tB r1 = this.A0E;
        if (r1 != null) {
            if (r1.A00 != null) {
                r1.A00 = null;
            }
            this.A0E = null;
        }
        C31591dU r02 = this.A0G;
        if (r02 != null) {
            r02.A02();
            this.A0G = null;
        }
        C18310t9 r03 = this.A0D;
        if (r03 != null) {
            r03.A01();
            this.A0D = null;
        }
    }

    public final synchronized void A05() {
        Camera camera = this.A07;
        if (camera == null) {
            try {
                if (this.A00 >= Camera.getNumberOfCameras()) {
                    this.A00 = Camera.getNumberOfCameras() - 1;
                }
                Camera open = Camera.open(this.A00);
                this.A07 = open;
                open.setErrorCallback(new AnonymousClass2Dq(this));
            } catch (Exception e) {
                Camera camera2 = this.A07;
                if (camera2 != null) {
                    camera2.release();
                }
                this.A07 = null;
                Log.e("cameraview/start-camera error opening camera", e);
                if (this.A00 != 0) {
                    getSharedPreferences().edit().putInt("camera_index", 0).apply();
                }
                A08(1);
            }
            Camera camera3 = this.A07;
            if (camera3 != null) {
                try {
                    camera3.setPreviewDisplay(this.A0C);
                    A06();
                } catch (IOException | RuntimeException e2) {
                    this.A07.release();
                    this.A07 = null;
                    Log.e("cameraview/start-camera", e2);
                    if (this.A00 != 0) {
                        getSharedPreferences().edit().putInt("camera_index", 0).apply();
                    }
                    A08(1);
                }
            }
        } else {
            try {
                camera.reconnect();
            } catch (IOException e3) {
                this.A07.release();
                this.A07 = null;
                Log.e("cameraview/start-camera error reconnecting camera", e3);
                A08(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r9 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0163, code lost:
        if (r9 != 3) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0343  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A06() {
        /*
        // Method dump skipped, instructions count: 1041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC50852Wi.A06():void");
    }

    public final synchronized void A07() {
        Log.i("cameraview/stop-camera");
        Camera camera = this.A07;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.A0L = false;
            } catch (Exception e) {
                Log.w("cameraview/stop-camera error stopping camera preview", e);
            }
            try {
                this.A07.release();
            } catch (Exception e2) {
                Log.w("cameraview/stop-camera error releasing camera", e2);
            }
            this.A07 = null;
        }
        Log.i("cameraview/stop-camera-end");
    }

    public final void A08(int i) {
        AnonymousClass008.A0v("cameraview/on-error ", i);
        AnonymousClass2E5 r1 = this.A0H;
        if (r1 != null) {
            int i2 = 2;
            if (i != 2) {
                i2 = 1;
            }
            ((AnonymousClass2WY) r1).A02(i2);
        }
    }

    @Override // X.AnonymousClass2E6
    public void A2j() {
        this.A0S.A00();
    }

    @Override // X.AnonymousClass2E6
    public void A4K(float f, float f2) {
        StringBuilder sb = new StringBuilder("cameraview/focus  ");
        sb.append(f);
        sb.append(" ");
        sb.append(f2);
        Log.d(sb.toString());
        this.A09.post(new RunnableEBaseShape0S0100002_I1(this, f, f2, 1));
    }

    @Override // X.AnonymousClass2E6
    public boolean AB5() {
        return this.A0M;
    }

    @Override // X.AnonymousClass2E6
    public boolean AB7() {
        return this.A0L;
    }

    @Override // X.AnonymousClass2E6
    public boolean ABT() {
        return this.A0O;
    }

    @Override // X.AnonymousClass2E6
    public boolean ACD() {
        Camera camera;
        if (!this.A0M || !"on".equals(this.A0J) || (camera = this.A07) == null) {
            return false;
        }
        List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(this.A0J)) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass2E6
    public synchronized void ACO() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            boolean z = true;
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                if (getCameraInfo().facing != 1) {
                    z = false;
                }
                this.A0M = z;
                A07();
                this.A09.post(new RunnableEBaseShape8S0100000_I1_3(this, 10));
                getSharedPreferences().edit().putInt("camera_index", this.A00).apply();
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public synchronized String ACP() {
        if (this.A07 == null) {
            return null;
        }
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return null;
        }
        Camera.Parameters parameters = this.A07.getParameters();
        String str = this.A0J;
        if (str == null) {
            str = parameters.getFlashMode();
            this.A0J = str;
        }
        int indexOf = flashModes.indexOf(str);
        if (indexOf < 0 && (indexOf = flashModes.indexOf("off")) < 0) {
            return null;
        }
        String str2 = (String) flashModes.get((indexOf + 1) % flashModes.size());
        this.A0J = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/next flash mode:");
        sb.append(str2);
        Log.i(sb.toString());
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.contains(this.A0J)) {
            parameters.setFlashMode(this.A0J);
            this.A07.setParameters(parameters);
        }
        getSharedPreferences().edit().putString("flash_mode", this.A0J).apply();
        return this.A0J;
    }

    @Override // X.AnonymousClass2E6
    public void AN4() {
        if (!(this instanceof AnonymousClass27q)) {
            this.A09.post(new RunnableEBaseShape7S0200000_I1_2(this, this.A0C, 6));
            return;
        }
        AnonymousClass27q r4 = (AnonymousClass27q) this;
        r4.A09.post(new RunnableEBaseShape7S0200000_I1_2(r4, r4.A03, 6));
    }

    @Override // X.AnonymousClass2E6
    public void AN6() {
        Log.d("cameraview/resume");
    }

    @Override // X.AnonymousClass2E6
    public synchronized int APS(int i) {
        Camera camera = this.A07;
        if (camera == null) {
            return 0;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported() || i > parameters.getMaxZoom()) {
            return 0;
        }
        if (parameters.getZoom() != i) {
            parameters.setZoom(i);
            this.A07.setParameters(parameters);
        }
        List<Integer> zoomRatios = parameters.getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() < i) {
            return 0;
        }
        return zoomRatios.get(i).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03d8, code lost:
        if (r1.equalsIgnoreCase("cph1901") == false) goto L_0x03db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04c8  */
    @Override // X.AnonymousClass2E6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void AQ8(java.io.File r25, int r26) {
        /*
        // Method dump skipped, instructions count: 1467
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC50852Wi.AQ8(java.io.File, int):void");
    }

    @Override // X.AnonymousClass2E6
    public synchronized void AQH() {
        try {
            this.A08.stop();
        } catch (RuntimeException e) {
            Log.w("cameraview/stop-video-capture ", e);
        }
        A04();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0O = false;
        this.A05 = null;
    }

    @Override // X.AnonymousClass2E6
    public synchronized void AQS(AnonymousClass2WW r7, boolean z) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            A08(1);
        } else if (this.A0P) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0L = false;
            this.A0P = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                AnonymousClass2Du r3 = new AnonymousClass2Du(this, r7);
                this.A07.takePicture(new AnonymousClass2Dl(r7), null, r3);
            } catch (Exception e) {
                this.A0P = false;
                Log.e("cameraview/take-picture failed", e);
                A08(1);
            }
        }
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        Log.i("cameraview/fallback-supported-preview-sizes");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Size(this.A07, 640, 480));
        return arrayList;
    }

    @Override // X.AnonymousClass2E6
    public String getFlashMode() {
        return this.A0J;
    }

    @Override // X.AnonymousClass2E6
    public synchronized List getFlashModes() {
        ArrayList arrayList = new ArrayList();
        Camera camera = this.A07;
        if (camera == null) {
            return arrayList;
        }
        try {
            List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (supportedFlashModes.contains("off")) {
                    arrayList.add("off");
                }
                if (supportedFlashModes.contains("on")) {
                    arrayList.add("on");
                }
                if (supportedFlashModes.contains("auto")) {
                    arrayList.add("auto");
                }
            }
            if (this.A0M) {
                if (!arrayList.contains("off")) {
                    arrayList.add("off");
                }
                if (!arrayList.contains("on")) {
                    arrayList.add("on");
                }
            }
            if (getStoredFlashModeCount() != arrayList.size()) {
                SharedPreferences.Editor edit = getSharedPreferences().edit();
                StringBuilder sb = new StringBuilder();
                sb.append("flash_mode_count");
                sb.append(this.A00);
                edit.putInt(sb.toString(), arrayList.size()).apply();
            }
            return arrayList;
        } catch (RuntimeException e) {
            Log.e("cameraview/getFlashModes ", e);
            return arrayList;
        }
    }

    @Override // X.AnonymousClass2E6
    public synchronized int getMaxZoom() {
        int i;
        i = 0;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i = parameters.getMaxZoom();
            }
        }
        return i;
    }

    @Override // X.AnonymousClass2E6
    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    @Override // X.AnonymousClass2E6
    public synchronized long getPictureResolution() {
        Camera camera = this.A07;
        long j = 0;
        if (camera == null) {
            return 0;
        }
        Camera.Size pictureSize = camera.getParameters().getPictureSize();
        if (pictureSize != null) {
            j = (long) (pictureSize.width * pictureSize.height);
        }
        return j;
    }

    private int getRequiredCameraRotation() {
        int i;
        int rotation = this.A0B.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i2 = 0;
        boolean z = false;
        if (cameraInfo.facing == 1) {
            z = true;
        }
        this.A0M = z;
        int i3 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (z) {
            i = ((i3 + i2) + 360) % 360;
        } else {
            i = ((i3 - i2) + 360) % 360;
        }
        AnonymousClass008.A1L(AnonymousClass008.A0U("cameraview/orientation display:", i2, " camera:", i3, " rotate:"), i);
        return i;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0V.A01(AnonymousClass020.A02);
    }

    @Override // X.AnonymousClass2E6
    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0S2 = AnonymousClass008.A0S("flash_mode_count");
        A0S2.append(this.A00);
        return sharedPreferences.getInt(A0S2.toString(), 0);
    }

    @Override // X.AnonymousClass2E6
    public synchronized long getVideoResolution() {
        Camera.Size size;
        size = this.A06;
        return size != null ? (long) (size.width * size.height) : 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0I.enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0A = handlerThread;
        handlerThread.start();
        this.A09 = new Handler(this.A0A.getLooper());
        if (this.A0N) {
            this.A0S.A02();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0I.disable();
        this.A0A.quit();
        this.A0A = null;
        this.A0S.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r1 == 2) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r8 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC50852Wi.onMeasure(int, int):void");
    }

    @Override // X.AnonymousClass2E6
    public void pause() {
        Log.d("cameraview/pause");
    }

    @Override // X.AnonymousClass2E6
    public void setCameraCallback(AnonymousClass2E5 r1) {
        this.A0H = r1;
    }

    @Override // X.AnonymousClass2E6
    public void setQrScanningEnabled(boolean z) {
        this.A0N = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r19, int r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC50852Wi.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!(this instanceof AnonymousClass27q)) {
            Log.d("cameraview/surface-created");
            this.A09.post(new RunnableEBaseShape8S0100000_I1_3(this, 10));
            return;
        }
        Log.d("bloks_camera/surface_created");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("cameraview/surface-destroyed");
        this.A09.post(new RunnableEBaseShape8S0100000_I1_3(this, 13));
        A04();
    }
}
