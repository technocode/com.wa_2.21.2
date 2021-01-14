package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1rX  reason: invalid class name and case insensitive filesystem */
public class C39441rX extends AnonymousClass0JW {
    public final C26481Lc A00;
    public final AnonymousClass01K A01;
    public final AnonymousClass02N A02;
    public final WeakReference A03;

    public C39441rX(AnonymousClass01K r2, C26481Lc r3, AnonymousClass1Kh r4, AnonymousClass02N r5) {
        if (r2 != null) {
            this.A01 = r2;
            if (r3 != null) {
                this.A00 = r3;
                this.A03 = new WeakReference(r4);
                this.A02 = r5;
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C26301Ki r2 = (C26301Ki) obj;
        AnonymousClass1Kh r0 = (AnonymousClass1Kh) this.A03.get();
        if (r0 != null) {
            r0.AJY(r2);
        }
    }
}
