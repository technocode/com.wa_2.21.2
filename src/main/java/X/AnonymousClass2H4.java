package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: X.2H4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass2ZA A00;

    public /* synthetic */ AnonymousClass2H4(AnonymousClass2ZA r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2ZA r2 = this.A00;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r2.getLayoutParams();
        layoutParams.height = intValue;
        r2.setLayoutParams(layoutParams);
    }
}
