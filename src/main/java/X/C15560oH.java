package X;

import android.transition.Transition;

/* renamed from: X.0oH  reason: invalid class name and case insensitive filesystem */
public class C15560oH implements Transition.TransitionListener {
    public final /* synthetic */ Runnable A00;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }

    public C15560oH(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onTransitionEnd(Transition transition) {
        this.A00.run();
    }
}
