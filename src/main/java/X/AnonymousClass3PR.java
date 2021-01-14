package X;

/* renamed from: X.3PR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3PR implements AnonymousClass37I {
    public final /* synthetic */ C74093a5 A00;

    public /* synthetic */ AnonymousClass3PR(C74093a5 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass37I
    public final void AEU(AnonymousClass37M r5) {
        C74093a5 r3 = this.A00;
        if (r5.A01() != 0) {
            r3.A04++;
        }
        r3.A01++;
        if (r3.A03 == 0) {
            int A02 = ((C71493Pe) r3).A02.A02();
            r3.A03 = A02;
            if (A02 > 1) {
                r3.A02 = r3.A0I((long) A02);
            } else {
                r3.A03 = 0;
            }
        }
        int i = r3.A04;
        int i2 = r3.A02;
        if (i >= i2 || r3.A01 >= (i2 << 2)) {
            ((AnonymousClass32V) r3).A05.A00();
            return;
        }
        r3.A00 = 0.0f;
        r5.A09(0);
        r5.A07();
    }
}
