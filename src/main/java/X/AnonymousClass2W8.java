package X;

import android.animation.ValueAnimator;

/* renamed from: X.2W8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2W8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass2WG A02;

    public /* synthetic */ AnonymousClass2W8(AnonymousClass2WG r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2WG r6 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r6.A00 = Math.min(r6.A00, Math.max(f, f2 - ((0.5f * floatValue) * (f2 - f))));
        float f3 = (float) r6.A01;
        r6.A01 = (int) Math.max(f3 - (floatValue * f3), 0.0f);
    }
}
