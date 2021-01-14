package X;

import android.animation.ValueAnimator;
import android.transition.TransitionValues;

/* renamed from: X.2UH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ AnonymousClass2UR A01;

    public /* synthetic */ AnonymousClass2UH(AnonymousClass2UR r1, TransitionValues transitionValues) {
        this.A01 = r1;
        this.A00 = transitionValues;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00(this.A00, valueAnimator);
    }
}
