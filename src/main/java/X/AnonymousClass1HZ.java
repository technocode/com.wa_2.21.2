package X;

import android.animation.ValueAnimator;

/* renamed from: X.1HZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C26281Kf A00;

    public /* synthetic */ AnonymousClass1HZ(C26281Kf r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26281Kf r3 = this.A00;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r3.A00 = (r3.A0A - (((float) r3.A0F) * floatValue)) - Math.abs(r3.A0B - r3.A01);
        r3.A01();
    }
}
