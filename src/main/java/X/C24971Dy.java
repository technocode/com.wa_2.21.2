package X;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1Dy  reason: invalid class name and case insensitive filesystem */
public class C24971Dy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TabLayout A00;

    public C24971Dy(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.scrollTo(((Number) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
