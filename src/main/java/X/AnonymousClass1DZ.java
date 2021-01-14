package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1DZ  reason: invalid class name */
public class AnonymousClass1DZ extends AnimatorListenerAdapter {
    public final /* synthetic */ C08120aV A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass1DZ(C08120aV r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationEnd(Animator animator) {
        C08120aV r1 = this.A00;
        r1.A05 = 0;
        r1.A07 = null;
    }

    public void onAnimationStart(Animator animator) {
        C08120aV r3 = this.A00;
        r3.A0P.A00(0, this.A01);
        r3.A05 = 2;
        r3.A07 = animator;
    }
}
