package X;

/* renamed from: X.28E  reason: invalid class name */
public class AnonymousClass28E extends AbstractC05460Oq {
    public boolean A00;

    public AnonymousClass28E(C007303n r2, long j) {
        super(r2, j, (byte) 47);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r7) {
        C04970Mo r5 = r7.A01;
        C76413eV r0 = ((C02840Dr) r5.A00).A0Q;
        if (r0 == null) {
            r0 = C76413eV.A09;
        }
        C76403eU r4 = (C76403eU) r0.AQb();
        C76163e6 r02 = ((C76413eV) r4.A00).A07;
        if (r02 == null) {
            r02 = C76163e6.A02;
        }
        AbstractC04160Jh A0B = r02.AQb();
        boolean z = this.A00;
        A0B.A02();
        C76163e6 r1 = (C76163e6) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = z;
        r4.A04(AnonymousClass3JY.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC);
        r4.A02();
        C76413eV r12 = (C76413eV) r4.A00;
        if (r12 != null) {
            r12.A07 = (C76163e6) A0B.A01();
            r12.A00 |= 128;
            r5.A09(r4);
            return;
        }
        throw null;
    }
}
