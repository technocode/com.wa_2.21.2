package X;

import android.animation.ValueAnimator;

/* renamed from: X.0pO  reason: invalid class name and case insensitive filesystem */
public class C16180pO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C16190pP A00;

    public C16180pO(C16190pP r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A00 = valueAnimator.getAnimatedFraction();
    }
}
