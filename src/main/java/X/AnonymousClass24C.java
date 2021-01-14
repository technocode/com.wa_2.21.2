package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.24C  reason: invalid class name */
public class AnonymousClass24C extends AbstractC30911cA {
    public AnonymousClass24C() {
    }

    public AnonymousClass24C(int i) {
        if ((i & -4) == 0) {
            ((AbstractC30911cA) this).A00 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final Animator A0V(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C17340rN.A04.A03(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C17340rN.A03, f2);
        ofFloat.addListener(new C17190r7(view));
        A07(new AnonymousClass24B(this, view));
        return ofFloat;
    }
}
