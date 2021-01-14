package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1No  reason: invalid class name and case insensitive filesystem */
public class C27001No extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC27011Np A00;

    public C27001No(ViewTreeObserver$OnPreDrawListenerC27011Np r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A00.A00 = null;
    }
}
