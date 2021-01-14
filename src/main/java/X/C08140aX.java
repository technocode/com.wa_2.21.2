package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0aX  reason: invalid class name and case insensitive filesystem */
public class C08140aX extends AnimatorListenerAdapter {
    public final /* synthetic */ C08130aW A00;

    public C08140aX(C08130aW r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C08130aW r1 = this.A00;
        if (r1.A00 == animator) {
            r1.A00 = null;
        }
    }
}
