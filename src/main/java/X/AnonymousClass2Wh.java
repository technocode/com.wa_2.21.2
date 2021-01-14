package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Wh  reason: invalid class name */
public class AnonymousClass2Wh extends TextureView implements AnonymousClass2E6 {
    public static Boolean A0n;
    public static final int[] A0o = {2, 3, 4, 6, 8};
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public Rect A03;
    public SurfaceTexture A04;
    public CameraCaptureSession A05;
    public CameraCharacteristics A06;
    public CameraDevice A07;
    public CaptureRequest.Builder A08;
    public ImageReader A09;
    public ImageReader A0A;
    public MediaRecorder A0B;
    public Handler A0C;
    public HandlerThread A0D;
    public Size A0E;
    public Size A0F;
    public Size A0G;
    public Display A0H;
    public Surface A0I;
    public C18310t9 A0J;
    public C18330tB A0K;
    public C31591dU A0L;
    public AnonymousClass2E5 A0M;
    public AnonymousClass2WW A0N;
    public Float A0O;
    public Float A0P;
    public Integer A0Q;
    public String A0R;
    public String A0S = "off";
    public AtomicInteger A0T = new AtomicInteger(0);
    public AtomicInteger A0U = new AtomicInteger(2);
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int[] A0Y;
    public final CameraCaptureSession.CaptureCallback A0Z;
    public final CameraDevice.StateCallback A0a;
    public final TextureView.SurfaceTextureListener A0b;
    public final AnonymousClass2EN A0c;
    public final AnonymousClass2EQ A0d = new AnonymousClass2EQ();
    public final C50842Wg A0e;
    public final AnonymousClass2EY A0f;
    public final AnonymousClass03S A0g;
    public final AnonymousClass0L6 A0h = AnonymousClass0L6.A00();
    public final AnonymousClass022 A0i = AnonymousClass022.A00();
    public final C04600Kz A0j;
    public final C04600Kz A0k;
    public final AtomicBoolean A0l = new AtomicBoolean();
    public final AtomicBoolean A0m = new AtomicBoolean();

    @Override // X.AnonymousClass2E6
    public int getCameraApi() {
        return 1;
    }

    @Override // X.AnonymousClass2E6
    public int getCameraType() {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Wh(Context context) {
        super(context, null, 0);
        AnonymousClass03S r2 = null;
        this.A0g = !isInEditMode() ? AnonymousClass03S.A00() : r2;
        this.A0k = new C04600Kz(true);
        this.A0j = new C04600Kz(true);
        this.A0b = new AnonymousClass2EG(this);
        this.A0a = new AnonymousClass2EH(this);
        this.A0e = new C50842Wg(this);
        this.A0c = new AnonymousClass2EN(this);
        this.A0Z = new AnonymousClass2EI(this);
        SharedPreferences sharedPreferences = getSharedPreferences();
        String string = sharedPreferences.getString("camera_id", "");
        if (string != null) {
            this.A0R = string;
            this.A0V = sharedPreferences.getBoolean("camera_is_front", false);
            this.A0S = sharedPreferences.getString("flash_mode", "off");
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                this.A0H = windowManager.getDefaultDisplay();
                this.A0f = new AnonymousClass2EY(this.A0e, new AnonymousClass2WP(this));
                return;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ int A00(long j, Size size, Size size2) {
        return (Math.abs((((long) size.getWidth()) * ((long) size.getHeight())) - j) > Math.abs((((long) size2.getWidth()) * ((long) size2.getHeight())) - j) ? 1 : (Math.abs((((long) size.getWidth()) * ((long) size.getHeight())) - j) == Math.abs((((long) size2.getWidth()) * ((long) size2.getHeight())) - j) ? 0 : -1));
    }

    public static /* synthetic */ int A01(long j, Size size, Size size2) {
        return (Math.abs((((long) size.getWidth()) * ((long) size.getHeight())) - j) > Math.abs((((long) size2.getWidth()) * ((long) size2.getHeight())) - j) ? 1 : (Math.abs((((long) size.getWidth()) * ((long) size.getHeight())) - j) == Math.abs((((long) size2.getWidth()) * ((long) size2.getHeight())) - j) ? 0 : -1));
    }

    public static /* synthetic */ int A02(Size size, Size size2) {
        int height = size.getHeight() * size.getWidth();
        int height2 = size2.getHeight() * size2.getWidth();
        if (height == height2) {
            return 0;
        }
        return height < height2 ? -1 : 1;
    }

    public static /* synthetic */ int A03(Size size, Size size2) {
        int abs = Math.abs(size.getWidth() - 640);
        int abs2 = Math.abs(size2.getWidth() - 640);
        if (abs == abs2) {
            return 0;
        }
        return abs < abs2 ? -1 : 1;
    }

    public static Rect A04(RectF rectF, Rect rect) {
        Rect rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        int width = rect2.width();
        int height = rect2.height();
        int i = rect2.left;
        int i2 = rect.left;
        if (i < i2) {
            rect2.left = i2;
            rect2.right = i2 + width;
        }
        int i3 = rect2.right;
        int i4 = rect.right;
        if (i3 > i4) {
            rect2.right = i4;
            rect2.left = Math.max(0, i4 - width);
        }
        int i5 = rect2.top;
        int i6 = rect.top;
        if (i5 < i6) {
            rect2.top = i6;
            rect2.bottom = i6 + height;
        }
        int i7 = rect2.bottom;
        int i8 = rect.bottom;
        if (i7 > i8) {
            rect2.bottom = i8;
            rect2.top = Math.max(0, i8 - height);
        }
        return rect2;
    }

    public static String A05(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i == 1) {
            return "AUTO";
        }
        if (i == 2) {
            return "MACRO";
        }
        if (i == 3) {
            return "CONTINUOUS_VIDEO";
        }
        if (i != 4) {
            return i != 5 ? Integer.toString(i) : "EDOF";
        }
        return "CONTINUOUS_PICTURE";
    }

    public static String A06(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "OFF";
        }
        if (intValue == 1) {
            return "ON";
        }
        if (intValue == 2) {
            return "ON_AUTO_FLASH";
        }
        if (intValue == 3) {
            return "ON_ALWAYS_FLASH";
        }
        if (intValue != 4) {
            return intValue != 5 ? Integer.toString(intValue) : "ON_EXTERNAL_FLASH";
        }
        return "ON_AUTO_FLASH_REDEYE";
    }

    public static String A07(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "INACTIVE";
        }
        if (intValue == 1) {
            return "SEARCHING";
        }
        if (intValue == 2) {
            return "CONVERGED";
        }
        if (intValue == 3) {
            return "LOCKED";
        }
        if (intValue != 4) {
            return intValue != 5 ? num.toString() : "STATE_PRECAPTURE";
        }
        return "FLASH_REQUIRED";
    }

