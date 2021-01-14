package X;

/* renamed from: X.3em  reason: invalid class name and case insensitive filesystem */
public final class C76583em extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76583em A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public C75443cw A01;

    static {
        C76583em r0 = new C76583em();
        A02 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            C75443cw r0 = this.A01;
            if (r0 == null) {
                r0 = C75443cw.A05;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            C75443cw r0 = this.A01;
            if (r0 == null) {
                r0 = C75443cw.A05;
            }
            r3.A0K(1, r0);
        }
        this.unknownFields.A02(r3);
    }
}
