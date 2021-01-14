package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1KI  reason: invalid class name */
public final class AnonymousClass1KI extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable A00;

    public AnonymousClass1KI(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
