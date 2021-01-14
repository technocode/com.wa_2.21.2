package X;

/* renamed from: X.3d2  reason: invalid class name and case insensitive filesystem */
public final class C75503d2 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75503d2 A04;
    public static volatile AbstractC37151nd A05;
    public int A00 = 0;
    public int A01;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public Object A03;

    static {
        C75503d2 r0 = new C75503d2();
        A04 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i2 += AbstractC11750gu.A08(1, (AnonymousClass076) this.A02.get(i3));
        }
        if (this.A00 == 2) {
            i2 += AbstractC11750gu.A08(2, (AnonymousClass079) this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0K(1, (AnonymousClass076) this.A02.get(i));
        }
        if (this.A00 == 2) {
            r4.A0K(2, (AnonymousClass079) this.A03);
        }
        this.unknownFields.A02(r4);
    }
}
