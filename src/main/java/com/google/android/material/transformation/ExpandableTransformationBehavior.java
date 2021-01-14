package com.google.android.material.transformation;

import X.AnonymousClass1EE;
import X.AnonymousClass1EH;
import X.C008805h;
import X.C08070aQ;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean A07(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        boolean z3 = false;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        }
        AnimatorSet A08 = A08(view, view2, z, z3);
        this.A00 = A08;
        A08.addListener(new AnonymousClass1EE(this));
        this.A00.start();
        if (!z2) {
            this.A00.end();
        }
        return true;
    }

    public AnimatorSet A08(View view, View view2, boolean z, boolean z2) {
        C08070aQ r4;
        ObjectAnimator ofFloat;
        FabTransformationScrimBehavior fabTransformationScrimBehavior = (FabTransformationScrimBehavior) this;
        ArrayList arrayList = new ArrayList();
        if (z) {
            r4 = fabTransformationScrimBehavior.A01;
        } else {
            r4 = fabTransformationScrimBehavior.A00;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        r4.A00(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C008805h.A0q(animatorSet, arrayList);
        animatorSet.addListener(new AnonymousClass1EH(z, view2));
        return animatorSet;
    }
}
