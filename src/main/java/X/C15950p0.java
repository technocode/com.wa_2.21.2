package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0p0  reason: invalid class name and case insensitive filesystem */
public class C15950p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ AnonymousClass240 A02;
    public final /* synthetic */ AbstractC11910hD A03;

    public C15950p0(AnonymousClass240 r1, AbstractC11910hD r2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        this.A00.setAlpha(1.0f);
        AnonymousClass240 r2 = this.A02;
        AbstractC11910hD r1 = this.A03;
        r2.A05(r1);
        r2.A0A.remove(r1);
        r2.A0A();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02 == null) {
            throw null;
        }
    }
}
