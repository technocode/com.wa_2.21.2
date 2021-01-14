package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.287  reason: invalid class name */
public class AnonymousClass287 extends AbstractC05460Oq {
    public final Set A00 = new HashSet();

    public AnonymousClass287(C007303n r2, long j) {
        super(r2, j, (byte) 39);
    }

    public AnonymousClass287(C007303n r5, long j, C75623dE r8) {
        super(r5, j, (byte) 39);
        for (C75603dC r2 : r8.A00) {
            AnonymousClass0DM A002 = AnonymousClass0DM.A00(r2);
            if (A002 != null) {
                this.A00.add(A002);
            } else {
                StringBuilder sb = new StringBuilder("FMessageAppStateSyncKeyRequest message missing fields for keyId: ");
                sb.append(r2);
                Log.e(sb.toString());
            }
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r7) {
        AbstractC04160Jh A0B = C75623dE.A01.AQb();
        for (AnonymousClass0DM r0 : this.A00) {
            C75603dC A03 = r0.A03();
            A0B.A02();
            C75623dE r2 = (C75623dE) A0B.A00;
            if (A03 != null) {
                AbstractC04120Jd r1 = r2.A00;
                if (!((AbstractC05040Mx) r1).A00) {
                    r1 = AnonymousClass078.A04(r1);
                    r2.A00 = r1;
                }
                r1.add(A03);
            } else {
                throw null;
            }
        }
        C76403eU r22 = (C76403eU) C76413eV.A09.AQb();
        r22.A04(AnonymousClass3JY.APP_STATE_SYNC_KEY_REQUEST);
        r22.A02();
        C76413eV r12 = (C76413eV) r22.A00;
        if (r12 != null) {
            r12.A04 = (C75623dE) A0B.A01();
            r12.A00 |= 64;
            C76413eV r23 = (C76413eV) r22.A01();
            C04970Mo r02 = r7.A01;
            r02.A02();
            C02840Dr r13 = (C02840Dr) r02.A00;
            if (r23 != null) {
                r13.A0Q = r23;
                r13.A00 |= 2048;
                return;
            }
            throw null;
        }
        throw null;
    }
}
