package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.189  reason: invalid class name */
public final /* synthetic */ class AnonymousClass189 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass189(View view) {
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
        }
    }
}
