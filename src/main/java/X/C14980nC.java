package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0nC  reason: invalid class name and case insensitive filesystem */
public class C14980nC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC15000nE A01;

    public C14980nC(AbstractC15000nE r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) ((AnonymousClass1ZG) this.A01).A00.A08.getParent()).invalidate();
    }
}
