package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1c9  reason: invalid class name and case insensitive filesystem */
public class C30901c9 extends AnimatorListenerAdapter implements AbstractC09420cr, AbstractC17090qx {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    @Override // X.AbstractC09420cr
    public void ALJ(AbstractC09350ck r1) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public C30901c9(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public final void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            AnonymousClass0N2.A1A(viewGroup, z);
        }
    }

    @Override // X.AbstractC09420cr
    public void ALG(AbstractC09350ck r3) {
        if (!this.A00) {
            C17340rN.A01(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        r3.A08(this);
    }

    @Override // X.AbstractC09420cr
    public void ALH(AbstractC09350ck r2) {
        A00(false);
    }

    @Override // X.AbstractC09420cr
    public void ALI(AbstractC09350ck r2) {
        A00(true);
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            C17340rN.A01(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    @Override // X.AbstractC17090qx
    public void onAnimationPause(Animator animator) {
        if (!this.A00) {
            C17340rN.A01(this.A03, this.A02);
        }
    }

    @Override // X.AbstractC17090qx
    public void onAnimationResume(Animator animator) {
        if (!this.A00) {
            C17340rN.A01(this.A03, 0);
        }
    }
}
