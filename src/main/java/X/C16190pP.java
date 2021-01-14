package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;

/* renamed from: X.0pP  reason: invalid class name and case insensitive filesystem */
public class C16190pP implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final AbstractC11910hD A0C;

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public C16190pP(AbstractC11910hD r3, int i, float f, float f2, float f3, float f4) {
        this.A0A = i;
        this.A0C = r3;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new C16180pO(this));
        this.A0B.setTarget(r3.A0H);
        this.A0B.addListener(this);
        this.A00 = 0.0f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        AbstractC11910hD r4;
        if (!(this instanceof C30491bR)) {
            if (!this.A03) {
                this.A0C.A07(true);
            }
            this.A03 = true;
            return;
        }
        C30491bR r6 = (C30491bR) this;
        if (!r6.A03) {
            r6.A0C.A07(true);
        }
        r6.A03 = true;
        if (!r6.A05) {
            int i = r6.A00;
            if (i <= 0) {
                r4 = r6.A02;
                AbstractC16160pM.A00(r4);
            } else {
                C30511bT r3 = r6.A01;
                List list = r3.A0S;
                r4 = r6.A02;
                list.add(r4.A0H);
                r6.A04 = true;
                if (i > 0) {
                    r3.A0M.post(new RunnableEBaseShape1S0201000_I1(r6, i, r3, 3));
                }
            }
            C30511bT r2 = r6.A01;
            View view = r2.A0G;
            View view2 = r4.A0H;
            if (view == view2) {
                r2.A05(view2);
            }
        }
    }
}
