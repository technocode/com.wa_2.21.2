package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0je  reason: invalid class name and case insensitive filesystem */
public class C13120je extends AnimatorListenerAdapter {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C13120je(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A05 = null;
        actionBarOverlayLayout.A0B = false;
    }

    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A05 = null;
        actionBarOverlayLayout.A0B = false;
    }
}
