package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1DY  reason: invalid class name */
public class AnonymousClass1DY extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ C08120aV A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1DY(C08120aV r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        C08120aV r1 = this.A01;
        r1.A05 = 0;
        r1.A07 = null;
        if (!this.A00) {
            C08010aK r2 = r1.A0P;
            boolean z = this.A02;
            int i = 4;
            if (z) {
                i = 8;
            }
            r2.A00(i, z);
        }
    }

    public void onAnimationStart(Animator animator) {
        C08120aV r3 = this.A01;
        r3.A0P.A00(0, this.A02);
        r3.A05 = 1;
        r3.A07 = animator;
        this.A00 = false;
    }
}
