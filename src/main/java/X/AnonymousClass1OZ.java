package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1OZ  reason: invalid class name */
public class AnonymousClass1OZ extends AnimatorListenerAdapter {
    public final /* synthetic */ C27131Oe A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1OZ(C27131Oe r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A0N(this.A02, this.A01, false);
    }

    public void onAnimationStart(Animator animator) {
        C26281Kf r0 = this.A00.A0T;
        if (r0 != null) {
            r0.A00();
        }
    }
}
