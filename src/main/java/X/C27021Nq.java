package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Nq  reason: invalid class name and case insensitive filesystem */
public final class C27021Nq extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;

    public C27021Nq(View view, int i) {
        this.A01 = view;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A01;
        int i = this.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
        view.setAlpha(1.0f);
    }
}
