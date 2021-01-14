package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.2N0  reason: invalid class name */
public class AnonymousClass2N0 {
    public void A00(AbstractC48612Mz r4, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        ofFloat.addListener(new C48602My(r4, view));
        ofFloat.addUpdateListener(new C48552Ms(r4, view));
        ofFloat.start();
    }
}
