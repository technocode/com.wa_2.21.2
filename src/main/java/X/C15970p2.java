package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0p2  reason: invalid class name and case insensitive filesystem */
public class C15970p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ AnonymousClass240 A04;
    public final /* synthetic */ AbstractC11910hD A05;

    public C15970p2(AnonymousClass240 r1, AbstractC11910hD r2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.A04 = r1;
        this.A05 = r2;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.A03.setListener(null);
        AnonymousClass240 r2 = this.A04;
        AbstractC11910hD r1 = this.A05;
        r2.A05(r1);
        r2.A04.remove(r1);
        r2.A0A();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A04 == null) {
            throw null;
        }
    }
}
