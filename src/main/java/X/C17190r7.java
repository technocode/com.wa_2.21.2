package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0r7  reason: invalid class name and case insensitive filesystem */
public class C17190r7 extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final View A01;

    public C17190r7(View view) {
        this.A01 = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A01;
        C17340rN.A04.A03(view, 1.0f);
        if (this.A00) {
            view.setLayerType(0, null);
        }
    }

    public void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, null);
        }
    }
}
