package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.2Hz  reason: invalid class name and case insensitive filesystem */
public class C47472Hz extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass2I2 A00;

    public C47472Hz(AnonymousClass2I2 r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        AnonymousClass2I2 r2 = this.A00;
        if (r2.A05 == 2) {
            r2.A05 = 0;
        }
    }
}
