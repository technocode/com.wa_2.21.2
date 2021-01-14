package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.0vC  reason: invalid class name and case insensitive filesystem */
public class C19540vC {
    public static HandlerC19510v9 A0M;
    public static final Interpolator A0N = new AccelerateDecelerateInterpolator();
    public static final C19490v7 A0O = new C19490v7(64);
    public static final Object A0P = new Object();
    public static final ArrayList A0Q = new ArrayList();
    public static final ArrayList A0R = new ArrayList();
    public static final ArrayList A0S = new ArrayList();
    public static final ArrayList A0T = new ArrayList();
    public static final ArrayList A0U = new ArrayList();
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 1;
    public long A07;
    public long A08 = 300;
    public long A09 = -1;
    public long A0A;
    public Interpolator A0B = A0N;
    public ArrayList A0C = null;
    public ArrayList A0D = null;
    public boolean A0E = true;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public float[] A0K = new float[2];
    public float[] A0L = new float[2];

    public static C19540vC A00(float f, float f2) {
        C19540vC r5 = (C19540vC) A0O.A00();
        if (r5 == null) {
            r5 = new C19540vC();
        }
        r5.A03 = 2;
        float[] fArr = r5.A0K;
        fArr[0] = 0.0f;
        float[] fArr2 = r5.A0L;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        r5.A0F = false;
        return r5;
    }

    public void A01() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0T.contains(this) || A0R.contains(this)) {
            if (this.A0H && (arrayList = this.A0C) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC19520vA) this.A0C.get(i)).ACj(this);
                }
            }
            A04();
        }
    }

    public void A02() {
        ArrayList arrayList = this.A0C;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0D;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A0A = 0;
        this.A09 = -1;
        this.A0G = false;
        this.A02 = 0;
        this.A0J = false;
        this.A07 = 0;
        this.A04 = 0;
        this.A0H = false;
        this.A0I = false;
        this.A0F = false;
        this.A08 = 300;
        this.A05 = 0;
        this.A06 = 1;
        this.A0B = A0N;
        this.A00 = 0.0f;
        this.A0E = true;
        A0O.A02(this);
    }

    public void A03() {
        HandlerC19510v9 r0;
        if (Looper.myLooper() != null) {
            this.A0G = false;
            this.A02 = 0;
            this.A04 = 0;
            this.A0I = true;
            this.A0J = false;
            A0T.add(this);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A09 = 0;
                int i = 0;
                if (this.A0F) {
                    i = 2;
                }
                this.A04 = i;
            }
            this.A0A = currentAnimationTimeMillis - 0;
            this.A0F = true;
            A08(currentAnimationTimeMillis);
            this.A0H = true;
            ArrayList arrayList = this.A0C;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2);
                }
            }
            synchronized (A0P) {
                r0 = A0M;
                if (r0 == null) {
                    r0 = new HandlerC19510v9();
                    A0M = r0;
                }
            }
            r0.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    public final void A04() {
        A0Q.remove(this);
        A0T.remove(this);
        A0R.remove(this);
        this.A04 = 0;
        this.A0I = false;
        if (this.A0H) {
            this.A0H = false;
            ArrayList arrayList = this.A0C;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC19520vA) this.A0C.get(i)).ACl(this);
                }
            }
        }
    }

    public void A05(long j) {
        if (j >= 0) {
            this.A08 = j;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0I("Animators cannot have negative duration: ", j));
    }

    public void A06(AbstractC19520vA r2) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0C = arrayList;
        }
        arrayList.add(r2);
    }

    public void A07(AbstractC19530vB r2) {
        ArrayList arrayList = this.A0D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0D = arrayList;
        }
        arrayList.add(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r3 >= 1.0f) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(long r12) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540vC.A08(long):boolean");
    }
}
