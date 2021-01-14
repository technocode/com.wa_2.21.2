package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.0aZ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC08160aZ extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ C08120aV A03;

    public AbstractC08160aZ(C08120aV r1) {
        this.A03 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C08250ai r2 = this.A03.A0H;
        r2.A00(this.A00, r2.A01);
        this.A02 = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        if (!this.A02) {
            this.A01 = this.A03.A0H.A02;
            if (this instanceof C08190ac) {
                f = ((C08190ac) this).A00.A00;
            } else if (this instanceof C08150aY) {
                C08120aV r0 = ((C08150aY) this).A00;
                f = r0.A00 + r0.A03;
            } else if (!(this instanceof C08180ab)) {
                f = 0.0f;
            } else {
                C08120aV r02 = ((C08180ab) this).A00;
                f = r02.A00 + r02.A01;
            }
            this.A00 = f;
            this.A02 = true;
        }
        C08250ai r3 = this.A03.A0H;
        float f2 = this.A01;
        r3.A00((valueAnimator.getAnimatedFraction() * (this.A00 - f2)) + f2, r3.A01);
    }
}
