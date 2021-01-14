package X;

import android.animation.ValueAnimator;

/* renamed from: X.1Di  reason: invalid class name and case insensitive filesystem */
public class C24861Di implements ValueAnimator.AnimatorUpdateListener {
    public int A00 = 0;
    public final /* synthetic */ AbstractC24951Dr A01;

    public C24861Di(AbstractC24951Dr r2) {
        this.A01 = r2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        if (AbstractC24951Dr.A09) {
            AnonymousClass0Q7.A0U(this.A01.A05, intValue - this.A00);
        } else {
            this.A01.A05.setTranslationY((float) intValue);
        }
        this.A00 = intValue;
    }
}
