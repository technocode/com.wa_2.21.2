package X;

import android.view.View;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public class C30131am implements AbstractC14990nD {
    @Override // X.AbstractC14990nD
    public void ACi(View view) {
        if (this instanceof AnonymousClass23V) {
            ((AnonymousClass23V) this).A00 = true;
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        if (this instanceof AnonymousClass23V) {
            ((AnonymousClass23V) this).A02.A09.setVisibility(0);
        } else if (this instanceof AnonymousClass23L) {
            AnonymousClass23L r1 = (AnonymousClass23L) this;
            if (!r1.A01) {
                r1.A01 = true;
                AbstractC14990nD r12 = r1.A02.A02;
                if (r12 != null) {
                    r12.ACo(null);
                }
            }
        } else if (this instanceof AnonymousClass23F) {
            AnonymousClass0MW r2 = ((AnonymousClass23F) this).A00;
            r2.A0K.setVisibility(0);
            r2.A0K.sendAccessibilityEvent(32);
            if (r2.A0K.getParent() instanceof View) {
                AnonymousClass0Q7.A0M((View) r2.A0K.getParent());
            }
        } else if (this instanceof AnonymousClass23E) {
            ((AnonymousClass0MW) ((AnonymousClass23E) this).A00.A00).A0K.setVisibility(0);
        }
    }
}
