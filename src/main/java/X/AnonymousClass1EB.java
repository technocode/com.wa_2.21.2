package X;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.1EB  reason: invalid class name */
public class AnonymousClass1EB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextInputLayout A00;

    public AnonymousClass1EB(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0r.A08(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
