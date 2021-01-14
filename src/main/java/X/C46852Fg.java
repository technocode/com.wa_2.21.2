package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2Fg  reason: invalid class name and case insensitive filesystem */
public class C46852Fg extends AnimatorListenerAdapter {
    public final /* synthetic */ CircularRevealView A00;

    public C46852Fg(CircularRevealView circularRevealView) {
        this.A00 = circularRevealView;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00.A0B = true;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A0B = false;
    }

    public void onAnimationStart(Animator animator) {
        this.A00.A0B = true;
    }
}
