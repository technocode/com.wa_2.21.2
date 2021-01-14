package X;

import android.animation.ValueAnimator;

/* renamed from: X.344  reason: invalid class name */
public final /* synthetic */ class AnonymousClass344 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C72033Rg A00;

    public /* synthetic */ AnonymousClass344(C72033Rg r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A09.setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
