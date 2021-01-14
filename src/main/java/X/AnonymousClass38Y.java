package X;

import android.animation.ValueAnimator;
import com.whatsapp.voipcalling.VoipCallControlRingingDotsIndicator;

/* renamed from: X.38Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38Y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00 = 0.14f;
    public final /* synthetic */ float A01 = 0.66f;
    public final /* synthetic */ int A02 = 100;
    public final /* synthetic */ int A03 = 400;
    public final /* synthetic */ int A04 = 800;
    public final /* synthetic */ VoipCallControlRingingDotsIndicator A05;

    public /* synthetic */ AnonymousClass38Y(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator) {
        this.A05 = voipCallControlRingingDotsIndicator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        float f;
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = this.A05;
        int i2 = this.A02;
        int i3 = this.A03;
        int i4 = this.A04;
        float f2 = this.A00;
        float f3 = this.A01;
        int i5 = 0;
        do {
            i = i5 + 1;
            int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue() - (i2 * i);
            if (intValue <= i3) {
                f = ((float) intValue) / ((float) i3);
            } else {
                f = (((float) i4) - ((float) intValue)) / ((float) i3);
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            voipCallControlRingingDotsIndicator.A03[i5] = ((f3 - f2) * f) + f2;
            i5 = i;
        } while (i < 3);
        voipCallControlRingingDotsIndicator.invalidate();
    }
}
