package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0nB  reason: invalid class name and case insensitive filesystem */
public class C14970nB extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC14990nD A01;

    public C14970nB(AbstractC14990nD r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01.ACi(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.ACk(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        this.A01.ACo(this.A00);
    }
}
