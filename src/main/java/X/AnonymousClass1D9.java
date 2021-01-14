package X;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.1D9  reason: invalid class name */
public class AnonymousClass1D9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public AnonymousClass1D9(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setScrimAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
