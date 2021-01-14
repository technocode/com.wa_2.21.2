package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.38X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38X implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public /* synthetic */ AnonymousClass38X(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00.A04;
        if (view != null) {
            view.setTranslationY(((Number) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
