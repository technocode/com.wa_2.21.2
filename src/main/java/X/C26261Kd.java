package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1Kd  reason: invalid class name and case insensitive filesystem */
public class C26261Kd extends AnimatorListenerAdapter {
    public final /* synthetic */ C26281Kf A00;
    public final /* synthetic */ Runnable A01;

    public C26261Kd(C26281Kf r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        C26281Kf r1 = this.A00;
        r1.A00();
        Runnable runnable = this.A01;
        if (runnable != null) {
            r1.post(runnable);
        }
    }
}
