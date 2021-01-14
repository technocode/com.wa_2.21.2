package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: X.1DE  reason: invalid class name */
public class AnonymousClass1DE extends AnimatorListenerAdapter {
    public final /* synthetic */ HideBottomViewOnScrollBehavior A00;

    public AnonymousClass1DE(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.A00 = hideBottomViewOnScrollBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A02 = null;
    }
}
