package X;

/* renamed from: X.0MK  reason: invalid class name */
public class AnonymousClass0MK extends AnonymousClass0ML implements AnonymousClass0MM, AbstractC02870Du, AbstractC02880Dv {
    public int A00 = 0;

    public AnonymousClass0MK(C007303n r2, long j) {
        super(r2, j, (byte) 43);
    }

    public AnonymousClass0MK(C007303n r2, long j, C76563ek r5, boolean z, boolean z2) {
        super(r2, j, (byte) 43);
        A14(r5, z, z2);
    }

    public AnonymousClass0MK(AnonymousClass0MK r10, C007303n r11, long j, AnonymousClass0M4 r14) {
        super((AnonymousClass0M3) r10, r11, j, r14, true, r10.A0m);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r9) {
        C04970Mo r4 = r9.A01;
        C75963dm r0 = ((C02840Dr) r4.A00).A0F;
        if (r0 == null) {
            r0 = C75963dm.A02;
        }
        AbstractC04160Jh A0B = r0.AQb();
        C02840Dr r02 = ((C75963dm) A0B.A00).A01;
        if (r02 == null) {
            r02 = C02840Dr.A0b;
        }
        AbstractC04160Jh A0B2 = r02.AQb();
        C76563ek r03 = ((C02840Dr) A0B2.A00).A0Y;
        if (r03 == null) {
            r03 = C76563ek.A0K;
        }
        C76553ej r6 = (C76553ej) r03.AQb();
        A12(r6, r9);
        r6.A02();
        C76563ek r2 = (C76563ek) r6.A00;
        r2.A00 |= 131072;
        r2.A0J = true;
        C76563ek r04 = (C76563ek) r6.A01();
        A0B2.A02();
        C02840Dr r1 = (C02840Dr) A0B2.A00;
        if (r04 != null) {
            r1.A0Y = r04;
            r1.A00 |= 256;
            C02840Dr r05 = (C02840Dr) A0B2.A01();
            A0B.A02();
            C75963dm r12 = (C75963dm) A0B.A00;
            if (r05 != null) {
                r12.A01 = r05;
                r12.A00 |= 1;
                C75963dm r06 = (C75963dm) A0B.A01();
                r4.A02();
                C02840Dr r22 = (C02840Dr) r4.A00;
                if (r06 != null) {
                    r22.A0F = r06;
                    r22.A00 |= 268435456;
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r7) {
        long j = this.A0E;
        AnonymousClass0M4 r5 = ((AnonymousClass0M3) this).A02;
        if (r5 != null) {
            return new AnonymousClass0MK(this, r7, j, r5);
        }
        throw null;
    }

    @Override // X.AnonymousClass0MM
    public int A9o() {
        return this.A00;
    }

    @Override // X.AnonymousClass0MM
    public void APJ(int i) {
        this.A00 = i;
    }
}
