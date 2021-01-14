package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: X.1Jc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25991Jc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C40781tp A01;

    public /* synthetic */ C25991Jc(C40781tp r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C40781tp r3 = this.A01;
        int floatValue = (int) (((float) this.A00) * (((Number) valueAnimator.getAnimatedValue()).floatValue() / 100.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r3.A01.getLayoutParams();
        layoutParams.topMargin = -floatValue;
        r3.A01.setLayoutParams(layoutParams);
    }
}
