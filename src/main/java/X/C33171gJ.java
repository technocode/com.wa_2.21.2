package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Surface;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.1gJ  reason: invalid class name and case insensitive filesystem */
public class C33171gJ implements AbstractC21080y9 {
    public static final Map A0n;
    public static volatile C33171gJ A0o;
    public int A00;
    public int A01;
    public Matrix A02;
    public Matrix A03;
    public Rect A04;
    public CaptureRequest.Builder A05;
    public C21060y6 A06;
    public C33021g4 A07;
    public C07070Vu A08;
    public C07070Vu A09;
    public C33321gY A0A;
    public AnonymousClass0VM A0B;
    public C33341ga A0C;
    public AnonymousClass0VO A0D;
    public AnonymousClass0VV A0E;
    public UUID A0F;
    public FutureTask A0G;
    public boolean A0H = true;
    public boolean A0I = true;
    public boolean A0J;
    public final int A0K;
    public final CameraManager A0L;
    public final C21120yD A0M = new C21120yD();
    public final C21120yD A0N = new C21120yD();
    public final AbstractC21160yH A0O = new C33151gH(this);
    public final C33111gD A0P = new C33111gD(this);
    public final C33131gF A0Q = new C33131gF(this);
    public final C33141gG A0R = new C33141gG(this);
    public final C33161gI A0S = new C33161gI();
    public final AnonymousClass0z3 A0T;
    public final C21660z7 A0U;
    public final C21710zC A0V;
    public final C21780zJ A0W;
    public final C21810zM A0X;
    public final C21850zQ A0Y;
    public final C21860zR A0Z;
    public final C22150zx A0a;
    public final C22170zz A0b;
    public final Object A0c = new Object();
    public final Callable A0d = new CallableC21590yz(this);
    public volatile int A0e;
    public volatile CameraDevice A0f;
    public volatile C32451ey A0g;
    public volatile C33251gR A0h;
    public volatile C22080zo A0i;
    public volatile boolean A0j;
    public volatile boolean A0k;
    public volatile boolean A0l;
    public volatile boolean A0m;

    static {
        HashMap hashMap = new HashMap();
        A0n = hashMap;
        hashMap.put(0, 0);
        Map map = A0n;
        map.put(1, 90);
        map.put(2, 180);
        map.put(3, 270);
    }

    public C33171gJ(C22170zz r5, C22150zx r6, Context context) {
        this.A0b = r5;
        this.A0a = r6;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.A0L = cameraManager;
        C22170zz r2 = this.A0b;
        this.A0T = new AnonymousClass0z3(cameraManager, r2);
        this.A0Z = new C21860zR();
        this.A0V = new C21710zC(r2, this.A0a);
        this.A0Y = new C21850zQ(r2);
        this.A0K = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        C22170zz r1 = this.A0b;
        this.A0U = new C21660z7(r1);
        C21810zM r22 = new C21810zM(r1);
        this.A0X = r22;
        this.A0W = new C21780zJ(this.A0b, r22);
    }

    public static void A00(C33171gJ r7, int i, String str) {
        List list = r7.A0M.A00;
        UUID uuid = r7.A0a.A03;
        r7.A0b.A05(uuid, new RunnableEBaseShape0S1311000_I1(r7, list, i, str, true, uuid, 1));
    }

