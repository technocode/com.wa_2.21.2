package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.2MP  reason: invalid class name */
public class AnonymousClass2MP extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public AnonymousClass2MP(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ValueAnimator valueAnimator = this.A00.A0F;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
    }
}
