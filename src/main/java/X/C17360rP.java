package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0rP  reason: invalid class name and case insensitive filesystem */
public class C17360rP extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC30871c5 A01;
    public final /* synthetic */ AbstractC30911cA A02;

    public C17360rP(AbstractC30911cA r1, AbstractC30871c5 r2, View view) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.AMa(this.A00);
    }
}
