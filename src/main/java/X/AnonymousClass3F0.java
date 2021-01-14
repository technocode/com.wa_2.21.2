package X;

import android.util.Pair;
import java.security.PublicKey;

/* renamed from: X.3F0  reason: invalid class name */
public class AnonymousClass3F0 implements AbstractC61182sd {
    public final /* synthetic */ AbstractC61922tx A00;
    public final /* synthetic */ C61932ty A01;
    public final /* synthetic */ C61952u0 A02;

    public AnonymousClass3F0(C61932ty r1, C61952u0 r2, AbstractC61922tx r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r2) {
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r2);
        }
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        C61932ty r10 = this.A01;
        C61952u0 r3 = this.A02;
        AbstractC61922tx r15 = this.A00;
        C61902tv r5 = r10.A09;
        try {
            Pair pair = new Pair(r5.A02(2), C008805h.A0k());
            Object obj = pair.second;
            if (obj != null) {
                r10.A08.A05("[Set Touch ID] success");
                C61962u1 r2 = r10.A01;
                byte[] encoded = ((PublicKey) obj).getEncoded();
                C74783bU r9 = new C74783bU(r10, r10.A04.A00, r10.A02, r10.A03, r10.A05, r15, (String) pair.first, r3);
                byte[] A002 = C61962u1.A00("SETBIO", Boolean.TRUE, str, r2.A00.A05() / 1000, null, encoded, new Object[0]);
                r2.A01.A09(true, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "set-payment-bio", null, (byte) 0)}, r3.A00(A002)), r9, 30000);
                return;
            }
            r10.A08.A05("[Set Touch ID] failure");
        } catch (RuntimeException e) {
            r5.A02(0);
            throw e;
        }
    }
}
