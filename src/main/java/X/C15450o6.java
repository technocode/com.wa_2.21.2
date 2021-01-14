package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0o6  reason: invalid class name and case insensitive filesystem */
public class C15450o6 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass037 A02;

    public C15450o6(ViewGroup viewGroup, View view, AnonymousClass037 r3) {
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.endViewTransition(this.A00);
        animator.removeListener(this);
        AnonymousClass037 r0 = this.A02;
        View view = r0.A0A;
        if (view != null && r0.A0Z) {
            view.setVisibility(8);
        }
    }
}
