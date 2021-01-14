package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.2wT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63472wT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ C63472wT(View view, float f) {
        this.A01 = view;
        this.A00 = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.setTranslationX(valueAnimator.getAnimatedFraction() * this.A00);
    }
}
