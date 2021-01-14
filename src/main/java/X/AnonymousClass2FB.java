package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.2FB  reason: invalid class name */
public class AnonymousClass2FB extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass2XW A00;

    public AnonymousClass2FB(AnonymousClass2XW r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A01.setVisibility(8);
    }
}
