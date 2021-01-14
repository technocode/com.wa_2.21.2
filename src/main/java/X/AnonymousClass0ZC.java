package X;

/* renamed from: X.0ZC  reason: invalid class name */
public class AnonymousClass0ZC extends AnonymousClass0MO implements AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass0ZC(C007303n r2, long j) {
        super(r2, j, (byte) 3);
    }

    public AnonymousClass0ZC(C007303n r2, long j, byte b) {
        super(r2, j, (byte) 28);
    }

    public AnonymousClass0ZC(C007303n r9, long j, C76563ek r12, boolean z, boolean z2) {
        super(r9, j, r12, z, z2, (byte) 3);
        A13(r12);
    }

    public AnonymousClass0ZC(AnonymousClass0ZC r9, C007303n r10, long j, AnonymousClass0M4 r13) {
        super((AnonymousClass0M3) r9, r10, j, r13, false, (byte) 3);
    }

    public AnonymousClass0ZC(AnonymousClass0ZC r9, C007303n r10, long j, AnonymousClass0M4 r13, boolean z) {
        super(r9, r10, j, r13, z, r9.A0m);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r15) {
        AnonymousClass078 r0;
        if (!(this instanceof AnonymousClass2CF)) {
            C04970Mo r1 = r15.A01;
            C76563ek r02 = ((C02840Dr) r1.A00).A0Y;
            if (r02 == null) {
                r02 = C76563ek.A0K;
            }
            C76553ej r03 = (C76553ej) r02.AQb();
            A12(r03, r15);
            r1.A0B(r03);
            return;
        }
        AnonymousClass2CF r7 = (AnonymousClass2CF) this;
        C04970Mo r4 = r15.A01;
        C76523eg r3 = (C76523eg) r4.A04().AQb();
        AnonymousClass01I r8 = r15.A00;
        AnonymousClass0OH r2 = r4.A04().A03;
        if (r2 == null) {
            r2 = AnonymousClass0OH.A07;
        }
        if (r2.A01 == 4) {
            r0 = (AnonymousClass078) r2.A03;
        } else {
            r0 = C76563ek.A0K;
        }
        boolean z = r15.A04;
        C76553ej A11 = r7.A11(r8, (C76553ej) r0.AQb(), z, r15.A03, r15.A02, r15.A05);
        AnonymousClass0M4 r04 = ((AnonymousClass0M3) r7).A02;
        if (r04 == null || ((!z && r04.A0U == null) || A11 == null)) {
            AnonymousClass008.A1M(AnonymousClass008.A0S("FMessageTemplateVideo/unable to send encrypted media message due to missing; media_wa_type="), r7.A0m);
            return;
        }
        C05450Op A0u = r7.A0u();
        if (A0u != null) {
            byte[] A05 = A0u.A05();
            if (A05 != null) {
                AnonymousClass071 A00 = AnonymousClass071.A00(A05, 0, A05.length);
                A11.A02();
                C76563ek r22 = (C76563ek) A11.A00;
                r22.A00 |= 32768;
                r22.A0B = A00;
            }
            AnonymousClass0OF r05 = r7.A00;
            if (r05 != null) {
                AnonymousClass0OI A0x = C002001d.A0x(r4, r05);
                A0x.A02();
                AnonymousClass0OH r12 = (AnonymousClass0OH) A0x.A00;
                if (r12 != null) {
                    r12.A03 = A11.A01();
                    r12.A01 = 4;
                    r3.A05(A0x);
                    r3.A04(A0x);
                    r4.A0A(r3);
                    return;
                }
                throw null;
            }
            AnonymousClass008.A1M(AnonymousClass008.A0S("MessageTemplateVideo: cannot send encrypted media message, "), r7.A0m);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public /* bridge */ /* synthetic */ AbstractC007503q A2n(C007303n r8) {
        if (this instanceof AnonymousClass2CF) {
            AnonymousClass2CF r1 = (AnonymousClass2CF) this;
            return new AnonymousClass2CF(r1, r8, r1.A0E, ((AnonymousClass0M3) r1).A02);
        } else if (!(this instanceof AnonymousClass2CF)) {
            return new AnonymousClass0ZC(this, r8, this.A0E, ((AnonymousClass0M3) this).A02, true);
        } else {
            AnonymousClass2CF r12 = (AnonymousClass2CF) this;
            return new AnonymousClass2CF(r12, r8, r12.A0E, ((AnonymousClass0M3) r12).A02);
        }
    }
}
