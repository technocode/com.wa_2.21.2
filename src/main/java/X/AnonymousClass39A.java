package X;

import android.animation.Animator;

/* renamed from: X.39A  reason: invalid class name */
public class AnonymousClass39A implements Animator.AnimatorListener {
    public final /* synthetic */ Runnable A00;

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public AnonymousClass39A(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00.run();
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.run();
    }
}
