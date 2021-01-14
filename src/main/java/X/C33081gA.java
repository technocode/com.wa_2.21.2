package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1gA  reason: invalid class name and case insensitive filesystem */
public class C33081gA implements AbstractC21080y9 {
    public static final Camera.ShutterCallback A0d = new C21280yU();
    public static volatile C33081gA A0e;
    public int A00;
    public int A01;
    public Matrix A02;
    public C21060y6 A03;
    public C33021g4 A04;
    public C21390yf A05;
    public AnonymousClass0VV A06;
    public C07050Vs A07;
    public AnonymousClass104 A08;
    public UUID A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final Camera.ErrorCallback A0F = new C21230yP(this);
    public final C21120yD A0G = new C21120yD();
    public final C21120yD A0H = new C21120yD();
    public final AbstractC21150yG A0I = new C33061g8(this);
    public final AbstractC21160yH A0J = new C33071g9(this);
    public final C21380ye A0K;
    public final C33091gB A0L;
    public final C21430yj A0M;
    public final C33101gC A0N;
    public final C21490yp A0O;
    public final C21950zb A0P;
    public final C22150zx A0Q;
    public final C22170zz A0R;
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public volatile int A0V;
    public volatile Camera A0W;
    public volatile C32451ey A0X;
    public volatile C22080zo A0Y;
    public volatile FutureTask A0Z;
    public volatile boolean A0a;
    public volatile boolean A0b;
    public volatile boolean A0c;

    public static int A00(int i) {
        if (i == 1) {
            return 90;
        }
        if (i != 2) {
            return i != 3 ? 0 : 270;
        }
        return 180;
    }

    public C33081gA(C22170zz r5, C22150zx r6, Context context) {
        this.A0R = r5;
        this.A0Q = r6;
        this.A0K = new C21380ye(r5);
        this.A0P = new C21950zb();
        this.A0M = new C21430yj();
        this.A0O = new C21490yp(this.A0P, this.A0R);
        this.A0L = new C33091gB(this.A0R, this.A0P);
        this.A0E = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        this.A0N = new C33101gC();
    }

