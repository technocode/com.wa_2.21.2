package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* renamed from: X.1K3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ObjectAnimator A02;
    public final /* synthetic */ AnonymousClass1OM A03;

    public /* synthetic */ AnonymousClass1K3(AnonymousClass1OM r1, ObjectAnimator objectAnimator, float f, int i) {
        this.A03 = r1;
        this.A02 = objectAnimator;
        this.A00 = f;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass1OM r4 = this.A03;
        ObjectAnimator objectAnimator = this.A02;
        float f = this.A00;
        r4.A02.getWindow().setStatusBarColor(C004402b.A04(this.A01, -16777216, (((Number) objectAnimator.getAnimatedValue()).floatValue() - f) / (1.0f - f)));
    }
}
