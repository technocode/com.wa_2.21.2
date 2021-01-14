package X;

/* renamed from: X.3dE  reason: invalid class name and case insensitive filesystem */
public final class C75623dE extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75623dE A01;
    public static volatile AbstractC37151nd A02;
    public AbstractC04120Jd A00 = C05030Mw.A01;

    static {
        C75623dE r0 = new C75623dE();
        A01 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00.size(); i3++) {
            i2 += AbstractC11750gu.A08(1, (AnonymousClass076) this.A00.get(i3));
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        for (int i = 0; i < this.A00.size(); i++) {
            r4.A0K(1, (AnonymousClass076) this.A00.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
