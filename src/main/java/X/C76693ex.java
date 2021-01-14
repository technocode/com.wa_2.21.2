package X;

/* renamed from: X.3ex  reason: invalid class name and case insensitive filesystem */
public final class C76693ex extends AbstractC04160Jh implements AnonymousClass077 {
    public C76693ex() {
        super(C76703ey.A0E);
    }

    public void A04(EnumC69953Je r3) {
        A02();
        C76703ey r1 = (C76703ey) this.A00;
        if (r3 != null) {
            r1.A01 |= 512;
            r1.A02 = r3.value;
            return;
        }
        throw null;
    }

    public void A05(String str) {
        A02();
        C76703ey r1 = (C76703ey) this.A00;
        if (str != null) {
            r1.A01 |= 1;
            r1.A09 = str;
            return;
        }
        throw null;
    }
}
