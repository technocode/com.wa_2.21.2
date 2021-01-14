package X;

import android.animation.ValueAnimator;

/* renamed from: X.1Hb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25461Hb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C26281Kf A00;

    public /* synthetic */ C25461Hb(C26281Kf r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26281Kf r1 = this.A00;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r1.setScaleX(floatValue);
        r1.setScaleY(floatValue);
    }
}
