package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0pE  reason: invalid class name and case insensitive filesystem */
public class C16080pE extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ C30441bM A01;

    public C16080pE(C30441bM r2) {
        this.A01 = r2;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        C30441bM r2 = this.A01;
        if (((Number) r2.A0K.getAnimatedValue()).floatValue() == 0.0f) {
            r2.A02 = 0;
            r2.A02(0);
            return;
        }
        r2.A02 = 2;
        r2.A0B.invalidate();
    }
}
