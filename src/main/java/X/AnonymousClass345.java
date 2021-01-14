package X;

import android.animation.ValueAnimator;

/* renamed from: X.345  reason: invalid class name */
public final /* synthetic */ class AnonymousClass345 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C72033Rg A00;

    public /* synthetic */ AnonymousClass345(C72033Rg r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0A.setTextColor(((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
