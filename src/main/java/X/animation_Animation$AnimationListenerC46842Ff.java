package X;

import android.view.animation.Animation;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2Ff  reason: invalid class name and case insensitive filesystem */
public class animation.Animation$AnimationListenerC46842Ff implements Animation.AnimationListener {
    public final /* synthetic */ CircularRevealView A00;

    public animation.Animation$AnimationListenerC46842Ff(CircularRevealView circularRevealView) {
        this.A00 = circularRevealView;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.A0B = false;
    }

    public void onAnimationRepeat(Animation animation) {
        this.A00.A0B = true;
    }

    public void onAnimationStart(Animation animation) {
        this.A00.A0B = true;
    }
}
