package X;

import android.animation.ValueAnimator;

/* renamed from: X.11O  reason: invalid class name */
public class AnonymousClass11O implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass11P A00;

    public AnonymousClass11O(AnonymousClass11P r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidateSelf();
    }
}
