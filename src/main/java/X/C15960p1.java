package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0p1  reason: invalid class name and case insensitive filesystem */
public class C15960p1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ AnonymousClass240 A02;
    public final /* synthetic */ AbstractC11910hD A03;

    public C15960p1(AnonymousClass240 r1, AbstractC11910hD r2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        AnonymousClass240 r2 = this.A02;
        AbstractC11910hD r1 = this.A03;
        r2.A05(r1);
        r2.A00.remove(r1);
        r2.A0A();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02 == null) {
            throw null;
        }
    }
}
