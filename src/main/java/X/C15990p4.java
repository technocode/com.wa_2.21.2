package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
public class C15990p4 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C16000p5 A02;
    public final /* synthetic */ AnonymousClass240 A03;

    public C15990p4(AnonymousClass240 r1, C16000p5 r2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        View view = this.A00;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AnonymousClass240 r3 = this.A03;
        C16000p5 r2 = this.A02;
        r3.A05(r2.A04);
        r3.A02.remove(r2.A04);
        r3.A0A();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03 == null) {
            throw null;
        }
    }
}
