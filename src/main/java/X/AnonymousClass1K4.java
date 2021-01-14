package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* renamed from: X.1K4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ObjectAnimator A02;
    public final /* synthetic */ AnonymousClass1ON A03;

    public /* synthetic */ AnonymousClass1K4(AnonymousClass1ON r1, int i, int i2, ObjectAnimator objectAnimator) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = objectAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A03.A01.getWindow().setStatusBarColor(C004402b.A04(this.A00, this.A01, ((Number) this.A02.getAnimatedValue()).floatValue()));
    }
}
