package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1Kb  reason: invalid class name and case insensitive filesystem */
public class C26241Kb extends AnimatorListenerAdapter {
    public final /* synthetic */ C26281Kf A00;
    public final /* synthetic */ Runnable A01;

    public C26241Kb(C26281Kf r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        C26281Kf r2 = this.A00;
        if (r2.A09 < 0.15f) {
            r2.A03();
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            r2.post(runnable);
        }
    }

    public void onAnimationStart(Animator animator) {
        C26281Kf r1 = this.A00;
        r1.setVisibility(0);
        r1.A0b = true;
    }
}
