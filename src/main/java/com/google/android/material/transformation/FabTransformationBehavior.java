package com.google.android.material.transformation;

import X.AnonymousClass0Q7;
import X.AnonymousClass1EG;
import X.C08060aP;
import X.C08070aQ;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00;
    public final RectF A01;
    public final RectF A02;
    public final int[] A03;

    public FabTransformationBehavior() {
        this.A00 = new Rect();
        this.A01 = new RectF();
        this.A02 = new RectF();
        this.A03 = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new Rect();
        this.A01 = new RectF();
        this.A02 = new RectF();
        this.A03 = new int[2];
    }

    public static final float A00(AnonymousClass1EG r7, C08070aQ r8, float f) {
        long j = r8.A02;
        long j2 = r8.A03;
        C08070aQ A032 = r7.A00.A03("expansion");
        float f2 = ((float) (((A032.A02 + A032.A03) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = r8.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08060aP.A02;
        }
        return ((0.0f - f) * timeInterpolator.getInterpolation(f2)) + f;
    }

    public static final void A01(View view, View view2, boolean z, boolean z2, AnonymousClass1EG r9, List list) {
        ObjectAnimator ofFloat;
        float A002 = AnonymousClass0Q7.A00(view2) - AnonymousClass0Q7.A00(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-A002);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -A002);
        }
        r9.A00.A03("elevation").A00(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015a, code lost:
        if (r2 != false) goto L_0x0104;
     */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet A08(android.view.View r23, android.view.View r24, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A08(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void A09(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.A03;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }
}