    public static void A01(C33171gJ r13, String str) {
        C22170zz r3 = r13.A0b;
        r3.A04("Method openCamera() must run on the Optic Background Thread.");
        if (r13.A0f != null) {
            if (!r13.A0f.getId().equals(str)) {
                r13.A05();
            } else {
                return;
            }
        }
        C21780zJ r6 = r13.A0W;
        r6.A0O.clear();
        r13.A0f = (CameraDevice) r3.A03(new CallableC21580yy(r13, str, new C33261gS(r13.A0P, r13.A0Q)), "open_camera_on_camera_handler_thread");
        CameraManager cameraManager = r13.A0L;
        CameraCharacteristics A002 = AnonymousClass0VQ.A00(str, cameraManager);
        r13.A0E = r13.A0T.A00(str);
        C33181gK r0 = new C33181gK(A002);
        r13.A0D = r0;
        AnonymousClass0VM r1 = new AnonymousClass0VM(r0);
        r13.A0B = r1;
        r13.A0C = new C33341ga(r1);
        r13.A01 = ((Number) A002.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        Rect rect = (Rect) A002.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        r13.A04 = rect;
        C21860zR r5 = r13.A0Z;
        AnonymousClass0VO r7 = r13.A0D;
        AnonymousClass0VM r12 = r13.A0B;
        C33341ga r02 = r13.A0C;
        r5.A04 = r7;
        r5.A02 = r12;
        r5.A03 = r02;
        r5.A01 = rect;
        r5.A00 = new Rect(0, 0, rect.width(), rect.height());
        r5.A05 = (List) r7.A00(AnonymousClass0VO.A0h);
        if (str == null) {
            throw new C21620z2("Camera ID must be provided to setup camera params.");
        } else if (r13.A06 != null) {
            C33021g4 r2 = r13.A07;
            if (r2 != null) {
                AnonymousClass0VO r14 = r13.A0D;
                if (r14 == null) {
                    throw new IllegalStateException("Trying to setup camera params without a Capabilities.");
                } else if (r13.A0B == null || r13.A0C == null) {
                    throw new IllegalStateException("Trying to setup camera params without instantiating CameraSettings.");
                } else if (r13.A0A != null) {
                    List list = (List) r13.A0D.A00(AnonymousClass0VO.A0Z);
                    List list2 = (List) r13.A0D.A00(AnonymousClass0VO.A0f);
                    C21060y6 r03 = r13.A06;
                    int i = r03.A01;
                    int i2 = r03.A00;
                    r13.A03();
                    C21170yI A012 = r2.A00.A01(list, list2, (List) r14.A00(AnonymousClass0VO.A0d), i, i2);
                    C07070Vu r72 = A012.A01;
                    if (r72 != null) {
                        C07070Vu r22 = A012.A00;
                        if (r22 != null) {
                            r13.A08 = r72;
                            C33341ga r4 = r13.A0C;
                            ((AbstractC22030zj) r4).A00.A01(AnonymousClass0VN.A0e, r72);
                            AnonymousClass0VP r11 = AnonymousClass0VN.A0Z;
                            ((AbstractC22030zj) r4).A00.A01(r11, r22);
                            AnonymousClass0VP r23 = AnonymousClass0VN.A0i;
                            C07070Vu r15 = A012.A02;
                            if (r15 == null) {
                                r15 = r72;
                            }
                            ((AbstractC22030zj) r4).A00.A01(r23, r15);
                            AnonymousClass0VP r24 = AnonymousClass0VN.A0I;
                            if (r13.A0A != null) {
                                ((AbstractC22030zj) r4).A00.A01(r24, Boolean.FALSE);
                                ((AbstractC22030zj) r4).A00.A01(AnonymousClass0VN.A0O, Boolean.valueOf(r13.A0j));
                                r4.A00();
                                C21660z7 r10 = r13.A0U;
                                C33121gE r8 = new C33121gE(r13);
                                CameraDevice cameraDevice = r13.A0f;
                                AnonymousClass0VO r42 = r13.A0D;
                                AnonymousClass0VM r25 = r13.A0B;
                                C21630z4 r16 = r10.A09;
                                r16.A01("Can only prepare the FocusController on the Optic thread.");
                                r10.A03 = r8;
                                r10.A01 = cameraManager;
                                r10.A00 = cameraDevice;
                                r10.A07 = r42;
                                r10.A06 = r25;
                                r10.A05 = r5;
                                r10.A04 = r6;
                                r16.A02(true, "Failed to prepare FocusController.");
                                C21850zQ r9 = r13.A0Y;
                                CameraDevice cameraDevice2 = r13.A0f;
                                AnonymousClass0VO r32 = r13.A0D;
                                AnonymousClass0VM r26 = r13.A0B;
                                C33021g4 r04 = r13.A07;
                                C21630z4 r17 = r9.A08;
                                r17.A01("Can prepare only on the Optic thread");
                                r9.A0A = cameraDevice2;
                                r9.A05 = r32;
                                r9.A04 = r26;
                                r9.A01 = r04;
                                r9.A03 = r6;
                                r9.A02 = r10;
                                r17.A02(true, "Failed to prepare VideoCaptureController.");
                                C21710zC r43 = r13.A0V;
                                CameraDevice cameraDevice3 = r13.A0f;
                                AnonymousClass0VO r18 = r13.A0D;
                                AnonymousClass0VM r05 = r13.A0B;
                                C21630z4 r33 = r43.A09;
                                r33.A01("Can prepare only on the Optic thread");
                                r43.A00 = cameraDevice3;
                                r43.A07 = r18;
                                r43.A06 = r05;
                                r43.A04 = r9;
                                r43.A05 = r5;
                                r43.A03 = r6;
                                r43.A02 = r10;
                                C07070Vu r06 = (C07070Vu) r05.A00(r11);
                                if (r06 != null) {
                                    r43.A01 = ImageReader.newInstance(r06.A01, r06.A00, 256, 1);
                                    r33.A02(true, "Failed to prepare PhotoCaptureController.");
                                    return;
                                }
                                throw new C21620z2("Invalid picture size");
                            }
                            throw null;
                        }
                        throw new RuntimeException("Invalid picture size: 'null'");
                    }
                    throw new RuntimeException("Invalid preview size: 'null'");
                } else {
                    throw new IllegalStateException("Trying to setup camera params without instantiating PreviewSetupDelegate.");
                }
            } else {
                throw new IllegalStateException("Trying to setup camera params without a StartupSettings.");
            }
        } else {
            throw new IllegalStateException("Trying to setup camera params without a CameraDeviceConfig.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014e, code lost:
        if ((!r8.A06.A00.isEmpty()) != false) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C33171gJ r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 1122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33171gJ.A02(X.1gJ, java.lang.String):void");
    }

    public int A03() {
        Number number = (Number) A0n.get(Integer.valueOf(this.A00));
        if (number != null) {
            return ((this.A01 - number.intValue()) + 360) % 360;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Invalid display rotation value: ");
        A0S2.append(this.A00);
        throw new IllegalArgumentException(A0S2.toString());
    }

    public AnonymousClass0VN A04() {
        AnonymousClass0VM r0;
        if (isConnected() && (r0 = this.A0B) != null) {
            return r0;
        }
        throw new C21100yB("Cannot get camera settings");
    }

    public final void A05() {
        this.A0b.A04("Method closeCamera() must run on the Optic Background Thread.");
        C21850zQ r5 = this.A0Y;
        if (r5.A0C && (!this.A0m || r5.A0B)) {
            r5.A00();
        }
        A06();
        C21660z7 r2 = this.A0U;
        r2.A09.A02(false, "Failed to release PreviewController.");
        r2.A03 = null;
        r2.A01 = null;
        r2.A00 = null;
        r2.A07 = null;
        r2.A06 = null;
        r2.A05 = null;
        r2.A04 = null;
        C21710zC r22 = this.A0V;
        r22.A09.A02(false, "Failed to release PhotoCaptureController.");
        r22.A00 = null;
        r22.A07 = null;
        r22.A06 = null;
        r22.A04 = null;
        r22.A05 = null;
        r22.A03 = null;
        r22.A02 = null;
        ImageReader imageReader = r22.A01;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            r22.A01.close();
            r22.A01 = null;
        }
        r5.A08.A02(false, "Failed to release VideoCaptureController.");
        r5.A0A = null;
        r5.A05 = null;
        r5.A04 = null;
        r5.A01 = null;
        r5.A03 = null;
        r5.A02 = null;
        if (this.A0f != null) {
            C33161gI r23 = this.A0S;
            r23.A00 = this.A0f.getId();
            r23.A02(0);
            this.A0f.close();
            r23.A00();
        }
        this.A0W.A0O.clear();
    }

    public final void A06() {
        C21780zJ r2;
        C22170zz r5 = this.A0b;
        r5.A04("Method stopCameraPreview() must run on the Optic Background Thread.");
        synchronized (C21780zJ.A0R) {
            r2 = this.A0W;
            r2.A0I.A02(false, "Failed to release PreviewController.");
            r2.A0P = false;
            C21810zM r1 = r2.A0J;
            ImageReader imageReader = r1.A01;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, null);
                r1.A01.close();
                r1.A01 = null;
            }
            Image image = r1.A00;
            if (image != null) {
                image.close();
                r1.A00 = null;
            }
            r1.A03 = null;
            r1.A02 = null;
            C33251gR r0 = r2.A08;
            if (r0 != null) {
                r0.A0E = false;
                r2.A08 = null;
            }
            if (r2.A09 != null) {
                r2.A09 = null;
            }
            Surface surface = r2.A05;
            if (surface != null) {
                surface.release();
                r2.A05 = null;
            }
            CameraCaptureSession cameraCaptureSession = r2.A00;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                r2.A00 = null;
            }
            r2.A06 = null;
            r2.A03 = null;
            r2.A0F = null;
            r2.A0E = null;
            r2.A02 = null;
            r2.A0A = null;
            r2.A0B = null;
            r2.A07 = null;
            r2.A0C = null;
            r2.A01 = null;
            synchronized (this.A0c) {
                FutureTask futureTask = this.A0G;
                if (futureTask != null) {
                    r5.A07(futureTask);
                    this.A0G = null;
                }
            }
            this.A0h = null;
            this.A05 = null;
            this.A09 = null;
            this.A0V.A0B = false;
        }
        if (!r2.A0H.A00.isEmpty()) {
            AnonymousClass100.A00(new RunnableEBaseShape5S0100000_I1_0(r2, 34));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r4 == 180) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (r4 == 180) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r2 = r2 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33171gJ.A07():void");
    }

