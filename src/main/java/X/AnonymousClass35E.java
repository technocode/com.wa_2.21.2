package X;

import android.animation.ValueAnimator;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.35E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35E implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FloatingChildLayout A00;

    public /* synthetic */ AnonymousClass35E(FloatingChildLayout floatingChildLayout) {
        this.A00 = floatingChildLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue() << 24);
    }
}
