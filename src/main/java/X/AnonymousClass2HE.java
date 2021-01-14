package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.2HE  reason: invalid class name */
public class AnonymousClass2HE extends AnimatorListenerAdapter {
    public final /* synthetic */ C51472Yw A00;
    public final /* synthetic */ AnonymousClass2Z2 A01;

    public AnonymousClass2HE(AnonymousClass2Z2 r1, C51472Yw r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass2Z2 r1 = this.A01;
        r1.A05(this.A00);
        r1.A01.setTranslationY(0.0f);
    }
}
