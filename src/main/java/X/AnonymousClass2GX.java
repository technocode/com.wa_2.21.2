package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: X.2GX  reason: invalid class name */
public class AnonymousClass2GX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass0QH A00;

    public AnonymousClass2GX(AnonymousClass0QH r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass0QH r5 = this.A00;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5.A08.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, ((Number) valueAnimator.getAnimatedValue()).intValue(), layoutParams.rightMargin, layoutParams.bottomMargin);
        r5.A08.setLayoutParams(layoutParams);
    }
}