    public static C21960zc A01(C33081gA r18, C33021g4 r19, C21060y6 r20, C32451ey r21, int i) {
        C21170yI A012;
        if (!AnonymousClass100.A01()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (r18.A0W != null) {
                AtomicBoolean atomicBoolean = r18.A0S;
                if (!atomicBoolean.get() || !r20.equals(r18.A03) || r18.A0X != r21 || r18.A00 != i) {
                    r18.A04 = r19;
                    r18.A03 = r20;
                    r18.A0X = r21;
                    r18.A0M.A00(r18.A0W, false);
                    C33021g4 r1 = r18.A04;
                    EnumC21400yg r13 = r1.A02;
                    EnumC21400yg r0 = r1.A03;
                    int i2 = r20.A01;
                    int i3 = r20.A00;
                    C32371eq r4 = r1.A00;
                    r18.A00 = i;
                    int A052 = r18.A05(i);
                    EnumC21400yg r12 = EnumC21400yg.DEACTIVATED;
                    C21950zb r2 = r18.A0P;
                    AnonymousClass0VO A013 = r2.A01(r18.A06);
                    boolean equals = r0.equals(r12);
                    if (equals || r13.equals(r12)) {
                        if (equals) {
                            if (!r13.equals(r12)) {
                                A012 = r4.A01((List) A013.A00(AnonymousClass0VO.A0Z), null, (List) A013.A00(AnonymousClass0VO.A0d), i2, i3);
                            }
                        } else if (r13.equals(r12)) {
                            A012 = r4.A01(null, (List) A013.A00(AnonymousClass0VO.A0f), (List) A013.A00(AnonymousClass0VO.A0d), i2, i3);
                        }
                        A012 = r4.A01(null, null, (List) A013.A00(AnonymousClass0VO.A0d), i2, i3);
                    } else {
                        A012 = r4.A01((List) A013.A00(AnonymousClass0VO.A0Z), (List) A013.A00(AnonymousClass0VO.A0f), (List) A013.A00(AnonymousClass0VO.A0d), i2, i3);
                    }
                    C33331gZ A002 = r2.A00(r18.A06);
                    C07070Vu r42 = A012.A00;
                    if (r42 == null && A012.A01 == null) {
                        throw new RuntimeException("SizeSetter returned null sizes!");
                    }
                    if (r42 != null) {
                        ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0Z, r42);
                    }
                    C07070Vu r43 = A012.A01;
                    if (r43 != null) {
                        ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0e, r43);
                    }
                    C07070Vu r44 = A012.A02;
                    if (r44 != null) {
                        ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0i, r44);
                    }
                    A002.A01();
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A00, 3);
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0j, 1);
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0b, C33011g3.A00((List) A002.A00.A00(AnonymousClass0VO.A0b)));
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0g, 0);
                    AnonymousClass0VV r5 = r18.A06;
                    AnonymousClass0VO A014 = r2.A01(r5);
                    if (!((Boolean) A014.A00(AnonymousClass0VO.A0I)).booleanValue() || r18.A04 != null) {
                        AnonymousClass0VP r7 = AnonymousClass0VN.A0f;
                        if (r18.A04 != null) {
                            ((AbstractC22030zj) A002).A00.A01(r7, Boolean.FALSE);
                            if (r18.A04 != null) {
                                A002.A00();
                                C33101gC r72 = r18.A0N;
                                r72.A01(r18.A0W);
                                SparseArray sparseArray = r2.A01;
                                r5.A01();
                                AnonymousClass0VN r6 = (AnonymousClass0VN) sparseArray.get(r5.mCameraId);
                                AnonymousClass0VP r132 = AnonymousClass0VN.A0e;
                                C07070Vu r02 = (C07070Vu) r6.A00(r132);
                                int i4 = r02.A01;
                                int i5 = r02.A00;
                                AnonymousClass0VP r122 = AnonymousClass0VN.A0a;
                                ((Number) r6.A00(r122)).intValue();
                                r5.A01();
                                SurfaceTexture A003 = r21.A00(i4, i5, r18.A0V, A00(r18.A00));
                                if (A003 != null) {
                                    r18.A0W.setPreviewTexture(A003);
                                } else {
                                    r18.A0W.setPreviewDisplay(null);
                                }
                                if (C32451ey.A0E) {
                                    r18.A0W.setDisplayOrientation(r18.A05(0));
                                } else {
                                    r18.A0W.setDisplayOrientation(A052);
                                }
                                r18.A0C = ((Boolean) A014.A00(AnonymousClass0VO.A0H)).booleanValue();
                                atomicBoolean.set(true);
                                r18.A0T.set(false);
                                r18.A0c = ((Boolean) A014.A00(AnonymousClass0VO.A0J)).booleanValue();
                                C21490yp r8 = r18.A0O;
                                Camera camera = r18.A0W;
                                AnonymousClass0VV r10 = r18.A06;
                                r8.A02 = camera;
                                r8.A03 = r10;
                                C21950zb r3 = r8.A06;
                                SparseArray sparseArray2 = r3.A00;
                                r10.A01();
                                AnonymousClass0VO r14 = (AnonymousClass0VO) sparseArray2.get(r10.mCameraId);
                                r8.A0A = (List) r14.A00(AnonymousClass0VO.A0h);
                                r8.A0D = ((Boolean) r14.A00(AnonymousClass0VO.A0D)).booleanValue();
                                SparseArray sparseArray3 = r3.A01;
                                r10.A01();
                                r8.A09 = ((Number) ((AnonymousClass0VN) sparseArray3.get(r10.mCameraId)).A00(AnonymousClass0VN.A0k)).intValue();
                                r10.A01();
                                r8.A00 = ((Number) ((AnonymousClass0VO) sparseArray2.get(r10.mCameraId)).A00(AnonymousClass0VO.A0N)).intValue();
                                r8.A02.setZoomChangeListener(r8);
                                r8.A0B = true;
                                C33091gB r102 = r18.A0L;
                                Camera camera2 = r18.A0W;
                                AnonymousClass0VV r82 = r18.A06;
                                r102.A05.A04("The FocusController must be prepared on the Optic thread.");
                                ((C21420yi) r102).A00 = camera2;
                                r102.A03 = r82;
                                r102.A08 = true;
                                r102.A07 = false;
                                r102.A06 = false;
                                r102.A00 = true;
                                r102.A01 = false;
                                r18.A0D(i4, i5);
                                r72.A02(r18.A0W, (C07070Vu) r6.A00(r132), ((Number) r6.A00(r122)).intValue());
                                r18.A0A();
                                C22120zu.A00().A01 = 0;
                                StringBuilder A0S2 = AnonymousClass008.A0S("time to setPreviewSurfaceTexture:");
                                A0S2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                                A0S2.append("ms");
                                Log.d("Camera1Device", A0S2.toString());
                                return new C21960zc(r5, A014, r6);
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                if (r18.A0M.A02.A01()) {
                    r18.A0A();
                }
                return new C21960zc(r18.A06, r18.A5B(), r18.A06());
            }
            throw new RuntimeException("Can't connect to the camera service.");
        }
        throw new RuntimeException("initialiseCamera should not run on the UI thread");
    }

    public static void A02(C33081gA r4) {
        C32451ey r1;
        if (r4 != null) {
            try {
                if (r4.A0b) {
                    r4.A0B();
                }
                if (r4.A0W != null) {
                    r4.A08();
                    r4.A0N.A00();
                }
                if (r4.A0X != null) {
                    r1 = r4.A0X;
                    if (r4.A0X == null) {
                        throw null;
                    }
                    r1.A01();
                }
            } catch (RuntimeException e) {
                Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
                if (r4.A0W != null) {
                    r4.A08();
                    r4.A0N.A00();
                }
                if (r4.A0X != null) {
                    r1 = r4.A0X;
                    if (r4.A0X == null) {
                        throw null;
                    }
                }
            } catch (Throwable th) {
                if (r4.A0W != null) {
                    r4.A08();
                    r4.A0N.A00();
                }
                if (r4.A0X != null) {
                    C32451ey r12 = r4.A0X;
                    if (r4.A0X != null) {
                        r12.A01();
                    } else {
                        throw null;
                    }
                }
                r4.A0X = null;
                throw th;
            }
            r4.A0X = null;
            return;
        }
        throw null;
    }

    public static void A03(C33081gA r4, AnonymousClass0VV r5, C21060y6 r6) {
        if (AnonymousClass100.A01()) {
            throw new RuntimeException("Should not check for open camera on the UI thread.");
        } else if (r4.A0W == null || r4.A06 != r5) {
            r4.A08();
            C22120zu A002 = C22120zu.A00();
            if (A002 != null) {
                A002.A00 = SystemClock.elapsedRealtime();
                r5.A01();
                r4.A0W = (Camera) r4.A0R.A02(new AnonymousClass0yM(r4, r5.mCameraId), "open_camera_on_camera_handler_thread");
                if (r4.A0W != null) {
                    r4.A06 = r5;
                    r4.A0W.setErrorCallback(r4.A0F);
                    r4.A03 = r6;
                    C21950zb r1 = r4.A0P;
                    Camera camera = r4.A0W;
                    if (r1 == null) {
                        throw null;
                    } else if (camera != null) {
                        r5.A01();
                        int i = r5.mCameraId;
                        Camera.Parameters parameters = camera.getParameters();
                        C33351gb r3 = new C33351gb(parameters);
                        r1.A00.put(i, r3);
                        C33361gc r2 = new C33361gc(parameters, r3);
                        r1.A01.put(i, r2);
                        r1.A02.put(i, new C33331gZ(camera, parameters, r3, r2));
                    } else {
                        throw new NullPointerException("camera is null!");
                    }
                } else {
                    throw new IllegalArgumentException("Camera is null.");
                }
            } else {
                throw null;
            }
        }
    }

    public static void A04(C33081gA r1, boolean z) {
        if (r1 == null) {
            throw null;
        } else if (AnonymousClass100.A01()) {
            throw new RuntimeException("Performing post photo capture on UI thread");
        } else if (r1.isConnected()) {
            if (z) {
                r1.A0A();
            }
            r1.A0U.set(false);
        }
    }

    public final int A05(int i) {
        AnonymousClass0VV r0 = this.A06;
        if (r0 != null) {
            r0.A01();
            Camera.CameraInfo cameraInfo = r0.mCameraInfo;
            if (cameraInfo == null) {
                cameraInfo = AnonymousClass0VV.A00;
            }
            int A002 = A00(i);
            int i2 = cameraInfo.facing;
            int i3 = cameraInfo.orientation;
            if (i2 == 1) {
                return (360 - ((i3 + A002) % 360)) % 360;
            }
            return ((i3 - A002) + 360) % 360;
        }
        throw new C21100yB("No current camera to get orientation for");
    }

    public AnonymousClass0VN A06() {
        if (isConnected()) {
            return this.A0P.A02(this.A06);
        }
        throw new C21100yB("Cannot get camera settings");
    }

    public final void A07() {
        C21430yj r1 = this.A0M;
        r1.A00.A00();
        r1.A01.A00();
        ((C21420yi) this.A0L).A01 = null;
        this.A0O.A05.A00();
        this.A0H.A00();
    }

    public final void A08() {
        if (this.A0W != null) {
            A0C();
            this.A0S.set(false);
            this.A0T.set(false);
            Camera camera = this.A0W;
            this.A0W = null;
            C21490yp r2 = this.A0O;
            if (r2.A0B) {
                Handler handler = r2.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                r2.A0A = null;
                r2.A02.setZoomChangeListener(null);
                r2.A02 = null;
                r2.A0B = false;
            }
            C33091gB r22 = this.A0L;
            r22.A05.A04("The FocusController must be released on the Optic thread.");
            r22.A08 = false;
            ((C21420yi) r22).A00 = null;
            r22.A03 = null;
            r22.A07 = false;
            r22.A06 = false;
            this.A0c = false;
            C21950zb r23 = this.A0P;
            AnonymousClass0VV r0 = this.A06;
            if (r23 != null) {
                r0.A01();
                r23.A02.remove(r0.mCameraId);
                this.A0R.A02(new CallableC21210yN(this, camera), "close_camera_on_camera_handler_thread");
                return;
            }
            throw null;
        }
    }

    public final void A09() {
        AtomicBoolean atomicBoolean = this.A0U;
        synchronized (atomicBoolean) {
            this.A0a = true;
            atomicBoolean.notify();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0A() {
        if (isConnected()) {
            A1q(this.A0I);
            C21430yj r0 = this.A0M;
            Camera camera = this.A0W;
            C21460ym r3 = r0.A02;
            ReentrantLock reentrantLock = r3.A01;
            reentrantLock.lock();
            if (camera != null) {
                try {
                    if (!r3.A00()) {
                        reentrantLock.lock();
                        try {
                            boolean z = true;
                            if ((r3.A00 & 1) != 1) {
                                z = false;
                            }
                            if (!z) {
                                reentrantLock.lock();
                                try {
                                    if (r3.A01()) {
                                        r3.A00 = 1;
                                        reentrantLock.unlock();
                                        camera.startPreview();
                                    } else {
                                        throw new IllegalStateException("Cannot progress to STARTING, not in STOPPED state");
                                    }
                                } catch (Throwable th) {
                                    reentrantLock.unlock();
                                    throw th;
                                }
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            reentrantLock.unlock();
        }
    }

    public final void A0B() {
        try {
            AnonymousClass104 r0 = this.A08;
            if (r0 != null) {
                r0.AQI();
                this.A08 = null;
            }
        } finally {
            if (this.A0W != null) {
                this.A0W.lock();
                C33331gZ A002 = this.A0P.A00(this.A06);
                ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A09, Integer.valueOf(this.A01));
                ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0P, Boolean.valueOf(this.A0A));
                A002.A01();
                A002.A00();
            }
            this.A0b = false;
        }
    }

    public final synchronized void A0C() {
        FutureTask futureTask = this.A0Z;
        if (futureTask != null) {
            this.A0R.A07(futureTask);
            this.A0Z = null;
        }
    }

    public final void A0D(int i, int i2) {
        Matrix matrix = new Matrix();
        this.A02 = matrix;
        float f = 1.0f;
        if (this.A06.equals(AnonymousClass0VV.FRONT)) {
            f = -1.0f;
        }
        matrix.setScale(f, 1.0f);
        int A052 = A05(this.A00);
        this.A02.postRotate((float) A052);
        if (A052 == 90 || A052 == 270) {
            float f2 = (float) i2;
            float f3 = (float) i;
            this.A02.postScale(f2 / 2000.0f, f3 / 2000.0f);
            this.A02.postTranslate(f2 / 2.0f, f3 / 2.0f);
            return;
        }
        float f4 = (float) i;
        float f5 = (float) i2;
        this.A02.postScale(f4 / 2000.0f, f5 / 2000.0f);
        this.A02.postTranslate(f4 / 2.0f, f5 / 2.0f);
    }

    @Override // X.AbstractC21080y9
    public void A1q(AbstractC21150yG r7) {
        if (r7 != null) {
            C33101gC r5 = this.A0N;
            synchronized (r5) {
                r5.A05.A01(r7);
            }
            C22170zz r2 = this.A0R;
            if (r2.A08()) {
                if (isConnected()) {
                    Camera camera = this.A0W;
                    C21950zb r3 = this.A0P;
                    r5.A02(camera, (C07070Vu) r3.A02(this.A06).A00(AnonymousClass0VN.A0e), ((Number) r3.A02(this.A06).A00(AnonymousClass0VN.A0a)).intValue());
                }
            } else if (isConnected()) {
                r2.A06(new CallableC21220yO(this), "enable_preview_frame_listeners");
            }
        } else {
            throw new IllegalArgumentException("listener is required");
        }
    }

    @Override // X.AbstractC21080y9
    public void A1r(C32401et r4) {
        C21430yj r2 = this.A0M;
        if (r2.A02.A00()) {
            if (0 != 0) {
                AnonymousClass100.A00(new RunnableEBaseShape5S0100000_I1_0(r4));
            } else {
                r4.A00();
            }
        }
        r2.A00.A01(r4);
    }

    @Override // X.AbstractC21080y9
    public void A2y(String str, AnonymousClass0VV r12, C33021g4 r13, C21060y6 r14, C32451ey r15, int i, AbstractC22090zp r17, AnonymousClass101 r18, AbstractC33031g5 r19) {
        if (0 != 0) {
            throw null;
        }
        C22100zr.A00 = SystemClock.elapsedRealtime();
        C22100zr.A00();
        if (this.A0D) {
            this.A09 = this.A0Q.A00(str, this.A0R.A00);
        }
        this.A0R.A01(new CallableC21180yJ(this, r15, r12, r14, r13, i), "connect", r19);
    }

    @Override // X.AbstractC21080y9
    public void A3l(AbstractC33031g5 r4) {
        A09();
        this.A0U.set(false);
        A07();
        if (this.A0D) {
            this.A0Q.A02(this.A09);
            this.A09 = null;
        }
        this.A0R.A01(new CallableC21190yK(this), "disconnect", r4);
    }

    @Override // X.AbstractC21080y9
    public void A4J(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0E;
        rect.inset(i3, i3);
        this.A0R.A01(new CallableC21260yS(this, rect), "focus", new AnonymousClass255(this));
    }

    @Override // X.AbstractC21080y9
    public AnonymousClass0VV A58() {
        return this.A06;
    }

    @Override // X.AbstractC21080y9
    public AnonymousClass0VO A5B() {
        if (isConnected()) {
            return this.A0P.A01(this.A06);
        }
        throw new C21100yB("Cannot get camera capabilities");
    }

    @Override // X.AbstractC21080y9
    public int AA0() {
        C21490yp r1 = this.A0O;
        if (r1.A0B) {
            return r1.A09;
        }
        return 0;
    }

    @Override // X.AbstractC21080y9
    public boolean AAF(AnonymousClass0VV r2) {
        try {
            r2.A01();
            return r2.mIsPresent;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // X.AbstractC21080y9
    public void AAl(int i, int i2, AnonymousClass0VV r10, Matrix matrix) {
        C21390yf r1 = new C21390yf(r10, A05(this.A00), i, i2, matrix);
        this.A05 = r1;
        this.A0L.A02 = r1;
    }

    @Override // X.AbstractC21080y9
    public boolean ABU() {
        return this.A0b;
    }

    @Override // X.AbstractC21080y9
    public boolean ABb() {
        return AAF(AnonymousClass0VV.BACK) && AAF(AnonymousClass0VV.FRONT);
    }

    @Override // X.AbstractC21080y9
    public boolean ABt(float[] fArr) {
        Matrix matrix;
        C21390yf r0 = this.A05;
        if (r0 == null || (matrix = r0.A00) == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.AbstractC21080y9
    public void AC9(C22020zi r4, AbstractC33031g5 r5) {
        this.A0R.A01(new CallableC21200yL(this, r4), "modify_settings", r5);
    }

    @Override // X.AbstractC21080y9
    public void AI9(int i) {
        this.A0V = i;
        C32451ey r1 = this.A0X;
        if (r1 != null) {
            r1.A00 = this.A0V;
        }
    }

    @Override // X.AbstractC21080y9
    public void AMf(AbstractC21150yG r4) {
        if (r4 != null) {
            C33101gC r1 = this.A0N;
            synchronized (r1) {
                r1.A07.remove(r4);
                r1.A05.A02(r4);
            }
            if (this.A0Q.A04) {
                this.A0R.A06(new CallableC21240yQ(this), "disable_preview_frame_listeners");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("listener is required");
    }

    @Override // X.AbstractC21080y9
    public void AMg(C32401et r2) {
        this.A0M.A00.A02(r2);
    }

    @Override // X.AbstractC21080y9
    public void AOG(AbstractC21140yF r2) {
        ((C21420yi) this.A0L).A01 = r2;
    }

    @Override // X.AbstractC21080y9
    public void AOh(C32391es r3) {
        C22150zx r0 = this.A0Q;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    @Override // X.AbstractC21080y9
    public void AOt(int i, AbstractC33031g5 r5) {
        this.A0R.A01(new CallableC21300yW(this, i), "set_rotation", r5);
    }

    @Override // X.AbstractC21080y9
    public void APT(int i, AbstractC33031g5 r6) {
        this.A0R.A01(new CallableC21290yV(this, i), "set_zoom_level", null);
    }

    @Override // X.AbstractC21080y9
    public boolean APW(int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        float f;
        matrix.reset();
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        int A052 = A05(this.A00);
        if (A052 == 90 || A052 == 270) {
            i4 = i3;
            i3 = i4;
        }
        float f5 = (float) i3;
        float f6 = (float) i4;
        float f7 = f5 / f6;
        if (!z ? f7 <= f4 : f7 > f4) {
            f = f3 / f6;
        } else {
            f = f2 / f5;
        }
        matrix.setScale((f5 / f2) * f, (f6 / f3) * f, (float) (i >> 1), (float) (i2 >> 1));
        return true;
    }

    @Override // X.AbstractC21080y9
    public void AQ0(int i, int i2, AbstractC33031g5 r6) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0E;
        rect.inset(i3, i3);
        this.A0R.A01(new CallableC21250yR(this, rect), "spot_meter", r6);
    }

    @Override // X.AbstractC21080y9
    public void AQB(File file, AbstractC33031g5 r7) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw new RuntimeException("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        } else if (!isConnected()) {
            r7.A00(new RuntimeException("Can't record video before it's initialised."));
        } else if (0 != 0) {
            throw null;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0b = true;
            this.A0R.A01(new CallableC21360yc(this, absolutePath, elapsedRealtime), "start_video", new AnonymousClass257(this, r7));
        }
    }

    @Override // X.AbstractC21080y9
    public void AQJ(boolean z, AbstractC33031g5 r5) {
        if (!this.A0b) {
            r5.A00(new RuntimeException("Not recording video"));
        } else if (0 != 0) {
            throw null;
        } else {
            this.A0R.A01(new CallableC21370yd(this, z, SystemClock.elapsedRealtime()), "stop_video_recording", r5);
        }
    }

    @Override // X.AbstractC21080y9
    public void AQP(AbstractC33031g5 r4) {
        if (!this.A0U.get()) {
            if (0 != 0) {
                throw null;
            }
            C22100zr.A00 = SystemClock.elapsedRealtime();
            C22100zr.A00();
            this.A0R.A01(new CallableC21310yX(this), "switch_camera", r4);
        }
    }

    @Override // X.AbstractC21080y9
    public void AQR(boolean z, boolean z2, C32421ev r7) {
        if (!isConnected()) {
            r7.A00(new C21100yB("Cannot take a photo"));
            return;
        }
        AtomicBoolean atomicBoolean = this.A0U;
        if (atomicBoolean.get()) {
            r7.A00(new C21090yA("Busy taking photo"));
        } else if (!this.A0b || this.A0C) {
            C22120zu A002 = C22120zu.A00();
            if (A002 != null) {
                A002.A02 = SystemClock.elapsedRealtime();
                ((Number) A06().A00(AnonymousClass0VN.A0X)).intValue();
                if (0 != 0) {
                    throw null;
                }
                C22100zr.A00 = SystemClock.elapsedRealtime();
                C22100zr.A00();
                atomicBoolean.set(true);
                this.A0a = false;
                this.A0R.A01(new CallableC21330yZ(this, r7, z, z2), "take_photo", new AnonymousClass256(this, r7, z2));
                return;
            }
            throw null;
        } else {
            r7.A00(new C21090yA("Cannot take a photo while recording video"));
        }
    }

    @Override // X.AbstractC21080y9
    public boolean isConnected() {
        if (this.A0W != null) {
            return this.A0S.get() || this.A0T.get();
        }
        return false;
    }
}
