package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.0aW  reason: invalid class name and case insensitive filesystem */
public final class C08130aW {
    public ValueAnimator A00 = null;
    public C08170aa A01 = null;
    public final Animator.AnimatorListener A02 = new C08140aX(this);
    public final ArrayList A03 = new ArrayList();

    public void A00(int[] iArr, ValueAnimator valueAnimator) {
        C08170aa r1 = new C08170aa(iArr, valueAnimator);
        valueAnimator.addListener(this.A02);
        this.A03.add(r1);
    }
}
