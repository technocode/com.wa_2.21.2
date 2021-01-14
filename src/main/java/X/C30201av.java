package X;

import android.view.View;

/* renamed from: X.1av  reason: invalid class name and case insensitive filesystem */
public final class C30201av implements AbstractC14740mo {
    public final /* synthetic */ AnonymousClass037 A00;

    public C30201av(AnonymousClass037 r1) {
        this.A00 = r1;
    }

    public void A00() {
        View view;
        AnonymousClass037 r3 = this.A00;
        AnonymousClass0O2 r0 = r3.A0C;
        if (r0 == null) {
            view = null;
        } else {
            view = r0.A04;
        }
        if (view != null) {
            r3.A08().A04 = null;
            view.clearAnimation();
        }
        r3.A08().A03 = null;
    }
}
