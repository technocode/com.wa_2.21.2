package X;

import android.animation.Animator;

/* renamed from: X.2GW  reason: invalid class name */
public class AnonymousClass2GW implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass0QH A00;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass2GW(AnonymousClass0QH r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass0QH r1 = this.A00;
        if (!r1.A0b.isEmpty()) {
            r1.A06.setVisibility(0);
        } else {
            r1.A05.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass0QH r1 = this.A00;
        if (!r1.A0b.isEmpty()) {
            r1.A05.setVisibility(0);
        } else {
            r1.A06.setVisibility(8);
        }
    }
}