    @Override // X.AbstractC21080y9
    public void A1q(AbstractC21150yG r4) {
        if (r4 != null) {
            C21120yD r2 = this.A0X.A06;
            boolean z = !(!r2.A00.isEmpty());
            boolean A012 = r2.A01(r4);
            if (z && A012) {
                this.A0b.A06(new CallableC21570yx(this), "restart_preview_to_resume_cpu_frames");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewFrameListener.");
    }

    @Override // X.AbstractC21080y9
    public void A1r(C32401et r3) {
        if (r3 != null) {
            this.A0W.A0G.A01(r3);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStartedListener.");
    }

    @Override // X.AbstractC21080y9
    public void A2y(String str, AnonymousClass0VV r12, C33021g4 r13, C21060y6 r14, C32451ey r15, int i, AbstractC22090zp r17, AnonymousClass101 r18, AbstractC33031g5 r19) {
        if (0 != 0) {
            throw null;
        }
        C22100zr.A00 = SystemClock.elapsedRealtime();
        C22100zr.A00();
        if (this.A0J) {
            this.A0F = this.A0a.A00(str, this.A0b.A00);
        }
        this.A0b.A01(new CallableC21600z0(this, r15, r14, r13, i, r12), "connect", r19);
    }

    @Override // X.AbstractC21080y9
    public void A3l(AbstractC33031g5 r4) {
        C21780zJ r1 = this.A0W;
        r1.A0G.A00();
        r1.A0H.A00();
        this.A0X.A06.A00();
        this.A0N.A00();
        this.A0j = false;
        if (this.A0J) {
            this.A0a.A02(this.A0F);
            this.A0F = null;
        }
        this.A0b.A01(new CallableC21610z1(this), "disconnect", r4);
    }

    @Override // X.AbstractC21080y9
    public void A4J(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0K;
        rect.inset(i3, i3);
        this.A0b.A01(new CallableC21550yv(this, rect), "focus", new AnonymousClass259(this));
    }

    @Override // X.AbstractC21080y9
    public AnonymousClass0VV A58() {
        return this.A0E;
    }

    @Override // X.AbstractC21080y9
    public AnonymousClass0VO A5B() {
        AnonymousClass0VO r0;
        if (isConnected() && (r0 = this.A0D) != null) {
            return r0;
        }
        throw new C21100yB("Cannot get camera capabilities");
    }

    @Override // X.AbstractC21080y9
    public int AA0() {
        return this.A0Z.A00();
    }

    @Override // X.AbstractC21080y9
    public boolean AAF(AnonymousClass0VV r3) {
        try {
            return this.A0T.A01(r3) != null;
        } catch (C21620z2 unused) {
        }
    }

    @Override // X.AbstractC21080y9
    public void AAl(int i, int i2, AnonymousClass0VV r13, Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        Rect rect = this.A04;
        if (rect == null) {
            rect = (Rect) AnonymousClass0VQ.A00(this.A0T.A01(r13), this.A0L).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A032 = A03();
        if (A032 == 90 || A032 == 270) {
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A0E == AnonymousClass0VV.FRONT) {
            f = -1.0f;
        }
        matrix2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A032 / 90);
        Matrix matrix3 = new Matrix();
        for (int i3 = 0; i3 < abs; i3++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A03 = matrix2;
    }

    @Override // X.AbstractC21080y9
    public boolean ABU() {
        return this.A0Y.A0C;
    }

    @Override // X.AbstractC21080y9
    public boolean ABb() {
        return AAF(AnonymousClass0VV.BACK) && AAF(AnonymousClass0VV.FRONT);
    }

    @Override // X.AbstractC21080y9
    public boolean ABt(float[] fArr) {
        Matrix matrix = this.A03;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.AbstractC21080y9
    public void AC9(C22020zi r4, AbstractC33031g5 r5) {
        this.A0b.A01(new CallableC21530yt(this, r4), "modify_settings_on_background_thread", r5);
    }

    @Override // X.AbstractC21080y9
    public void AI9(int i) {
        this.A0e = i;
        C32451ey r1 = this.A0g;
        if (r1 != null) {
            r1.A00 = this.A0e;
        }
    }

    @Override // X.AbstractC21080y9
    public void AMf(AbstractC21150yG r7) {
        if (r7 != null) {
            C21120yD r1 = this.A0X.A06;
            if (r1.A02(r7) && !(!r1.A00.isEmpty())) {
                synchronized (this.A0c) {
                    C22170zz r4 = this.A0b;
                    r4.A07(this.A0G);
                    this.A0G = r4.A00(this.A0d, "restart_preview_if_to_stop_cpu_frames", 200);
                }
            }
        }
    }

    @Override // X.AbstractC21080y9
    public void AMg(C32401et r2) {
        if (r2 != null) {
            this.A0W.A0G.A02(r2);
        }
    }

    @Override // X.AbstractC21080y9
    public void AOG(AbstractC21140yF r2) {
        this.A0U.A02 = r2;
    }

    @Override // X.AbstractC21080y9
    public void AOh(C32391es r3) {
        C22150zx r0 = this.A0a;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    @Override // X.AbstractC21080y9
    public void AOt(int i, AbstractC33031g5 r5) {
        this.A00 = i;
        this.A0b.A01(new CallableC21520ys(this), "set_rotation", r5);
    }

    @Override // X.AbstractC21080y9
    public void APT(int i, AbstractC33031g5 r6) {
        this.A0b.A01(new CallableC21560yw(this, i), "set_zoom_level", null);
    }

    @Override // X.AbstractC21080y9
    public boolean APW(int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        RectF rectF;
        float min;
        if (this.A08 != null) {
            matrix.reset();
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
            int i5 = this.A01;
            if (i5 == 0 || i5 == 180) {
                rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
            } else {
                rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i3);
            }
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (!rectF2.equals(rectF)) {
                rectF.offset(centerX - rectF.centerX(), centerY - rectF.centerY());
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                float max = ((float) Math.max(i, i2)) / ((float) Math.max(i3, i4));
                float min2 = ((float) Math.min(i, i2)) / ((float) Math.min(i3, i4));
                if (z) {
                    min = Math.max(max, min2);
                } else {
                    min = Math.min(max, min2);
                }
                matrix.postScale(min, min, centerX, centerY);
            }
            int i6 = this.A00;
            if (i6 == 1 || i6 == 3) {
                matrix.postRotate((float) ((i6 - 2) * 90), centerX, centerY);
                return true;
            }
            if (i6 == 2) {
                matrix.postRotate(180.0f, centerX, centerY);
            }
            return true;
        }
        throw new IllegalStateException("Camera params need to be configured before invoking setupViewTransformMatrix()");
    }

    @Override // X.AbstractC21080y9
    public void AQ0(int i, int i2, AbstractC33031g5 r6) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0K;
        rect.inset(i3, i3);
        this.A0b.A01(new CallableC21540yu(this, rect), "spot_meter", r6);
    }

    @Override // X.AbstractC21080y9
    public void AQB(File file, AbstractC33031g5 r22) {
        C07070Vu r7;
        C21850zQ r5 = this.A0Y;
        String absolutePath = file.getAbsolutePath();
        AnonymousClass0VV r8 = this.A0E;
        int i = this.A0e;
        C32451ey r10 = this.A0g;
        AbstractC21160yH r11 = this.A0O;
        CaptureRequest.Builder builder = this.A05;
        boolean z = !this.A0X.A06.A00.isEmpty();
        C33251gR r13 = this.A0h;
        C21780zJ r1 = r5.A03;
        if (r1 == null || !r1.A0P || r5.A04 == null) {
            r22.A00(new IllegalStateException("Cannot start recording video, camera is not ready or has been closed."));
        } else if (r5.A0C) {
            r22.A00(new IllegalStateException("Cannot start recording video, there is a video already being recorded"));
        } else if (0 != 0) {
            throw null;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass0VM r12 = r5.A04;
            AnonymousClass0VP r4 = AnonymousClass0VN.A0i;
            if (r12.A00(r4) != null) {
                r7 = (C07070Vu) r5.A04.A00(r4);
            } else {
                r7 = (C07070Vu) r5.A04.A00(AnonymousClass0VN.A0e);
            }
            if (absolutePath == null) {
                r22.A00(new IllegalArgumentException("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            r5.A0C = true;
            r5.A0B = false;
            r5.A09.A01(new CallableC21820zN(r5, absolutePath, r7, r8, i, r10, r11, builder, r13, elapsedRealtime), "start_video_recording", new AnonymousClass25B(r5, r22, builder, r13, z));
        }
    }

    @Override // X.AbstractC21080y9
    public void AQJ(boolean z, AbstractC33031g5 r12) {
        C21850zQ r3 = this.A0Y;
        CaptureRequest.Builder builder = this.A05;
        boolean z2 = !this.A0X.A06.A00.isEmpty();
        C33251gR r6 = this.A0h;
        if (!r3.A0C) {
            r12.A00(new IllegalStateException("Not recording video."));
        } else if (0 != 0) {
            throw null;
        } else {
            r3.A09.A01(new CallableC21840zP(r3, builder, z, r6, z2, SystemClock.elapsedRealtime()), "stop_video_capture", r12);
        }
    }

    @Override // X.AbstractC21080y9
    public void AQP(AbstractC33031g5 r4) {
        if (0 != 0) {
            throw null;
        }
        C22100zr.A00 = SystemClock.elapsedRealtime();
        C22100zr.A00();
        this.A0b.A01(new CallableC21510yr(this), "switch_camera", r4);
    }

    @Override // X.AbstractC21080y9
    public void AQR(boolean z, boolean z2, C32421ev r19) {
        int i;
        C21780zJ r0;
        C21710zC r5 = this.A0V;
        CameraManager cameraManager = this.A0L;
        AnonymousClass0VV r8 = this.A0E;
        int i2 = (((this.A0e + 45) / 90) * 90) % 360;
        if (this.A0E == AnonymousClass0VV.FRONT) {
            i = ((this.A01 - i2) + 360) % 360;
        } else {
            i = (this.A01 + i2) % 360;
        }
        int A032 = A03();
        CaptureRequest.Builder builder = this.A05;
        C33321gY r12 = this.A0A;
        boolean z3 = !this.A0X.A06.A00.isEmpty();
        C33251gR r14 = this.A0h;
        if (r5.A00 == null || (r0 = r5.A03) == null || !r0.A0P) {
            r5.A0A.A05(r5.A08.A03, new RunnableEBaseShape5S0200000_I1_0(r19, new C21620z2("Camera not ready to take photo.")));
        } else if (r5.A0B) {
            r5.A0A.A05(r5.A08.A03, new RunnableEBaseShape5S0200000_I1_0(r19, new C21620z2("Cannot take photo, another capture in progress.")));
        } else if (r5.A04.A0C) {
            r5.A0A.A05(r5.A08.A03, new RunnableEBaseShape5S0200000_I1_0(r19, new C21620z2("Cannot take photo, video recording in progress.")));
        } else {
            ((Number) r5.A06.A00(AnonymousClass0VN.A0X)).intValue();
            if (0 != 0) {
                throw null;
            }
            C22100zr.A00 = SystemClock.elapsedRealtime();
            C22100zr.A00();
            r5.A0B = true;
            r5.A02.A00();
            r5.A0A.A01(new CallableC21680z9(r5, z2, cameraManager, r8, i, A032, builder, r12, z3, r14, r19), "take_photo", new AnonymousClass25A(r5, r19));
        }
    }

    @Override // X.AbstractC21080y9
    public boolean isConnected() {
        if (this.A0f != null) {
            return this.A0k || this.A0l;
        }
        return false;
    }
}
