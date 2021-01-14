package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bM  reason: invalid class name and case insensitive filesystem */
public class C30441bM extends AbstractC16380pi implements AbstractC16440po {
    public static final int[] A0T = new int[0];
    public static final int[] A0U = {16842919};
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09;
    public int A0A;
    public RecyclerView A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ValueAnimator A0K = ValueAnimator.ofFloat(0.0f, 1.0f);
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public final AbstractC16450pp A0P = new C30431bL(this);
    public final Runnable A0Q = new RunnableEBaseShape5S0100000_I1_0(this, 14);
    public final int[] A0R = new int[2];
    public final int[] A0S = new int[2];

    @Override // X.AbstractC16440po
    public void AJO(boolean z) {
    }

    public C30441bM(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        this.A0O.setAlpha(255);
        this.A0M.setAlpha(255);
        this.A0K.addListener(new C16080pE(this));
        this.A0K.addUpdateListener(new C16090pF(this));
        RecyclerView recyclerView2 = this.A0B;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0k(this);
                RecyclerView recyclerView3 = this.A0B;
                recyclerView3.A15.remove(this);
                if (recyclerView3.A0U == this) {
                    recyclerView3.A0U = null;
                }
                this.A0B.A0m(this.A0P);
                this.A0B.removeCallbacks(this.A0Q);
            }
            this.A0B = recyclerView;
            recyclerView.A0j(this);
            RecyclerView recyclerView4 = this.A0B;
            recyclerView4.A15.add(this);
            recyclerView4.A0l(this.A0P);
        }
    }

    public void A01() {
        int i = this.A02;
        if (i != 0) {
            if (i == 3) {
                this.A0K.cancel();
            } else {
                return;
            }
        }
        this.A02 = 1;
        ValueAnimator valueAnimator = this.A0K;
        valueAnimator.setFloatValues(((Number) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L_0x004a
            int r0 = r4.A08
            if (r0 == r2) goto L_0x0015
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.C30441bM.A0U
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0B
            java.lang.Runnable r0 = r4.A0Q
            r1.removeCallbacks(r0)
        L_0x0015:
            r4.A01()
        L_0x0018:
            int r0 = r4.A08
            if (r0 != r2) goto L_0x0037
            if (r5 == r2) goto L_0x0034
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.C30441bM.A0T
            r1.setState(r0)
            r1 = 1200(0x4b0, float:1.682E-42)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            java.lang.Runnable r3 = r4.A0Q
            r0.removeCallbacks(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0B
            long r0 = (long) r1
            r2.postDelayed(r3, r0)
        L_0x0034:
            r4.A08 = r5
            return
        L_0x0037:
            r0 = 1
            if (r5 != r0) goto L_0x0034
            r1 = 1500(0x5dc, float:2.102E-42)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            java.lang.Runnable r3 = r4.A0Q
            r0.removeCallbacks(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0B
            long r0 = (long) r1
            r2.postDelayed(r3, r0)
            goto L_0x0034
        L_0x004a:
            if (r5 != 0) goto L_0x0015
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.invalidate()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30441bM.A02(int):void");
    }

    public boolean A03(float f, float f2) {
        if (AnonymousClass0Q7.A05(this.A0B) == 1) {
            if (f > ((float) (this.A0I >> 1))) {
                return false;
            }
        } else if (f < ((float) (this.A07 - this.A0I))) {
            return false;
        }
        int i = this.A09;
        int i2 = this.A0A >> 1;
        if (f2 < ((float) (i - i2)) || f2 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r0 > 0) goto L_0x0038;
     */
    @Override // X.AbstractC16440po
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AGn(androidx.recyclerview.widget.RecyclerView r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r8.A08
            r3 = 1
            r2 = 2
            if (r0 != r3) goto L_0x005e
            float r1 = r10.getX()
            float r0 = r10.getY()
            boolean r7 = r8.A03(r1, r0)
            float r6 = r10.getX()
            float r4 = r10.getY()
            int r1 = r8.A06
            int r0 = r8.A0E
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            int r4 = r8.A04
            int r0 = r8.A05
            int r1 = r0 >> 1
            int r0 = r4 - r1
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            int r1 = r1 + r4
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0061
            if (r7 != 0) goto L_0x0051
            if (r1 == 0) goto L_0x0061
        L_0x0043:
            r8.A03 = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A00 = r0
        L_0x004d:
            r8.A02(r2)
            return r3
        L_0x0051:
            if (r1 != 0) goto L_0x0043
            r8.A03 = r2
            float r0 = r10.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A01 = r0
            goto L_0x004d
        L_0x005e:
            if (r0 != r2) goto L_0x0061
            return r3
        L_0x0061:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30441bM.AGn(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r5 > ((float) (r1 + r3))) goto L_0x003f;
     */
    @Override // X.AbstractC16440po
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AL4(androidx.recyclerview.widget.RecyclerView r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30441bM.AL4(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }
}
