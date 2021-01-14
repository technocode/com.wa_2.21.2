package X;

import android.animation.ValueAnimator;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.35F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35F implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FloatingChildLayout A00;

    public /* synthetic */ AnonymousClass35F(FloatingChildLayout floatingChildLayout) {
        this.A00 = floatingChildLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue() << 24);
    }
}
