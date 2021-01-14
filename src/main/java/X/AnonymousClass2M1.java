package X;

import android.animation.ValueAnimator;
import com.whatsapp.doodle.DoodleView;

/* renamed from: X.2M1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DoodleView A00;

    public /* synthetic */ AnonymousClass2M1(DoodleView doodleView) {
        this.A00 = doodleView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DoodleView doodleView = this.A00;
        doodleView.A0c.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
        doodleView.invalidate();
    }
}
