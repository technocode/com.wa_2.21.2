package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.1KJ  reason: invalid class name */
public final class AnonymousClass1KJ extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass1KJ(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.setVisibility(8);
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}
