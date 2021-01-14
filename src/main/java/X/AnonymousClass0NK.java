package X;

/* renamed from: X.0NK  reason: invalid class name */
public final class AnonymousClass0NK extends AbstractC04160Jh implements AnonymousClass077 {
    public AnonymousClass0NK() {
        super(AnonymousClass0N3.A05);
    }

    public void A04(String str) {
        A02();
        AnonymousClass0N3.A08((AnonymousClass0N3) this.A00, str);
    }

    public void A05(String str) {
        A02();
        AnonymousClass0N3 r1 = (AnonymousClass0N3) this.A00;
        if (str != null) {
            r1.A00 |= 8;
            r1.A02 = str;
            return;
        }
        throw null;
    }

    public void A06(String str) {
        A02();
        AnonymousClass0N3 r1 = (AnonymousClass0N3) this.A00;
        if (str != null) {
            r1.A00 |= 1;
            r1.A03 = str;
            return;
        }
        throw null;
    }

    public void A07(boolean z) {
        A02();
        AnonymousClass0N3 r1 = (AnonymousClass0N3) this.A00;
        r1.A00 |= 2;
        r1.A04 = z;
    }
}
