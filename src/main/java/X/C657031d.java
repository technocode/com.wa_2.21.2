package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.31d  reason: invalid class name and case insensitive filesystem */
public class C657031d extends AnimatorListenerAdapter {
    public final /* synthetic */ C657231f A00;

    public C657031d(C657231f r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.A00.A01.finish();
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A01.finish();
    }
}
