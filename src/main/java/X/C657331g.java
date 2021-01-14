package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.31g  reason: invalid class name and case insensitive filesystem */
public class C657331g extends AnimatorListenerAdapter {
    public final /* synthetic */ C09860de A00;

    public C657331g(C09860de r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.A00.A06.setImageDrawable(null);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A06.setImageDrawable(null);
    }
}
