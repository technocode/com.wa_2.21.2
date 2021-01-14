package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1eH  reason: invalid class name and case insensitive filesystem */
public class C32061eH extends FrameLayout implements AbstractC19050uL, AbstractC19460v4, AbstractC19280ul, AbstractC19400ux {
    public static final double A0q = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public Context A0L;
    public C32031eE A0M;
    public C19130uW A0N;
    public AbstractC19160uZ A0O;
    public AbstractC19210ue A0P;
    public AbstractC19230ug A0Q;
    public C19270uk A0R;
    public RunnableC19290um A0S;
    public C19410uy A0T;
    public AbstractC19560vE A0U;
    public EnumSet A0V;
    public Queue A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c = false;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final BroadcastReceiver A0i;
    public final ComponentCallbacks A0j;
    public final Matrix A0k;
    public final Matrix A0l;
    public final RectF A0m;
    public final C19060uM A0n = new C19060uM(this);
    public final float[] A0o;
    public final float[] A0p;

    public C32061eH(Context context, C19130uW r5) {
        super(context);
        new Paint(2);
        this.A0m = new RectF();
        this.A0k = new Matrix();
        this.A0l = new Matrix();
        this.A0o = new float[2];
        this.A0p = new float[4];
        this.A02 = 0.5d;
        this.A03 = 0.5d;
        this.A0I = SystemClock.uptimeMillis();
        this.A0U = AbstractC19560vE.A00;
        this.A0j = new ComponentCallbacksC19170ua(this);
        this.A0i = new C19180ub(this);
        this.A0H = System.nanoTime();
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = r5;
        C19410uy r1 = new C19410uy(context, this);
        this.A0T = r1;
        r1.A0L = this.A0l;
        r1.A0A = 0.87f;
        r1.A07 = 0.85f;
        this.A0a = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0h = true;
        RunnableC19290um r12 = new RunnableC19290um(this, this);
        this.A0S = r12;
        r12.A06 = this.A0l;
        C19470v5.A0A.add(new WeakReference(this));
        C19470v5.A00();
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    public double A01(double d, long j) {
        double d2 = this.A01 * (((double) this.A0J) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A0H == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r5 = this;
            X.1eE r2 = r5.A0M
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x000b
            X.1eY r1 = r2.A0H
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.1ea r1 = r2.A0U
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0018
            r1.A01(r4)
        L_0x0018:
            boolean r0 = r5.A0Y
            if (r0 != 0) goto L_0x0033
            android.content.Context r1 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0j
            r1.registerComponentCallbacks(r0)
            android.content.Context r3 = r5.A0L
            android.content.BroadcastReceiver r2 = r5.A0i
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0Y = r4
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32061eH.A02():void");
    }

    public final void A03() {
        C32251ea r1 = this.A0M.A0U;
        if (r1.A03) {
            r1.A01(false);
        }
        if (this.A0Y) {
            this.A0L.unregisterComponentCallbacks(this.A0j);
            this.A0L.unregisterReceiver(this.A0i);
            this.A0Y = false;
        }
        this.A0M.A06();
        for (C19550vD r0 : C19550vD.A0W) {
            r0.A02();
        }
    }

    public final void A04() {
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            AbstractC19160uZ r2 = (AbstractC19160uZ) this.A0M.A0W.get(i);
            if (r2 instanceof AbstractC32091eK) {
                AbstractC32091eK r22 = (AbstractC32091eK) r2;
                if (!(r22 instanceof AnonymousClass28Y)) {
                    r22.A04();
                    r22.A02 = -1;
                    r22.A0C.A03 = -1;
                } else {
                    r22.A00 = 1.2d;
                }
            }
        }
        C19440v1.A01(new C32261eb());
    }

    public final void A05() {
        this.A0e = false;
        C19690vR A062 = this.A0M.A0R.A06();
        C19060uM r8 = this.A0n;
        C07040Vr r0 = A062.A02;
        double d = r0.A00;
        double d2 = r0.A01;
        C07040Vr r02 = A062.A01;
        double d3 = r02.A00;
        double d4 = r02.A01;
        String str = C19470v5.A0C.A02;
        int i = this.A0G;
        r8.A02 = d;
        r8.A03 = d2;
        r8.A00 = d3;
        r8.A01 = d4;
        r8.A07 = str;
        r8.A04 = i;
        if (!r8.A08) {
            r8.A08 = true;
            long nanoTime = System.nanoTime() - r8.A05;
            long j = r8.A09;
            if (nanoTime < j) {
                r8.A0A.postDelayed(new RunnableEBaseShape5S0100000_I1_0(r8, 24), TimeUnit.NANOSECONDS.toMillis(j - nanoTime));
            } else {
                r8.A00();
            }
        }
    }

    public final void A06() {
        this.A0M.A0T.A07(true);
        this.A0e = true;
        this.A0M.A06();
        RunnableC19290um r1 = this.A0S;
        r1.A0E.removeCallbacks(r1);
        r1.A0C = false;
        r1.A07 = false;
        r1.A08 = true;
        r1.A0F.forceFinished(true);
        r1.A01 = 0.0f;
        r1.A00 = 0.0f;
    }

    public final void A07() {
        this.A0M.A0T.A07(true);
        RunnableC19290um r1 = this.A0S;
        r1.A0E.removeCallbacks(r1);
        r1.A08 = false;
        r1.A07 = true;
        r1.A0E.postOnAnimation(r1);
    }

    public final void A08() {
        RectF rectF = this.A0m;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0D;
        Matrix matrix = this.A0l;
        matrix.mapRect(rectF);
        float[] fArr = this.A0p;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0J;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    public void A09(double d, double d2) {
        this.A02 = A00(d);
        this.A03 = A01(d2, this.A0J);
    }

    public void A0A(float f, float f2) {
        double d = this.A02;
        long j = this.A0J;
        float f3 = (float) j;
        this.A02 = A00(d - ((double) (f / f3)));
        this.A03 = A01(this.A03 - ((double) (f2 / f3)), j);
    }

    public void A0B(float f, float f2, float f3) {
        if (this.A0a) {
            C19250ui r0 = this.A0M.A0R;
            float[] fArr = this.A0o;
            r0.A09(f2, f3, fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0k;
            matrix.postRotate(f - this.A0B, f2, f3);
            matrix.invert(this.A0l);
            this.A0B = f % 360.0f;
            A08();
            A0C(f2, f3, f4, f5);
        }
    }

    public final void A0C(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0o;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0l.mapVectors(fArr);
        float f5 = fArr[0];
        long j = this.A0J;
        float f6 = (float) j;
        this.A02 = A00((double) ((f5 / f6) + f3));
        this.A03 = A01((double) ((fArr[1] / f6) + f4), j);
    }

    public final void A0D(int i, float f) {
        this.A0G = i;
        this.A0C = f;
        int i2 = 1 << i;
        this.A0E = i2;
        this.A0J = (long) (i2 * this.A0M.A0O);
    }

    public final void A0E(Bundle bundle) {
        C32031eE r3 = new C32031eE(this, this.A0N);
        this.A0M = r3;
        C07020Vp r4 = this.A0N.A03;
        if (r4 == null) {
            float f = r3.A01;
            A0D((int) f, (f % 1.0f) + 1.0f);
        } else {
            float f2 = r4.A02;
            A0D((int) f2, (f2 % 1.0f) + 1.0f);
            C07040Vr r2 = r4.A03;
            if (r2 != null) {
                this.A02 = (double) C19250ui.A02(r2.A01);
                this.A03 = (double) C19250ui.A01(r2.A00);
            }
            this.A0B = r4.A00;
        }
        this.A0R = r3.A0S;
        Matrix matrix = this.A0k;
        float f3 = this.A0C;
        matrix.setScale(f3, f3);
        matrix.postRotate(this.A0B);
        matrix.invert(this.A0l);
        A0F(bundle);
    }

    public final void A0F(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            A0D(bundle.getInt("zoom"), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1)));
            double d = bundle.getDouble("yVisibleCenter");
            C32031eE r0 = this.A0M;
            this.A03 = d - ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1)));
            this.A0B = bundle.getFloat("rotation");
            Matrix matrix = this.A0k;
            float f = this.A0C;
            matrix.setScale(f, f);
            matrix.postRotate(this.A0B);
            matrix.invert(this.A0l);
            this.A0g = false;
        }
    }

    public final void A0G(Bundle bundle) {
        if (!this.A0g) {
            bundle.putDouble("xVisibleCenter", this.A02 + ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1))));
            double d = this.A03;
            C32031eE r0 = this.A0M;
            bundle.putDouble("yVisibleCenter", d + ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1))));
            bundle.putInt("zoom", this.A0G);
            bundle.putFloat("scale", this.A0C);
            bundle.putFloat("rotation", this.A0B);
            this.A0g = true;
        }
    }

    public void A0H(AbstractC19240uh r2) {
        Queue queue;
        if (!this.A0b || ((queue = this.A0W) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0W;
            if (queue2 == null) {
                queue2 = new LinkedList();
                this.A0W = queue2;
            }
            queue2.add(r2);
            return;
        }
        r2.AHR(this.A0M);
    }

    public boolean A0I(float f, float f2, float f3) {
        if (A0J(f, f2, f3)) {
            this.A0M.A04();
        }
        return this.A06 != 1.0f;
    }

    public boolean A0J(float f, float f2, float f3) {
        C19250ui r0 = this.A0M.A0R;
        float[] fArr = this.A0o;
        r0.A09(f2, f3, fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        C32031eE r2 = this.A0M;
        float min = Math.min(Math.max(f, r2.A01), r2.A00);
        int i = (int) min;
        float f6 = (min % 1.0f) + 1.0f;
        int i2 = this.A0G;
        float f7 = f6 / this.A0C;
        this.A06 = f7;
        A0D(i, f6);
        Matrix matrix = this.A0k;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0l);
        A08();
        A0C(f2, f3, f4, f5);
        if (this.A0G != i2) {
            return true;
        }
        return false;
    }

    public final boolean A0K(float f, float f2, float f3) {
        float f4 = this.A0C * f;
        int i = this.A0G;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        return A0I((((float) i) + f4) - 1.0f, f2, f3);
    }

    @Override // X.AbstractC19460v4
    public void AEW() {
        invalidate();
    }

    public EnumSet getCurrentAttribution() {
        return this.A0V;
    }

    public final C32031eE getMap() {
        return this.A0M;
    }

    public AbstractC19210ue getOnAttributionChangeListener() {
        return this.A0P;
    }

    public float getZoom() {
        return (((float) this.A0G) + this.A0C) - 1.0f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A02();
            this.A0K = System.nanoTime();
            if (!this.A0d) {
                AnonymousClass28Z r3 = this.A0M.A0T.A03;
                ((AbstractC32331ei) r3).A02.set(0);
                r3.A02.set(0);
                r3.A03.set(0);
                this.A0d = true;
                return;
            }
            return;
        }
        throw new RuntimeException("MapView.onCreate() must be called!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C32031eE r2 = this.A0M;
        C32231eY r1 = r2.A0H;
        if (r1 != null) {
            r1.A0E.A01();
            r1.A00();
        }
        r2.A03();
        C19440v1.A01(new C32261eb());
        A03();
    }

    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(-987675);
        this.A0X = true;
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            AbstractC19160uZ r1 = (AbstractC19160uZ) this.A0M.A0W.get(i);
            if (r1.A04) {
                r1.A02(canvas);
                if (r1 instanceof AnonymousClass24r) {
                    boolean z = this.A0X;
                    boolean z2 = false;
                    if (((AbstractC32091eK) r1).A08 == 0) {
                        z2 = true;
                    }
                    this.A0X = z2 & z;
                }
            }
        }
        if (this.A0X) {
            C32031eE r12 = this.A0M;
            if (this.A0d) {
                AnonymousClass28Y r13 = r12.A0T;
                if (this.A0N == null) {
                    throw null;
                } else if (r13.A03 != null) {
                    this.A0d = false;
                } else {
                    throw null;
                }
            }
        }
        long nanoTime2 = System.nanoTime();
        if (this.A0N != null) {
            C19550vD.A0D.A03(nanoTime2 - nanoTime);
            if (this.A0H > 0) {
                new C19190uc(this, nanoTime2);
                this.A0H = 0;
            }
            if (this.A0K > 0) {
                new C19200ud(this, nanoTime2);
                this.A0K = 0;
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b6, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32061eH.onLayout(boolean, int, int, int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A0F(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        if (this.A0g) {
            return super.onSaveInstanceState();
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        A0G(bundle);
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:365:0x027c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:362:0x028d */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0364, code lost:
        if (r0 != false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (java.lang.Math.abs(r8 - r5.A01) <= r1) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0539, code lost:
        if (java.lang.Math.abs(r5.A0E - r5.A0C) <= r2) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0585, code lost:
        if (r0 <= (r0 + r1)) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05e5, code lost:
        if (r2 != false) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0126, code lost:
        if (r8 > (r1 + r9)) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (java.lang.Math.abs(r8 - r5.A0C) <= r13) goto L_0x04a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r28) {
        /*
        // Method dump skipped, instructions count: 1795
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32061eH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A02();
        } else {
            A03();
        }
    }

    @Override // X.AbstractC19050uL
    public void setCurrentAttribution(EnumSet enumSet) {
        if (!enumSet.equals(this.A0V)) {
            this.A0V = enumSet;
            AbstractC19210ue r0 = this.A0P;
            if (r0 != null) {
                ((AnonymousClass28Y) r0).A02.A07 = enumSet;
            }
        }
    }

    public final void setMapEventHandler(AbstractC19560vE r1) {
        if (r1 == null) {
            r1 = AbstractC19560vE.A00;
        }
        this.A0U = r1;
    }

    public void setOnAttributionChangeListener(AbstractC19210ue r1) {
        this.A0P = r1;
    }

    public void setOnFirstTileLoadedCallback(AbstractC19230ug r1) {
        this.A0Q = r1;
    }
}
