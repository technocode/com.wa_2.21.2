package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.1IK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IK implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass1IK(View view) {
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setTranslationY((float) ((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
