package X;

/* renamed from: X.3ez  reason: invalid class name and case insensitive filesystem */
public final class C76713ez extends AbstractC04160Jh implements AnonymousClass077 {
    public C76713ez() {
        super(C76723f0.A08);
    }

    public void A04(C76703ey r4) {
        A02();
        C76723f0 r2 = (C76723f0) this.A00;
        if (r4 != null) {
            AbstractC04120Jd r1 = r2.A05;
            if (!((AbstractC05040Mx) r1).A00) {
                r1 = AnonymousClass078.A04(r1);
                r2.A05 = r1;
            }
            r1.add(r4);
            return;
        }
        throw null;
    }

    public void A05(EnumC69963Jf r3) {
        A02();
        C76723f0 r1 = (C76723f0) this.A00;
        if (r3 != null) {
            r1.A01 |= 1;
            r1.A04 = r3.value;
            return;
        }
        throw null;
    }
}
