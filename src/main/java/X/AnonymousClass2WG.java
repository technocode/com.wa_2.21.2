package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.2WG  reason: invalid class name */
public class AnonymousClass2WG {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public PointF A04;
    public boolean A05;

    public AnonymousClass2WG(long j, PointF pointF, int i, float f, float f2, C58742mR r12) {
        this.A04 = pointF;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.2f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A02 = ofFloat;
        ofFloat.setDuration(250L);
        this.A02.setInterpolator(accelerateInterpolator);
        this.A02.addUpdateListener(new AnonymousClass2W9(this, f, f2, i));
        this.A02.addListener(new AnonymousClass2WE(this, r12));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A03 = ofFloat2;
        ofFloat2.setDuration(200L);
        this.A03.setInterpolator(accelerateInterpolator);
        this.A03.addUpdateListener(new AnonymousClass2W8(this, f, f2));
        this.A03.addListener(new AnonymousClass2WF(r12, j));
    }
}
