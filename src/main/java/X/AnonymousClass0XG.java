package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.0XG  reason: invalid class name */
public class AnonymousClass0XG implements AnonymousClass0C0 {
    public final AnonymousClass0XF A00;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{179};
    }

    public AnonymousClass0XG(AnonymousClass0XF r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 179) {
            return false;
        }
        Bundle data = message.getData();
        String string = data.getString("nonce");
        if (string != null) {
            String string2 = data.getString("apiKey");
            if (string2 != null) {
                AnonymousClass0XF r5 = this.A00;
                AnonymousClass00G r1 = r5.A00;
                int A002 = AnonymousClass0IZ.A00(r1.A00);
                if (A002 == 0) {
                    C36071lX r0 = new C36071lX(r1.A00);
                    byte[] bytes = string.getBytes();
                    AnonymousClass178 r12 = r0.A04;
                    AbstractC457025y A003 = r12.A00(new AnonymousClass2BV(r12, bytes, string2));
                    C35311k8 r3 = new C35311k8(new C36051lV());
                    AnonymousClass187 r2 = AnonymousClass188.A00;
                    C24611Bq r13 = new C24611Bq();
                    A003.A00(new C35301k7(A003, r13, r3, r2));
                    C011506v r22 = r13.A00;
                    C70923Mx r14 = new C70923Mx(r5);
                    Executor executor = AnonymousClass070.A00;
                    r22.A02(executor, r14);
                    r22.A01(executor, new C70933My(r5));
                    return true;
                }
                AnonymousClass0AR r4 = r5.A01;
                StringBuilder sb = new StringBuilder("Attestation API Unavailable. Connection result code: ");
                sb.append(A002);
                r4.A0O(null, 1001, sb.toString());
                Log.i("requestAttestation/cannot request attestation Google APIs unavailable");
                return true;
            }
            throw null;
        }
        throw null;
    }
}
