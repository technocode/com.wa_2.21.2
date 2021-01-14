package X;

import android.animation.ValueAnimator;
import com.whatsapp.components.RoundCornerProgressBar;

/* renamed from: X.2FY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FY implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ RoundCornerProgressBar A00;

    public /* synthetic */ AnonymousClass2FY(RoundCornerProgressBar roundCornerProgressBar) {
        this.A00 = roundCornerProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RoundCornerProgressBar roundCornerProgressBar = this.A00;
        roundCornerProgressBar.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        roundCornerProgressBar.postInvalidate();
    }
}
