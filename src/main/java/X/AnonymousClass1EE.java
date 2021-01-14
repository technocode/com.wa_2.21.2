package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: X.1EE  reason: invalid class name */
public class AnonymousClass1EE extends AnimatorListenerAdapter {
    public final /* synthetic */ ExpandableTransformationBehavior A00;

    public AnonymousClass1EE(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.A00 = expandableTransformationBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
    }
}
