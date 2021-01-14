package X;

import android.view.View;

/* renamed from: X.1p8  reason: invalid class name and case insensitive filesystem */
public class C37991p8 implements AbstractC25331Gl {
    public static final C37991p8 A00 = new C37991p8();

    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r6, AbstractC009906e r7, AbstractC008905s r8) {
        View view = (View) obj;
        AnonymousClass06c r72 = (AnonymousClass06c) r7;
        boolean z = false;
        boolean z2 = true;
        if (!r72.A03) {
            view.setImportantForAccessibility(2);
            z2 = false;
        }
        if (!(r72.A01 == null && r72.A02 == null)) {
            z = true;
        }
        if (z2 || z) {
            view.setImportantForAccessibility(1);
            view.setFocusable(true);
        }
        AnonymousClass0Q7.A0d(view, new C37981p7(r72));
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r3, AbstractC009906e r4, AbstractC008905s r5) {
        View view = (View) obj;
        AnonymousClass0Q7.A0d(view, null);
        view.setImportantForAccessibility(0);
        view.setFocusable(false);
    }
}
