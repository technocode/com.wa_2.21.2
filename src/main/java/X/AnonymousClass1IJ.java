package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;

/* renamed from: X.1IJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IJ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FrameLayout.LayoutParams A00;
    public final /* synthetic */ LinearLayout.LayoutParams A01;
    public final /* synthetic */ HomeActivity A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass1IJ(HomeActivity homeActivity, boolean z, FrameLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2) {
        this.A02 = homeActivity;
        this.A03 = z;
        this.A00 = layoutParams;
        this.A01 = layoutParams2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity homeActivity = this.A02;
        boolean z = this.A03;
        FrameLayout.LayoutParams layoutParams = this.A00;
        LinearLayout.LayoutParams layoutParams2 = this.A01;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        if (z) {
            layoutParams.height = intValue;
        } else {
            layoutParams2.height = intValue;
        }
        homeActivity.A0E.setLayoutParams(layoutParams2);
        homeActivity.A09.setLayoutParams(layoutParams);
    }
}
