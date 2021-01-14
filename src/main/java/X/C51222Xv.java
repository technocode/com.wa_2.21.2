package X;

/* renamed from: X.2Xv  reason: invalid class name and case insensitive filesystem */
public class C51222Xv extends AnonymousClass0DZ {
    public final C04410Kg A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00G A02;
    public final C006903j A03;
    public final AnonymousClass01K A04;

    public C51222Xv(AnonymousClass00S r1, AnonymousClass00G r2, C006903j r3, AnonymousClass01K r4, AnonymousClass0DU r5, C04410Kg r6) {
        super(r5);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = r6;
    }

    public final void A06(C52732bf r5) {
        AnonymousClass02N r2 = r5.A00;
        if (this.A03.A05(r2) == null) {
            A04(r5);
            return;
        }
        int A002 = C28191Tg.A00(C28191Tg.A02(this.A04, r2, false), r5.A01);
        if (A002 != 0) {
            if (A002 != 1) {
                if (A002 == 2) {
                    if (r5.A02) {
                        this.A00.A03(r5.A00, false, true);
                    } else {
                        this.A00.A01(r5.A00, false);
                    }
                    A03(r5);
                    return;
                } else if (A002 != 3) {
                    throw new IllegalArgumentException(AnonymousClass008.A0F("mark-chat-as-read-handler/applyMutation RangeEnclosedState is not recognized or not used = ", A002));
                }
            }
            A04(r5);
            return;
        }
        A03(r5);
    }
}
