package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;

/* renamed from: X.1PH  reason: invalid class name */
public class AnonymousClass1PH extends AnimatorListenerAdapter {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ AnonymousClass1PK A01;

    public void onAnimationEnd(Animator animator) {
    }

    public AnonymousClass1PH(AnonymousClass1PK r1, TransitionValues transitionValues) {
        this.A01 = r1;
        this.A00 = transitionValues;
    }

    public void onAnimationStart(Animator animator) {
        this.A00.view.setAlpha(1.0f);
    }
}
