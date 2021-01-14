package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.1EH  reason: invalid class name */
public class AnonymousClass1EH extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass1EH(boolean z, View view) {
        this.A01 = z;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            this.A00.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A01) {
            this.A00.setVisibility(0);
        }
    }
}
