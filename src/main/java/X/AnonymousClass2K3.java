package X;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* renamed from: X.2K3  reason: invalid class name */
public class AnonymousClass2K3 extends LayoutTransition {
    public AnonymousClass2K3() {
        setAnimator(2, A00(true));
        setAnimator(3, A00(false));
        setDuration(100);
        setStartDelay(2, 0);
        setStartDelay(0, 0);
        setStartDelay(1, 0);
    }

    public static final Animator A00(boolean z) {
        float f = (float) (!z ? 1 : 0);
        float f2 = z ? 1.0f : 0.0f;
        return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("scaleX", f, f2), PropertyValuesHolder.ofFloat("scaleY", f, f2));
    }
}
