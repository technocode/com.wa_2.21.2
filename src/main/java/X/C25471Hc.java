package X;

import android.animation.ValueAnimator;

/* renamed from: X.1Hc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25471Hc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C26281Kf A00;

    public /* synthetic */ C25471Hc(C26281Kf r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26281Kf r3 = this.A00;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        float f = r3.A06;
        r3.A00 = ((r3.A0A - f) * floatValue) + f;
        float f2 = r3.A08;
        r3.A04 = ((r3.A0D - f2) * floatValue) + f2;
        float f3 = r3.A07;
        r3.A02 = ((r3.A0C - f3) * floatValue) + f3;
        r3.A0K = (int) (Math.min(1.0f, floatValue * 1.5f) * 255.0f);
        r3.A01();
    }
}
