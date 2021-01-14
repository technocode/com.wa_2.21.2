package X;

import android.animation.ValueAnimator;

/* renamed from: X.1Hd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25481Hd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C26281Kf A00;

    public /* synthetic */ C25481Hd(C26281Kf r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26281Kf r3 = this.A00;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r3.A03 = (2.5f * floatValue) - 1.75f;
        float height = ((float) r3.A0S.getHeight()) * 0.39f * floatValue;
        r3.A01 = r3.A0B - height;
        r3.A02 = r3.A0C - height;
    }
}
