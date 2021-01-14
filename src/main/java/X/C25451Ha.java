package X;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* renamed from: X.1Ha  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25451Ha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C26281Kf A00;

    public /* synthetic */ C25451Ha(C26281Kf r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26281Kf r4 = this.A00;
        r4.A0X.setColorFilter(new PorterDuffColorFilter(((Number) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN));
        r4.A01();
    }
}
