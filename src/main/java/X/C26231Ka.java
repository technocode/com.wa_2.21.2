package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1Ka  reason: invalid class name and case insensitive filesystem */
public class C26231Ka extends AnimatorListenerAdapter {
    public final /* synthetic */ C26281Kf A00;

    public C26231Ka(C26281Kf r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00.A0a = false;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A0a = false;
    }

    public void onAnimationStart(Animator animator) {
        this.A00.A0a = true;
    }
}
