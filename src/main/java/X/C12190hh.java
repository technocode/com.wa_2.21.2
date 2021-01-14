package X;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public class C12190hh extends AbstractC007503q implements AbstractC02880Dv {
    public int A00;

    public C12190hh(C007303n r2, int i, long j) {
        super(r2, j, (byte) 36);
        this.A00 = i;
    }

    public C12190hh(C007303n r2, long j) {
        super(r2, j, (byte) 36);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r6) {
        C04970Mo r4 = r6.A01;
        C76413eV r0 = ((C02840Dr) r4.A00).A0Q;
        if (r0 == null) {
            r0 = C76413eV.A09;
        }
        C76403eU r3 = (C76403eU) r0.AQb();
        AnonymousClass0N3 r02 = ((C76413eV) r3.A00).A08;
        if (r02 == null) {
            r02 = AnonymousClass0N3.A05;
        }
        AnonymousClass0NK r2 = (AnonymousClass0NK) r02.AQb();
        C007303n r1 = this.A0n;
        r2.A06(AnonymousClass1VY.A0D(r1.A00));
        r2.A07(r1.A02);
        r3.A02();
        C76413eV r12 = (C76413eV) r3.A00;
        if (r12 != null) {
            r12.A08 = (AnonymousClass0N3) r2.A01();
            r12.A00 |= 1;
            int i = this.A00;
            r3.A02();
            C76413eV r13 = (C76413eV) r3.A00;
            r13.A00 |= 4;
            r13.A01 = i;
            r3.A04(AnonymousClass3JY.EPHEMERAL_SETTING);
            r4.A09(r3);
            return;
        }
        throw null;
    }
}
