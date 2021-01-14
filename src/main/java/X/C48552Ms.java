package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.2Ms  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C48552Ms implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC48612Mz A01;

    public /* synthetic */ C48552Ms(AbstractC48612Mz r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC48612Mz r3 = this.A01;
        View view = this.A00;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.getCurrentPlayTime();
        r3.A01 = true;
        r3.A00 = floatValue;
        view.invalidate();
    }
}
