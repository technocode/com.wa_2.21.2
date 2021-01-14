package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.30l  reason: invalid class name and case insensitive filesystem */
public class C655830l extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable A00;

    public C655830l(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.run();
        super.onAnimationEnd(animator);
    }
}
