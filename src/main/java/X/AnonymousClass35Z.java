package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.35Z  reason: invalid class name */
public class AnonymousClass35Z extends AnimatorListenerAdapter {
    public final /* synthetic */ FloatingChildLayout A00;

    public AnonymousClass35Z(FloatingChildLayout floatingChildLayout) {
        this.A00 = floatingChildLayout;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A07.setVisibility(4);
    }
}
