package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1Kc  reason: invalid class name and case insensitive filesystem */
public class C26251Kc extends AnimatorListenerAdapter {
    public final /* synthetic */ C26281Kf A00;

    public C26251Kc(C26281Kf r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C26281Kf r1 = this.A00;
        r1.setVisibility(4);
        r1.setAlpha(1.0f);
        r1.A02();
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.A00.A0b = false;
    }
}
