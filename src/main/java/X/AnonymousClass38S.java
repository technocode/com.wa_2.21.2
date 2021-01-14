package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.38S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38S implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass38S(View view) {
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
