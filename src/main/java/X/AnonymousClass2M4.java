package X;

import android.animation.ValueAnimator;

/* renamed from: X.2M4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public /* synthetic */ AnonymousClass2M4(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2MQ r0 = this.A00;
        AnonymousClass2MU r2 = r0.A0B;
        int i = r0.A03;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r2.A03 = i;
        r2.A01 = floatValue;
        r2.invalidateSelf();
    }
}