    public static String A08(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
                return "INACTIVE";
            case 1:
                return "PASSIVE_SCAN";
            case 2:
                return "PASSIVE_FOCUSED";
            case 3:
                return "ACTIVE_SCAN";
            case 4:
                return "FOCUSED_LOCKED";
            case 5:
                return "NOT_FOCUSED_LOCKED";
            case 6:
                return "PASSIVE_UNFOCUSED";
            default:
                return num.toString();
        }
    }

    public static String A09(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "UNAVAILABLE";
        }
        if (intValue == 1) {
            return "CHARGING";
        }
        if (intValue == 2) {
            return "READY";
        }
        if (intValue != 3) {
            return intValue != 4 ? num.toString() : "PARTIAL";
        }
        return "FIRED";
    }

    public static String A0A(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                return "DISABLED";
            case 1:
                return "FACE_PRIORITY";
            case 2:
                return "ACTION";
            case 3:
                return "PORTRAIT";
            case 4:
                return "LANDSCAPE";
            case 5:
                return "NIGHT";
            case 6:
                return "NIGHT_PORTRAIT";
            case 7:
                return "THEATRE";
            case 8:
                return "BEACH";
            case 9:
                return "SNOW";
            case 10:
                return "SUNSET";
            case 11:
                return "STEADYPHOTO";
            case 12:
                return "FIREWORKS";
            case 13:
                return "SPORTS";
            case 14:
                return "PARTY";
            case 15:
                return "CANDLELIGHT";
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return "BARCODE";
            case 17:
                return "HIGH_SPEED_VIDEO";
            case 18:
                return "HDR";
            default:
                return Integer.toString(intValue);
        }
    }

    public static String A0B(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            sb.append(size.getWidth());
            sb.append('x');
            sb.append(size.getHeight());
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static String A0C(int[] iArr, AnonymousClass2EO r5) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(r5.AQe(i));
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static /* synthetic */ void A0D(AnonymousClass2Wh r6, CameraCaptureSession cameraCaptureSession) {
        CaptureRequest.Builder builder;
        synchronized (r6) {
            Log.i("cameraview/on-configured-for-video");
            if (r6.A07 == null || r6.A0B == null || (builder = r6.A08) == null) {
                Log.i("cameraview/on-configured-for-video/camera-closed");
                r6.A0L();
                return;
            }
            r6.A05 = cameraCaptureSession;
            try {
                builder.set(CaptureRequest.CONTROL_MODE, 1);
                int[] iArr = r6.A0Y;
                if (iArr == null || !C002001d.A3h(iArr, 3)) {
                    r6.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
                } else {
                    r6.A08.set(CaptureRequest.CONTROL_AF_MODE, 3);
                }
                r6.A08.set(CaptureRequest.CONTROL_AE_MODE, 1);
                r6.A08.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                if (r6.A00 != 1.0f) {
                    r6.A08.set(CaptureRequest.SCALER_CROP_REGION, r6.getZoomRect());
                }
                r6.setStabilizationMode(r6.A08);
                int i = 0;
                if (r6.A0l.get()) {
                    String str = r6.A0S;
                    int hashCode = str.hashCode();
                    if (hashCode != 3551) {
                        if (hashCode != 109935) {
                            if (hashCode == 3005871 && str.equals("auto")) {
                                CaptureRequest.Builder builder2 = r6.A08;
                                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                                Integer num = r6.A0Q;
                                if (num != null && num.intValue() == 4) {
                                    i = 2;
                                }
                                builder2.set(key, Integer.valueOf(i));
                            }
                        } else if (str.equals("off")) {
                            r6.A08.set(CaptureRequest.FLASH_MODE, 0);
                        }
                    } else if (str.equals("on")) {
                        r6.A08.set(CaptureRequest.FLASH_MODE, 2);
                    }
                } else {
                    r6.A08.set(CaptureRequest.FLASH_MODE, 0);
                }
                r6.A05.setRepeatingRequest(r6.A08.build(), r6.A0Z, r6.A0C);
                try {
                    r6.A0B.start();
                } catch (RuntimeException e) {
                    Log.e("cameraview/start-video-capture failed", e);
                    r6.A0L();
                    r6.A0N(3);
                }
            } catch (CameraAccessException e2) {
                Log.e("cameraview/on-configured-for-video/configure-failed", e2);
                r6.A0L();
                r6.A0N(e2.getReason());
            }
        }
    }

    public static void A0E(AnonymousClass2Wh r3, Image image) {
        synchronized (r3) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/image-available ");
            sb.append(image.getWidth());
            sb.append("x");
            sb.append(image.getHeight());
            Log.i(sb.toString());
            byte[] A0X2 = r3.A0X(image);
            image.close();
            AnonymousClass2WW r1 = r3.A0N;
            if (r1 != null) {
                r1.A00(A0X2, r3.A0V);
                r3.A0N = null;
            } else {
                throw null;
            }
        }
    }

    public static boolean A0F(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    try {
                        if (A0G(cameraManager.getCameraCharacteristics(str))) {
                            return true;
                        }
                    } catch (AssertionError e) {
                        if ("Supported FPS ranges cannot be null.".equals(e.getMessage())) {
                            return false;
                        }
                        throw e;
                    } catch (RuntimeException unused) {
                        return false;
                    }
                }
            } catch (CameraAccessException e2) {
                Log.e("cameraview/camera2-supported", e2);
            }
            return false;
        }
        throw null;
    }

    public static boolean A0G(CameraCharacteristics cameraCharacteristics) {
        Number number;
        int intValue;
        Number number2;
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 23 && (number = (Number) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && (((intValue = number.intValue()) == 1 || intValue == 3) && (number2 = (Number) cameraCharacteristics.get(CameraCharacteristics.REQUEST_MAX_NUM_INPUT_STREAMS)) != null && number2.intValue() > 0 && (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) != null)) {
            for (int i : iArr) {
                if ((!"samsung".equals(Build.MANUFACTURER) && i == 4) || i == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0H(AnonymousClass2Wh r2, int i, boolean z) {
        boolean z2;
        synchronized (r2) {
            z2 = true;
            if (r2.A0N != null && (i == 1 || i == 6)) {
                if (z) {
                    if (r2.A0X) {
                    }
                }
            }
            z2 = false;
        }
        return z2;
    }

    public void A0I() {
        if (this.A04 == null || this.A0L == null || this.A0K == null || !this.A0m.get() || this.A0G == null) {
            Log.d("cameraview/draw-video-frame skipping after shutdown");
            return;
        }
        this.A04.updateTexImage();
        this.A0L.A00();
        GLES20.glViewport(0, 0, this.A0G.getWidth(), this.A0G.getHeight());
        this.A0K.A01(this.A02, C18340tC.A00);
        this.A0L.A01();
    }

    public final synchronized void A0J() {
        Log.i("cameraview/start-capture");
        if (this.A07 == null) {
            Log.e("cameraview/start-capture camera is null");
            return;
        }
        this.A0T.set(6);
        ImageReader pictureTakingImageReader = getPictureTakingImageReader();
        boolean z = false;
        if (pictureTakingImageReader != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        boolean z2 = false;
        if (this.A05 != null) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        boolean z3 = false;
        if (this.A08 != null) {
            z3 = true;
        }
        AnonymousClass00E.A07(z3);
        try {
            CaptureRequest.Builder createCaptureRequest = this.A07.createCaptureRequest(2);
            createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
            createCaptureRequest.addTarget(pictureTakingImageReader.getSurface());
            CaptureRequest build = this.A08.build();
            createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            createCaptureRequest.set(key, build.get(key));
            CaptureRequest.Key key2 = CaptureRequest.SCALER_CROP_REGION;
            createCaptureRequest.set(key2, build.get(key2));
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AF_REGIONS;
            createCaptureRequest.set(key3, build.get(key3));
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_REGIONS;
            createCaptureRequest.set(key4, build.get(key4));
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_MODE;
            createCaptureRequest.set(key5, build.get(key5));
            createCaptureRequest.setTag("capture");
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(getRequiredCameraRotation()));
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, (byte) 90);
            AnonymousClass2EL r3 = new AnonymousClass2EL();
            this.A05.stopRepeating();
            this.A05.capture(createCaptureRequest.build(), r3, null);
        } catch (CameraAccessException e) {
            Log.e("cameraview/capture", e);
            A0N(e.getReason());
        }
    }

    public final synchronized void A0K() {
        Log.i("cameraview/close-camera");
        this.A0f.A01();
        AnonymousClass2EQ r3 = this.A0d;
        synchronized (r3) {
            r3.A00 = false;
            r3.A01();
            r3.A03(null);
        }
        CameraCaptureSession cameraCaptureSession = this.A05;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A05 = null;
        }
        CameraDevice cameraDevice = this.A07;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.A07 = null;
        }
        Surface surface = this.A0I;
        if (surface != null) {
            surface.release();
            this.A0I = null;
        }
        ImageReader imageReader = this.A0A;
        if (imageReader != null) {
            imageReader.close();
            this.A0A = null;
        }
        ImageReader imageReader2 = this.A09;
        if (imageReader2 != null) {
            imageReader2.close();
            this.A09 = null;
        }
        A0L();
        this.A06 = null;
        this.A0l.set(false);
        this.A0Y = null;
        this.A0O = null;
        this.A01 = 0;
        this.A03 = null;
        this.A0P = null;
        this.A0F = null;
        this.A0Q = null;
        this.A08 = null;
        this.A00 = 1.0f;
        this.A0G = null;
        this.A0T.set(0);
    }

    public final synchronized void A0L() {
        MediaRecorder mediaRecorder = this.A0B;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A0B.release();
            this.A0B = null;
            this.A0m.set(false);
        }
        Surface surface = this.A0I;
        if (surface != null) {
            surface.release();
            this.A0I = null;
        }
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A04 = null;
        }
        C18330tB r1 = this.A0K;
        if (r1 != null) {
            if (r1.A00 != null) {
                r1.A00 = null;
            }
            this.A0K = null;
        }
        C31591dU r0 = this.A0L;
        if (r0 != null) {
            r0.A02();
            this.A0L = null;
        }
        C18310t9 r02 = this.A0J;
        if (r02 != null) {
            r02.A01();
            this.A0J = null;
        }
    }

    public final synchronized void A0M() {
        if (this.A07 == null) {
            Log.i("cameraview/create-preview camera already closed");
            return;
        }
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture == null) {
            Log.i("cameraview/create-preview no texture");
            A0N(3);
            return;
        }
        Size size = this.A0F;
        if (size == null) {
            Log.i("cameraview/create-preview preview size is null");
            A0N(3);
        } else if (A0V() && this.A0A == null) {
            Log.i("cameraview/create-preview yuv image reader is null");
            A0N(3);
        } else if (!(!this.A0X) || this.A09 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/create-camera-preview-session preview:");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(this.A0F.getHeight());
            Log.i(sb.toString());
            surfaceTexture.setDefaultBufferSize(this.A0F.getWidth(), this.A0F.getHeight());
            Surface surface = this.A0I;
            if (surface != null) {
                surface.release();
            }
            this.A0I = new Surface(surfaceTexture);
            try {
                ArrayList arrayList = new ArrayList();
                CameraDevice cameraDevice = this.A07;
                int i = 1;
                if (this.A0X) {
                    i = 5;
                }
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i);
                if (createCaptureRequest != null) {
                    this.A08 = createCaptureRequest;
                    createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
                    this.A08.addTarget(this.A0I);
                    arrayList.add(this.A0I);
                    if (A0V()) {
                        ImageReader imageReader = this.A0A;
                        if (imageReader != null) {
                            Surface surface2 = imageReader.getSurface();
                            this.A08.addTarget(surface2);
                            arrayList.add(surface2);
                        } else {
                            throw null;
                        }
                    }
                    if (!this.A0X) {
                        ImageReader imageReader2 = this.A09;
                        if (imageReader2 != null) {
                            arrayList.add(imageReader2.getSurface());
                        } else {
                            throw null;
                        }
                    }
                    this.A07.createCaptureSession(arrayList, new AnonymousClass2EK(this), this.A0C);
                    Log.i("cameraview/create-camera-preview-session/done");
                    return;
                }
                throw null;
            } catch (CameraAccessException e) {
                Log.e("cameraview/create-camera-preview-session", e);
                A0N(e.getReason());
            }
        } else {
            Log.i("cameraview/create-preview jpeg image reader is null");
            A0N(3);
        }
    }

    public final void A0N(int i) {
        AnonymousClass008.A0v("cameraview/on-error ", i);
        AnonymousClass2E5 r1 = this.A0M;
        if (r1 != null) {
            int i2 = 2;
            if (i != 2) {
                i2 = 1;
            }
            ((AnonymousClass2WY) r1).A02(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019a, code lost:
        if (r1 != 180) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0O(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 1634
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wh.A0O(int, int):void");
    }

    public final synchronized void A0P(int i, int i2, Size size) {
        float f;
        if (size != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/configure-transform view:");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append(" preview:");
            sb.append(size.getHeight());
            sb.append("x");
            sb.append(size.getWidth());
            Log.i(sb.toString());
            int rotation = this.A0H.getRotation();
            Matrix matrix = new Matrix();
            float f2 = (float) i;
            float f3 = (float) i2;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            if (1 == rotation || 3 == rotation) {
                RectF rectF2 = new RectF(0.0f, 0.0f, (float) size.getHeight(), (float) size.getWidth());
                rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                float min = Math.min(f3 / ((float) size.getHeight()), f2 / ((float) size.getWidth()));
                matrix.postScale(min, min, centerX, centerY);
                matrix.postRotate((float) ((rotation - 2) * 90), centerX, centerY);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cameraview/configure-transform scale:");
                sb2.append(min);
                Log.i(sb2.toString());
            } else {
                if (2 == rotation) {
                    matrix.postRotate(180.0f, centerX, centerY);
                }
                float width = f3 / ((float) size.getWidth());
                float height = f2 / ((float) size.getHeight());
                float f4 = 1.0f;
                if (width > height) {
                    f = height / width;
                } else {
                    f4 = width / height;
                    f = 1.0f;
                }
                matrix.postScale(f4, f, centerX, centerY);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cameraview/configure-transform scaleX:");
                sb3.append(f4);
                sb3.append(" scaleY:");
                sb3.append(f);
                Log.i(sb3.toString());
            }
            setTransform(matrix);
        }
    }

    public final synchronized void A0Q(CameraCaptureSession cameraCaptureSession) {
        Log.i("cameraview/on-configured-preview-session");
        if (this.A07 == null || this.A08 == null) {
            Log.i("cameraview/create-camera-preview-session/camera-closed");
            return;
        }
        this.A05 = cameraCaptureSession;
        try {
            this.A08.set(CaptureRequest.CONTROL_MODE, 1);
            if (this.A0Y == null || !C002001d.A3h(this.A0Y, 4)) {
                this.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
            } else {
                this.A08.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
            setFlash(this.A08);
            this.A0T.set(1);
            this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
            if (this.A0M != null) {
                ((AnonymousClass2WY) this.A0M).A00();
            }
        } catch (CameraAccessException e) {
            Log.e("cameraview/create-camera-preview-session/configure-failed", e);
            A0N(e.getReason());
        }
    }

    public final synchronized void A0R(CaptureResult captureResult) {
        if (this.A05 != null && this.A08 != null) {
            this.A0Q = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            int i = this.A0T.get();
            if (i == 2) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                StringBuilder sb = new StringBuilder();
                sb.append("cameraview/waiting-focus af-state:");
                sb.append(A08(num));
                sb.append(" ae-state:");
                sb.append(A07((Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)));
                Log.d(sb.toString());
                if (num != null && (4 == num.intValue() || 5 == num.intValue() || (num.intValue() == 0 && !A0W()))) {
                    boolean z = true;
                    this.A0T.set(1);
                    if (this.A0M != null) {
                        AnonymousClass2E5 r1 = this.A0M;
                        if (num.intValue() == 5) {
                            z = false;
                        }
                        ((AnonymousClass2WY) r1).A04(z);
                    }
                    try {
                        this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        this.A05.capture(this.A08.build(), this.A0Z, this.A0C);
                        this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
                    } catch (CameraAccessException e) {
                        A0N(e.getReason());
                    }
                }
            } else if (i == 3) {
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cameraview/waiting-lock af-state:");
                sb2.append(A08(num2));
                sb2.append(" ae-state:");
                sb2.append(A07(num3));
                sb2.append(" af-trigger:");
                sb2.append((Integer) captureResult.get(CaptureResult.CONTROL_AF_TRIGGER));
                Log.d(sb2.toString());
                if (this.A0k.A00() > 3000) {
                    Log.i("cameraview/waiting-lock-timeout");
                    A0U(num3);
                } else if (num2 != null && (num2.intValue() == 4 || num2.intValue() == 5 || (num2.intValue() == 0 && !A0W()))) {
                    A0U(num3);
                }
            } else if (i == 4) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cameraview/waiting-precapture af-state:");
                sb3.append(A08((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)));
                sb3.append(" ae-state:");
                sb3.append(A07(num4));
                sb3.append(" flash-state:");
                sb3.append(A09((Integer) captureResult.get(CaptureResult.FLASH_STATE)));
                sb3.append(" ae-lock:");
                sb3.append(captureResult.get(CaptureResult.CONTROL_AE_LOCK));
                Log.d(sb3.toString());
                if (num4 == null || num4.intValue() == 5) {
                    this.A0T.set(5);
                } else if (this.A0j.A00() > 3000) {
                    Log.i("cameraview/waiting-precapture-timeout");
                    A0J();
                }
            } else if (i == 5) {
                Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("cameraview/waiting-non-precapture af-state:");
                sb4.append(A08((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)));
                sb4.append(" ae-state:");
                sb4.append(A07(num5));
                sb4.append(" flash-state:");
                sb4.append(A09((Integer) captureResult.get(CaptureResult.FLASH_STATE)));
                sb4.append(" ae-lock:");
                sb4.append(captureResult.get(CaptureResult.CONTROL_AE_LOCK));
                Log.d(sb4.toString());
                if (num5 == null || num5.intValue() != 5 || this.A0j.A00() > 3000) {
                    if (this.A0j.A00() > 3000) {
                        Log.i("cameraview/waiting-non-precapture-timeout");
                    }
                    A0J();
                }
            } else if (i == 6) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("cameraview/taking-picture af-state:");
                sb5.append(A08((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)));
                sb5.append(" ae-state:");
                sb5.append(A07((Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)));
                sb5.append(" flash-state:");
                sb5.append(A09((Integer) captureResult.get(CaptureResult.FLASH_STATE)));
                sb5.append(" ae-lock:");
                sb5.append(captureResult.get(CaptureResult.CONTROL_AE_LOCK));
                Log.d(sb5.toString());
            }
        }
    }

    public /* synthetic */ void A0S(AnonymousClass1Fh r2) {
        AnonymousClass2E5 r0 = this.A0M;
        if (r0 != null) {
            ((AnonymousClass2WY) r0).A03(r2);
        }
    }

    public /* synthetic */ void A0T(AnonymousClass2WW r5) {
        synchronized (this) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.A0d.A03(new AnonymousClass2WQ(this, atomicBoolean, r5));
            if (!atomicBoolean.get()) {
                Log.i("cameraview/didnt-find-zsl-capture");
                this.A0N = r5;
            }
        }
    }

    public final synchronized void A0U(Integer num) {
        if (num != null) {
            if (!(num.intValue() == 2 || this.A0U.get() == 2 || this.A0U.get() == 0)) {
                Log.i("cameraview/start-precapture");
                boolean z = false;
                if (this.A05 != null) {
                    z = true;
                }
                AnonymousClass00E.A07(z);
                CaptureRequest.Builder builder = this.A08;
                boolean z2 = false;
                if (builder != null) {
                    z2 = true;
                }
                AnonymousClass00E.A07(z2);
                try {
                    builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    CameraCaptureSession cameraCaptureSession = this.A05;
                    CaptureRequest build = this.A08.build();
                    CameraCaptureSession.CaptureCallback captureCallback = this.A0Z;
                    cameraCaptureSession.capture(build, captureCallback, this.A0C);
                    CaptureRequest.Builder builder2 = this.A08;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                    builder2.set(key, 1);
                    this.A0T.set(4);
                    C04600Kz r2 = this.A0j;
                    r2.A01 = 0;
                    r2.A00 = 0;
                    r2.A03();
                    this.A05.capture(this.A08.build(), captureCallback, this.A0C);
                    this.A08.set(key, 0);
                } catch (CameraAccessException e) {
                    Log.e("cameraview/precapture", e);
                    A0N(e.getReason());
                }
            }
        }
        A0J();
    }

    public final boolean A0V() {
        if (this.A0X || (!this.A0V && this.A0W)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 <= 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0W() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Float r0 = r2.A0P     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            float r1 = r0.floatValue()     // Catch:{ all -> 0x0012 }
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            monitor-exit(r2)
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wh.A0W():boolean");
    }

    public final byte[] A0X(Image image) {
        int height;
        int width;
        if (image.getFormat() == 256) {
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            return bArr;
        } else if (image.getFormat() != 35) {
            return null;
        } else {
            int requiredCameraRotation = getRequiredCameraRotation();
            Image.Plane plane = image.getPlanes()[0];
            Image.Plane plane2 = image.getPlanes()[1];
            Image.Plane plane3 = image.getPlanes()[2];
            int height2 = (image.getHeight() * (image.getWidth() * 3)) >> 1;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(height2);
            VideoFrameConverter.convertAndroid420toNV21(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride(), image.getWidth(), image.getHeight(), requiredCameraRotation, allocateDirect);
            if (requiredCameraRotation % 180 == 0) {
                height = image.getWidth();
                width = image.getHeight();
            } else {
                height = image.getHeight();
                width = image.getWidth();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[height2];
            allocateDirect.get(bArr2);
            new YuvImage(bArr2, 17, height, width, null).compressToJpeg(new Rect(0, 0, height, width), 90, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // X.AnonymousClass2E6
    public void A2j() {
        this.A0f.A00();
    }

    @Override // X.AnonymousClass2E6
    public synchronized void A4K(float f, float f2) {
        CameraCharacteristics cameraCharacteristics;
        if (this.A05 != null && this.A08 != null && (cameraCharacteristics = this.A06) != null && this.A03 != null) {
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            Integer num2 = (Integer) this.A06.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/focus max-regions-af:");
            sb.append(num);
            sb.append(" max-regions-ae:");
            sb.append(num2);
            sb.append(" sensor-rect:");
            sb.append(this.A03);
            Log.i(sb.toString());
            if (this.A03 != null) {
                if ((num != null && num.intValue() != 0) || (num2 != null && num2.intValue() != 0)) {
                    float dimension = getContext().getResources().getDimension(R.dimen.autofocus_box_size);
                    float f3 = dimension / 2.0f;
                    RectF rectF = new RectF(f - f3, f2 - f3, f + f3, f2 + f3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cameraview/focus focus-area-size:");
                    sb2.append(dimension);
                    sb2.append(" touch-rect:");
                    sb2.append(rectF);
                    Log.d(sb2.toString());
                    int requiredCameraRotation = getRequiredCameraRotation();
                    Rect zoomRect = getZoomRect();
                    Rect rect = this.A03;
                    zoomRect.offset(rect.left, rect.top);
                    Matrix matrix = new Matrix();
                    float width = (float) getWidth();
                    float height = (float) getHeight();
                    matrix.postTranslate((float) (-zoomRect.centerX()), (float) (-zoomRect.centerY()));
                    matrix.postRotate((float) requiredCameraRotation);
                    if (requiredCameraRotation % 180 == 0) {
                        matrix.postScale(width / ((float) zoomRect.width()), height / ((float) zoomRect.height()));
                    } else {
                        matrix.postScale(width / ((float) zoomRect.height()), height / ((float) zoomRect.width()));
                    }
                    float f4 = 1.0f;
                    if (this.A0V) {
                        f4 = -1.0f;
                    }
                    matrix.postScale(f4, 1.0f);
                    matrix.postTranslate(width / 2.0f, height / 2.0f);
                    matrix.invert(matrix);
                    if (num != null && num.intValue() > 0) {
                        RectF rectF2 = new RectF();
                        matrix.mapRect(rectF2, rectF);
                        Rect A042 = A04(rectF2, zoomRect);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("cameraview/focus af-area:");
                        sb3.append(A042);
                        Log.i(sb3.toString());
                        this.A08.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(A042, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)});
                        this.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    if (num2 != null && num2.intValue() > 0) {
                        rectF.left -= f3;
                        rectF.top -= f3;
                        rectF.right += f3;
                        rectF.bottom += f3;
                        RectF rectF3 = new RectF();
                        matrix.mapRect(rectF3, rectF);
                        Rect A043 = A04(rectF3, zoomRect);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("cameraview/focus ae-area:");
                        sb4.append(A043);
                        Log.i(sb4.toString());
                        this.A08.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(A043, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)});
                    }
                    AnonymousClass2E5 r2 = this.A0M;
                    if (r2 != null) {
                        AnonymousClass2WY r22 = (AnonymousClass2WY) r2;
                        r22.A01.A0s.A02.post(new RunnableEBaseShape0S0100002_I1(r22, f, f2, 0));
                    }
                    this.A0T.set(2);
                    try {
                        this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
                    } catch (CameraAccessException e) {
                        Log.e("cameraview/focus", e);
                        A0N(e.getReason());
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public boolean AB5() {
        return this.A0V;
    }

    @Override // X.AnonymousClass2E6
    public boolean AB7() {
        int i = this.A0T.get();
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        AnonymousClass008.A1H("cameraview/is-in-peview ", z);
        return z;
    }

    @Override // X.AnonymousClass2E6
    public boolean ABT() {
        return this.A0m.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ("on".equals(r2.A0S) == false) goto L_0x0017;
     */
    @Override // X.AnonymousClass2E6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ACD() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0l
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0017
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r2.A0S
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "cameraview/need-fake-flash "
            X.AnonymousClass008.A1H(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wh.ACD():boolean");
    }

    @Override // X.AnonymousClass2E6
    public synchronized void ACO() {
        Log.i("cameraview/next-camera");
        boolean z = false;
        if (!this.A0V) {
            z = true;
        }
        this.A0V = z;
        A0K();
        A0O(getWidth(), getHeight());
    }

    @Override // X.AnonymousClass2E6
    public synchronized String ACP() {
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/next-flash-mode current:");
        sb.append(this.A0S);
        Log.i(sb.toString());
        if (this.A08 == null || this.A05 == null) {
            Log.i("cameraview/next-flash-mode/not-changing");
            return this.A0S;
        }
        List flashModes = getFlashModes();
        int indexOf = flashModes.indexOf(this.A0S);
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        this.A0S = (String) flashModes.get((indexOf + 1) % flashModes.size());
        setFlash(this.A08);
        try {
            this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
        } catch (CameraAccessException e) {
            Log.e("cameraview/next-flash", e);
            A0N(e.getReason());
        }
        getSharedPreferences().edit().putString("flash_mode", this.A0S).apply();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cameraview/next-flash-mode new:");
        sb2.append(this.A0S);
        Log.i(sb2.toString());
        return this.A0S;
    }

    @Override // X.AnonymousClass2E6
    public synchronized void AN4() {
        Log.i("cameraview/restart-preview");
        int i = this.A0T.get();
        if (i != 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/restart-preview state:");
            sb.append(i);
            Log.i(sb.toString());
            if (this.A0M != null) {
                ((AnonymousClass2WY) this.A0M).A00();
            }
            return;
        }
        boolean z = false;
        if (this.A08 == null || this.A05 == null || ((this.A0X && !this.A0V && this.A0A == null) || (!this.A0X && this.A09 == null))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cameraview/restart-preview ");
            boolean z2 = false;
            if (this.A08 == null) {
                z2 = true;
            }
            sb2.append(z2);
            sb2.append(" ");
            boolean z3 = false;
            if (this.A05 == null) {
                z3 = true;
            }
            sb2.append(z3);
            boolean z4 = false;
            if (this.A0A == null) {
                z4 = true;
            }
            sb2.append(z4);
            if (this.A09 == null) {
                z = true;
            }
            sb2.append(z);
            Log.i(sb2.toString());
            return;
        }
        try {
            this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            setFlash(this.A08);
            this.A05.capture(this.A08.build(), this.A0Z, this.A0C);
            this.A0T.set(1);
            this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            if (A0V()) {
                this.A08.addTarget(this.A0A.getSurface());
            }
            this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
            if (this.A0M != null) {
                ((AnonymousClass2WY) this.A0M).A00();
            }
        } catch (CameraAccessException e) {
            Log.e("cameraview/restart-preview", e);
        }
    }

    @Override // X.AnonymousClass2E6
    public void AN6() {
        Log.d("cameraview2/resume");
    }

    @Override // X.AnonymousClass2E6
    public synchronized int APS(int i) {
        Float f = this.A0O;
        if (f != null) {
            float floatValue = f.floatValue();
            if (!(floatValue < 1.0f || this.A03 == null || this.A08 == null || this.A05 == null)) {
                this.A00 = (((floatValue - 1.0f) * ((float) i)) / 1000.0f) + 1.0f;
                this.A08.set(CaptureRequest.SCALER_CROP_REGION, getZoomRect());
                this.A08.set(CaptureRequest.CONTROL_AF_REGIONS, null);
                this.A08.set(CaptureRequest.CONTROL_AE_REGIONS, null);
                try {
                    this.A05.setRepeatingRequest(this.A08.build(), this.A0Z, this.A0C);
                } catch (CameraAccessException e) {
                    Log.e("cameraview/zoom", e);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("cameraview/zoom:");
                sb.append(this.A00);
                Log.d(sb.toString());
                return (int) (this.A00 * 100.0f);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        if (r4 == null) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        if (r1.A02("android.permission.RECORD_AUDIO") != 0) goto L_0x0176;
     */
    @Override // X.AnonymousClass2E6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void AQ8(java.io.File r15, int r16) {
        /*
        // Method dump skipped, instructions count: 1110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wh.AQ8(java.io.File, int):void");
    }

    @Override // X.AnonymousClass2E6
    public synchronized void AQH() {
        Log.i("cameraview/stop-video-capture");
        MediaRecorder mediaRecorder = this.A0B;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (RuntimeException e) {
                Log.w("cameraview/stop-video-capture ", e);
            }
        }
        A0L();
        this.A0m.set(false);
        A0M();
    }

    @Override // X.AnonymousClass2E6
    public synchronized void AQS(AnonymousClass2WW r8, boolean z) {
        CaptureRequest.Builder builder;
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/take-picture last-ae-state:");
        sb.append(A07(this.A0Q));
        sb.append(" flash:");
        sb.append(this.A0S);
        Log.i(sb.toString());
        boolean z2 = true;
        if (this.A07 == null || !isAvailable() || !AB7() || this.A05 == null || (builder = this.A08) == null || getPictureTakingImageReader() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cameraview/take-picture failed state:");
            sb2.append(this.A0T);
            sb2.append(" ");
            boolean z3 = false;
            if (this.A07 == null) {
                z3 = true;
            }
            sb2.append(z3);
            sb2.append(" ");
            boolean z4 = false;
            if (!isAvailable()) {
                z4 = true;
            }
            sb2.append(z4);
            sb2.append(" ");
            boolean z5 = false;
            if (this.A0F == null) {
                z5 = true;
            }
            sb2.append(z5);
            sb2.append(" ");
            boolean z6 = false;
            if (this.A0G == null) {
                z6 = true;
            }
            sb2.append(z6);
            sb2.append(" ");
            if (this.A0B == null) {
                z2 = false;
            }
            sb2.append(z2);
            Log.e(sb2.toString());
            return;
        }
        if (!this.A0X || (((num = this.A0Q) != null && num.intValue() == 4 && "auto".equals(this.A0S)) || "on".equals(this.A0S))) {
            try {
                ImageReader imageReader = this.A0A;
                if (imageReader != null) {
                    builder.removeTarget(imageReader.getSurface());
                }
                ImageReader imageReader2 = this.A09;
                if (imageReader2 != null) {
                    this.A08.removeTarget(imageReader2.getSurface());
                }
                if (A0W()) {
                    this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    CameraCaptureSession cameraCaptureSession = this.A05;
                    CaptureRequest build = this.A08.build();
                    CameraCaptureSession.CaptureCallback captureCallback = this.A0Z;
                    cameraCaptureSession.setRepeatingRequest(build, captureCallback, this.A0C);
                    CaptureRequest.Builder builder2 = this.A08;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    builder2.set(key, 1);
                    this.A0T.set(3);
                    C04600Kz r2 = this.A0k;
                    r2.A01 = 0;
                    r2.A00 = 0;
                    r2.A03();
                    this.A05.capture(this.A08.build(), captureCallback, this.A0C);
                    this.A08.set(key, 0);
                } else {
                    A0U(this.A0Q);
                }
                this.A0N = r8;
            } catch (CameraAccessException e) {
                Log.e("cameraview/lock-focus", e);
                A0N(e.getReason());
            }
        } else {
            this.A0T.set(6);
            Handler handler = this.A0C;
            if (handler != null) {
                handler.post(new RunnableEBaseShape7S0200000_I1_2(this, r8, 7));
            } else {
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public String getFlashMode() {
        AnonymousClass008.A1U(AnonymousClass008.A0S("cameraview/get-flash-mode "), this.A0S);
        return this.A0S;
    }

    @Override // X.AnonymousClass2E6
    public List getFlashModes() {
        Log.i("cameraview/get-flash-modes");
        ArrayList arrayList = new ArrayList();
        arrayList.add("off");
        if (this.A0l.get()) {
            arrayList.add("auto");
            arrayList.add("on");
        } else if (this.A0V) {
            arrayList.add("on");
        }
        if (getStoredFlashModeCount() != arrayList.size()) {
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            StringBuilder A0S2 = AnonymousClass008.A0S("flash_mode_count");
            A0S2.append(this.A0R);
            edit.putInt(A0S2.toString(), arrayList.size()).apply();
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    @Override // X.AnonymousClass2E6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getMaxZoom() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Float r0 = r2.A0O     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            float r1 = r0.floatValue()     // Catch:{ all -> 0x0017 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            android.graphics.Rect r1 = r2.A03     // Catch:{ all -> 0x0017 }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wh.getMaxZoom():int");
    }

    @Override // X.AnonymousClass2E6
    public int getNumberOfCameras() {
        CameraManager cameraManager = (CameraManager) getContext().getSystemService("camera");
        if (cameraManager != null) {
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                StringBuilder sb = new StringBuilder();
                sb.append("cameraview/get-number-of-cameras ");
                int length = cameraIdList.length;
                sb.append(length);
                Log.i(sb.toString());
                return length;
            } catch (CameraAccessException e) {
                Log.e("cameraview/get-number-of-cameras-failed", e);
                return 0;
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass2E6
    public long getPictureResolution() {
        Size size = this.A0E;
        if (size == null) {
            return 0;
        }
        return (long) (this.A0E.getHeight() * size.getWidth());
    }

    private ImageReader getPictureTakingImageReader() {
        return this.A0X ? this.A0A : this.A09;
    }

    private synchronized int getRequiredCameraRotation() {
        int i;
        int i2;
        int rotation = this.A0H.getRotation();
        int i3 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (this.A0V) {
            i = this.A01;
            i2 = ((i + i3) + 360) % 360;
        } else {
            i = this.A01;
            i2 = ((i - i3) + 360) % 360;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/orientation display:");
        sb.append(i3);
        sb.append(" sensor:");
        sb.append(i);
        sb.append(" rotate:");
        sb.append(i2);
        Log.i(sb.toString());
        return i2;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0i.A01(AnonymousClass020.A02);
    }

    @Override // X.AnonymousClass2E6
    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0S2 = AnonymousClass008.A0S("flash_mode_count");
        A0S2.append(this.A0R);
        int i = sharedPreferences.getInt(A0S2.toString(), 0);
        StringBuilder A0S3 = AnonymousClass008.A0S("cameraview/stored-flash-mode-count for camera ");
        A0S3.append(this.A0R);
        A0S3.append(" is ");
        A0S3.append(i);
        Log.i(A0S3.toString());
        return i;
    }

    @Override // X.AnonymousClass2E6
    public long getVideoResolution() {
        Size size = this.A0G;
        if (size == null) {
            return 0;
        }
        return (long) (this.A0G.getHeight() * size.getWidth());
    }

    private synchronized Rect getZoomRect() {
        RectF rectF;
        float width;
        float height;
        boolean z = false;
        if (this.A03 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        rectF = new RectF();
        width = (float) this.A03.width();
        height = (float) this.A03.height();
        float f = this.A00;
        float f2 = width / 2.0f;
        float f3 = (width / f) / 2.0f;
        rectF.left = f2 - f3;
        rectF.right = f2 + f3;
        float f4 = height / 2.0f;
        float f5 = (height / f) / 2.0f;
        rectF.top = f4 - f5;
        rectF.bottom = f4 + f5;
        return A04(rectF, new Rect(0, 0, (int) width, (int) height));
    }

    public synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/on-attached-to-window/is-available:");
        sb.append(isAvailable());
        Log.i(sb.toString());
        HandlerThread handlerThread = new HandlerThread("Camera2");
        this.A0D = handlerThread;
        handlerThread.start();
        this.A0C = new Handler(this.A0D.getLooper());
    }

    public synchronized void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("cameraview/on-detached-from-window");
        A0K();
        setSurfaceTextureListener(null);
        HandlerThread handlerThread = this.A0D;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.A0D.join();
                this.A0D = null;
                this.A0C = null;
            } catch (InterruptedException e) {
                Log.e("cameraview/stop-background-thread", e);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        StringBuilder A0S2 = AnonymousClass008.A0S("cameraview/on-measure measured:");
        A0S2.append(getMeasuredWidth());
        A0S2.append("x");
        A0S2.append(getMeasuredHeight());
        Log.i(A0S2.toString());
    }

    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (view == this) {
            AnonymousClass008.A0v("cameraview/on-visibility-changed ", i);
            if (i == 0) {
                synchronized (this) {
                    z = false;
                    if (this.A06 != null) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                if (isAvailable()) {
                    A0O(getWidth(), getHeight());
                } else {
                    setSurfaceTextureListener(this.A0b);
                }
            } else {
                A0K();
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public void pause() {
        Log.d("cameraview2/pause");
    }

    @Override // X.AnonymousClass2E6
    public synchronized void setCameraCallback(AnonymousClass2E5 r2) {
        this.A0M = r2;
    }

    private synchronized void setFlash(CaptureRequest.Builder builder) {
        if (this.A0l.get()) {
            String str = this.A0S;
            int hashCode = str.hashCode();
            if (hashCode != 3551) {
                if (hashCode != 109935) {
                    if (hashCode == 3005871 && str.equals("auto")) {
                        builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    }
                } else if (str.equals("off")) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                }
            } else if (str.equals("on")) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            }
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        builder.set(CaptureRequest.FLASH_MODE, 0);
    }

    @Override // X.AnonymousClass2E6
    public void setQrScanningEnabled(boolean z) {
        this.A0W = z;
    }

    private synchronized void setStabilizationMode(CaptureRequest.Builder builder) {
        CameraCharacteristics cameraCharacteristics = this.A06;
        if (cameraCharacteristics == null) {
            Log.w("cameraview/set-stabilization-mode camera characteristics is null");
            return;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    Log.i("cameraview/using-optical-stabilization");
                    return;
                }
            }
        }
        int[] iArr2 = (int[]) this.A06.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    Log.i("cameraview/using-video-stabilization");
                    return;
                }
            }
        }
    }
}
