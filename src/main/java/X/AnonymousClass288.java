package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.288  reason: invalid class name */
public class AnonymousClass288 extends AbstractC05460Oq {
    public boolean A00 = false;
    public final HashMap A01 = new HashMap();

    public AnonymousClass288(C007303n r2, long j) {
        super(r2, j, (byte) 38);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r7) {
        AnonymousClass0DO r0;
        AbstractC04160Jh A0B = C75643dG.A01.AQb();
        for (Map.Entry entry : this.A01.entrySet()) {
            AnonymousClass0DM r1 = (AnonymousClass0DM) entry.getKey();
            AnonymousClass0DP r02 = (AnonymousClass0DP) entry.getValue();
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
            C75543d6 A012 = AnonymousClass0DP.A01(r1, r0);
            A0B.A02();
            C75643dG r2 = (C75643dG) A0B.A00;
            if (A012 != null) {
                AbstractC04120Jd r12 = r2.A00;
                if (!((AbstractC05040Mx) r12).A00) {
                    r12 = AnonymousClass078.A04(r12);
                    r2.A00 = r12;
                }
                r12.add(A012);
            } else {
                throw null;
            }
        }
        C76403eU r22 = (C76403eU) C76413eV.A09.AQb();
        r22.A04(AnonymousClass3JY.APP_STATE_SYNC_KEY_SHARE);
        r22.A02();
        C76413eV r13 = (C76413eV) r22.A00;
        if (r13 != null) {
            r13.A05 = (C75643dG) A0B.A01();
            r13.A00 |= 32;
            C76413eV r23 = (C76413eV) r22.A01();
            C04970Mo r03 = r7.A01;
            r03.A02();
            C02840Dr r14 = (C02840Dr) r03.A00;
            if (r23 != null) {
                r14.A0Q = r23;
                r14.A00 |= 2048;
                return;
            }
            throw null;
        }
        throw null;
    }
}
