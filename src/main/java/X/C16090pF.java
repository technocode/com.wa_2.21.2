package X;

import android.animation.ValueAnimator;

/* renamed from: X.0pF  reason: invalid class name and case insensitive filesystem */
public class C16090pF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C30441bM A00;

    public C16090pF(C30441bM r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Number) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C30441bM r1 = this.A00;
        r1.A0O.setAlpha(floatValue);
        r1.A0M.setAlpha(floatValue);
        r1.A0B.invalidate();
    }
}
