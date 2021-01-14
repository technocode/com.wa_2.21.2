package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Je  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C26011Je implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C26011Je(View view, boolean z) {
        this.A00 = view;
        this.A01 = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction;
        View view = this.A00;
        boolean z = this.A01;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
        }
        if (z) {
            animatedFraction = valueAnimator.getAnimatedFraction();
        } else {
            animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        }
        view.setAlpha(animatedFraction);
    }
}
