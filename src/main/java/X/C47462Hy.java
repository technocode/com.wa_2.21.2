package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.2Hy  reason: invalid class name and case insensitive filesystem */
public class C47462Hy extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass2I2 A00;

    public C47462Hy(AnonymousClass2I2 r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        AnonymousClass2I2 r2 = this.A00;
        if (r2.A05 == 2) {
            r2.A05 = 0;
        }
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass2I2 r2 = this.A00;
        if (r2.A05 == 2) {
            r2.A05 = 0;
        }
    }
}
