package X;

/* renamed from: X.0ZJ  reason: invalid class name */
public class AnonymousClass0ZJ extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv {
    public String A00;

    public AnonymousClass0ZJ(C007303n r2, long j) {
        super(r2, j, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
    }

    public AnonymousClass0ZJ(C007303n r2, long j, String str) {
        super(r2, j, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = str;
    }

    public AnonymousClass0ZJ(C007303n r4, AbstractC007503q r5) {
        super(r4, r5.A0E, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = r5.A0n.A01;
        this.A0G = r5.A07();
        this.A0d = r5.A0M();
    }

    public AnonymousClass0ZJ(C007303n r4, String str) {
        super(r4, 0, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = str;
    }

    public AnonymousClass0ZJ(AnonymousClass0ZJ r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r8.A00;
        super.A00 = ((AbstractC007503q) r8).A00;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r6) {
        C04970Mo r3 = r6.A01;
        C76413eV r0 = ((C02840Dr) r3.A00).A0Q;
        if (r0 == null) {
            r0 = C76413eV.A09;
        }
        C76403eU r2 = (C76403eU) r0.AQb();
        AnonymousClass0N3 r02 = ((C76413eV) r2.A00).A08;
        if (r02 == null) {
            r02 = AnonymousClass0N3.A05;
        }
        AnonymousClass0NK r4 = (AnonymousClass0NK) r02.AQb();
        C007303n r1 = this.A0n;
        r4.A06(AnonymousClass1VY.A0D(r1.A00));
        r4.A07(r1.A02);
        String str = this.A00;
        if (str != null) {
            r4.A04(str);
        } else {
            r4.A04(r1.A01);
        }
        AnonymousClass02N r03 = this.A0G;
        if (r03 != null) {
            r4.A05(r03.getRawString());
        }
        r2.A02();
        C76413eV r12 = (C76413eV) r2.A00;
        if (r12 != null) {
            r12.A08 = (AnonymousClass0N3) r4.A01();
            r12.A00 |= 1;
            r2.A04(AnonymousClass3JY.REVOKE);
            r3.A09(r2);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r4) {
        return new AnonymousClass0ZJ(this, r4, this.A0E);
    }
}
