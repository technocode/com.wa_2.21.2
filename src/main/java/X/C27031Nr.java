package X;

import android.animation.Animator;

/* renamed from: X.1Nr  reason: invalid class name and case insensitive filesystem */
public class C27031Nr implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C40781tp A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public C27031Nr(C40781tp r1, boolean z, int i) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        C40781tp r2 = this.A01;
        r2.A01.setVisibility(this.A00);
        C09510d4 r22 = r2.A02.A08;
        r22.A03.A01 = false;
        r22.A00();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A01.A01.setVisibility(0);
        }
    }
}
