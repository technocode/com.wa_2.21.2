package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.1EF  reason: invalid class name */
public class AnonymousClass1EF extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1EF(boolean z, View view, View view2) {
        this.A02 = z;
        this.A00 = view;
        this.A01 = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A02) {
            this.A00.setVisibility(4);
            View view = this.A01;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A00.setVisibility(0);
            View view = this.A01;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
