package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1NR  reason: invalid class name */
public class AnonymousClass1NR extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass0YP A00;

    public AnonymousClass1NR(AnonymousClass0YP r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AnonymousClass0YP r2 = this.A00;
        r2.A01.setIconified(false);
        r2.A05.setVisibility(4);
    }
}
