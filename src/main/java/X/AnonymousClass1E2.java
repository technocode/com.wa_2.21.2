package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1E2  reason: invalid class name */
public class AnonymousClass1E2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1E3 A01;

    public AnonymousClass1E2(AnonymousClass1E3 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass1E3 r1 = this.A01;
        r1.A05 = this.A00;
        r1.A00 = 0.0f;
    }
}
