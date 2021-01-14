package X;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.1D4  reason: invalid class name */
public class AnonymousClass1D4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public AnonymousClass1D4(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = coordinatorLayout;
        this.A02 = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A09(this.A00, this.A02, ((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
