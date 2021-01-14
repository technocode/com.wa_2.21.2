package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public final class C15430o4 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C04080Iy A02;
    public final /* synthetic */ AnonymousClass037 A03;
    public final /* synthetic */ AnonymousClass0SW A04;

    public C15430o4(ViewGroup viewGroup, View view, AnonymousClass037 r3, AnonymousClass0SW r4, C04080Iy r5) {
        this.A01 = viewGroup;
        this.A00 = view;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public void onAnimationEnd(Animator animator) {
        Animator animator2;
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        AnonymousClass037 r3 = this.A03;
        AnonymousClass0O2 r0 = r3.A0C;
        if (r0 == null) {
            animator2 = null;
        } else {
            animator2 = r0.A03;
        }
        r3.A08().A03 = null;
        if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
            ((AnonymousClass0SV) this.A04).A00(r3, this.A02);
        }
    }
}
