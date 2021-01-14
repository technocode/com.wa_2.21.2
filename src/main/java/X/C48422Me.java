package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.2Me  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C48422Me implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewGroup.MarginLayoutParams A02;

    public /* synthetic */ C48422Me(int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = marginLayoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A00;
        int i2 = this.A01;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A02;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        marginLayoutParams.setMargins(0, (int) ((f * ((float) i2)) + (animatedFraction * ((float) i))), 0, 0);
    }
}
