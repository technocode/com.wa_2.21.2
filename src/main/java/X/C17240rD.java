package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0rD  reason: invalid class name and case insensitive filesystem */
public class C17240rD extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC09350ck A00;

    public C17240rD(AbstractC09350ck r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A0C();
        animator.removeListener(this);
    }
}
