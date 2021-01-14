package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.1OX  reason: invalid class name */
public class AnonymousClass1OX extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;

    public AnonymousClass1OX(View view) {
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A00;
        view.setVisibility(8);
        view.setAlpha(1.0f);
    }
}
