package X;

import android.animation.ValueAnimator;
import com.whatsapp.HomeActivity;

/* renamed from: X.1IH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ AnonymousClass1IH(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity homeActivity = this.A00;
        homeActivity.A0O.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
        int i = 0;
        while (true) {
            AnonymousClass0YC r1 = homeActivity.A0M;
            if (i < r1.A00) {
                r1.A0G(i).A03.setTextColor(((Number) valueAnimator.getAnimatedValue()).intValue());
                i++;
            } else {
                return;
            }
        }
    }
}
