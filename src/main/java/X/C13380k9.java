package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0k9  reason: invalid class name and case insensitive filesystem */
public class C13380k9 {
    public AbstractC13360k7 A00;
    public AbstractC13370k8 A01;
    public final AnonymousClass0T8 A02;
    public final C13060jX A03;

    public C13380k9(Context context, View view, int i, int i2) {
        AnonymousClass0T8 r3 = new AnonymousClass0T8(context);
        this.A02 = r3;
        r3.A03 = new C29651Zw(this);
        C13060jX r1 = new C13060jX(context, r3, view, false, i2, 0);
        this.A03 = r1;
        r1.A00 = i;
        r1.A02 = new C13350k6(this);
    }

    public void A00() {
        if (!this.A03.A04()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
