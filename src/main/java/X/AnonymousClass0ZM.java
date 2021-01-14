package X;

/* renamed from: X.0ZM  reason: invalid class name */
public class AnonymousClass0ZM extends AnonymousClass0ZL {
    public AnonymousClass0ZM(C007303n r2, long j) {
        super(r2, j, (byte) 22);
    }

    public AnonymousClass0ZM(C007303n r2, long j, String str) {
        super(r2, j, (byte) 22);
        ((AnonymousClass0ZL) this).A00 = str;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r5) {
        C04970Mo r2 = r5.A01;
        C75783dU r0 = ((C02840Dr) r2.A00).A06;
        if (r0 == null) {
            r0 = C75783dU.A02;
        }
        AbstractC04160Jh A0B = r0.AQb();
        AnonymousClass0N3 r02 = ((C75783dU) A0B.A00).A01;
        if (r02 == null) {
            r02 = AnonymousClass0N3.A05;
        }
        AnonymousClass0NK r03 = (AnonymousClass0NK) r02.AQb();
        A0u(r03);
        A0B.A02();
        C75783dU r1 = (C75783dU) A0B.A00;
        if (r1 != null) {
            r1.A01 = (AnonymousClass0N3) r03.A01();
            r1.A00 |= 1;
            r2.A02();
            C02840Dr r22 = (C02840Dr) r2.A00;
            if (r22 != null) {
                r22.A06 = (C75783dU) A0B.A01();
                r22.A00 |= 524288;
                return;
            }
            throw null;
        }
        throw null;
    }
}
