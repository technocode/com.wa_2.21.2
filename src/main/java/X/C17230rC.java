package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0rC  reason: invalid class name and case insensitive filesystem */
public class C17230rC extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass05V A00;
    public final /* synthetic */ AbstractC09350ck A01;

    public C17230rC(AbstractC09350ck r1, AnonymousClass05V r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.remove(animator);
        this.A01.A0C.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.A01.A0C.add(animator);
    }
}
