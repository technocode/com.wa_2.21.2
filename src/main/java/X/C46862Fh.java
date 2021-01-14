package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2Fh  reason: invalid class name and case insensitive filesystem */
public class C46862Fh extends AnimatorListenerAdapter {
    public final /* synthetic */ CircularRevealView A00;

    public C46862Fh(CircularRevealView circularRevealView) {
        this.A00 = circularRevealView;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.setVisibility(8);
    }
}
