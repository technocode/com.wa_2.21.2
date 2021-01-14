package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.RoundCornerProgressBar;

/* renamed from: X.2Fn  reason: invalid class name and case insensitive filesystem */
public class C46912Fn extends AnimatorListenerAdapter {
    public final /* synthetic */ RoundCornerProgressBar A00;

    public C46912Fn(RoundCornerProgressBar roundCornerProgressBar) {
        this.A00 = roundCornerProgressBar;
    }

    public void onAnimationStart(Animator animator) {
        this.A00.A05 = false;
    }
}
