package X;

import android.animation.ValueAnimator;

/* renamed from: X.1E1  reason: invalid class name */
public class AnonymousClass1E1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass1E3 A04;

    public AnonymousClass1E1(AnonymousClass1E3 r1, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        AnonymousClass1E3 r4 = this.A04;
        int i = this.A02;
        int round = Math.round(((float) (this.A00 - i)) * animatedFraction) + i;
        int i2 = this.A03;
        int round2 = Math.round(animatedFraction * ((float) (this.A01 - i2))) + i2;
        if (round != r4.A01 || round2 != r4.A02) {
            r4.A01 = round;
            r4.A02 = round2;
            r4.postInvalidateOnAnimation();
        }
    }
}
