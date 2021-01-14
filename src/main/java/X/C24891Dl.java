package X;

import android.animation.ValueAnimator;

/* renamed from: X.1Dl  reason: invalid class name and case insensitive filesystem */
public class C24891Dl implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC24951Dr A02;

    public C24891Dl(AbstractC24951Dr r1, int i) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        if (AbstractC24951Dr.A09) {
            AnonymousClass0Q7.A0U(this.A02.A05, intValue - this.A00);
        } else {
            this.A02.A05.setTranslationY((float) intValue);
        }
        this.A00 = intValue;
    }
}
