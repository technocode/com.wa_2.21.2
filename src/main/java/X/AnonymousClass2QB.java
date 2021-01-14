package X;

/* renamed from: X.2QB  reason: invalid class name */
public class AnonymousClass2QB {
    public AnonymousClass2QA A00;
    public boolean A01;
    public boolean A02 = false;
    public final AnonymousClass2Q7 A03;

    public AnonymousClass2QB(AnonymousClass2Q7 r2) {
        this.A03 = r2;
    }

    public AnonymousClass2Q9 A00(String str, boolean z, boolean z2) {
        AnonymousClass2Q9 r3 = new AnonymousClass2Q9();
        if (!this.A02) {
            return r3;
        }
        AnonymousClass2Q7 r5 = this.A03;
        C54692fL r6 = new C54692fL(r3);
        if (r5 != null) {
            AnonymousClass00E.A01();
            C10370eW r0 = r5.A00;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            C10370eW r4 = new C10370eW(r5, r6, r5.A09, z, z2);
            r5.A00 = r4;
            r5.A0A.ANC(r4, str);
            return r3;
        }
        throw null;
    }

    public synchronized void A01() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass2Q7 r1 = this.A03;
            C54682fK r0 = new C54682fK(this);
            if (r1 != null) {
                AnonymousClass00E.A01();
                r1.A0A.ANC(new C54702fM(r1, r0), new String[0]);
                return;
            }
            throw null;
        }
    }
}
