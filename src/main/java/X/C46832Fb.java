package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.components.AnimatingArrowsLayout;

/* renamed from: X.2Fb  reason: invalid class name and case insensitive filesystem */
public class C46832Fb extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatingArrowsLayout A00;

    public C46832Fb(AnimatingArrowsLayout animatingArrowsLayout) {
        this.A00 = animatingArrowsLayout;
    }

    public void onAnimationEnd(Animator animator) {
        AnimatingArrowsLayout animatingArrowsLayout = this.A00;
        animatingArrowsLayout.post(new RunnableEBaseShape8S0100000_I1_3(animatingArrowsLayout.A01, 40));
    }
}
