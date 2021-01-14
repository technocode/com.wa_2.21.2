package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.36k  reason: invalid class name and case insensitive filesystem */
public class C669136k extends AnimatorListenerAdapter {
    public final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC669436n A00;

    public C669136k(ScaleGestureDetector$OnScaleGestureListenerC669436n r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        ScaleGestureDetector$OnScaleGestureListenerC669436n r2 = this.A00;
        View view = r2.A0C;
        if (view != null) {
            r2.A0H = false;
            view.setPivotX((float) (view.getMeasuredWidth() >> 1));
            View view2 = r2.A0C;
            view2.setPivotY((float) (view2.getMeasuredHeight() >> 1));
        }
    }
}
