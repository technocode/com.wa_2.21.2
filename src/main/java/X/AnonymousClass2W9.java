package X;

import android.animation.ValueAnimator;

/* renamed from: X.2W9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2W9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass2WG A03;

    public /* synthetic */ AnonymousClass2W9(AnonymousClass2WG r1, float f, float f2, int i) {
        this.A03 = r1;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2WG r5 = this.A03;
        float f = this.A00;
        float f2 = this.A01;
        int i = this.A02;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r5.A00 = Math.max(f, ((f2 - f) * floatValue) + f);
        float f3 = (float) i;
        r5.A01 = (int) Math.min(f3, Math.min(1.2f * floatValue, floatValue) * f3);
    }
}
