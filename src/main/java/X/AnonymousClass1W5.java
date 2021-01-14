package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1W5  reason: invalid class name */
public class AnonymousClass1W5 {
    public AtomicInteger A00 = new AtomicInteger();
    public final AbstractC29171Xj A01;

    public AnonymousClass1W5(AbstractC29171Xj r2) {
        this.A01 = r2;
    }

    public Object A00(AnonymousClass1W4 r8) {
        AbstractC29171Xj r6 = this.A01;
        AnonymousClass0J5 A5o = r6.A5o();
        if (A5o == null) {
            Log.d("transfer-retries/no routes");
            return null;
        }
        boolean z = false;
        AnonymousClass1W3 r4 = null;
        while (A5o != null) {
            StringBuilder A0S = AnonymousClass008.A0S("transfer-retries/run attempt = ");
            A0S.append(r6.A5l());
            A0S.append("; route = ");
            A0S.append(A5o.A02);
            Log.d(A0S.toString());
            r4 = r8.AN8(A5o);
            if (z) {
                this.A00.incrementAndGet();
            }
            if (r4.A04) {
                return r4.A01;
            }
            boolean z2 = r4.A03;
            int i = r4.A00;
            r6.AFg(z2, i);
            if (!r4.A02) {
                AnonymousClass008.A1K(AnonymousClass008.A0S("transfer-retries/run error; don't retry, responseCode="), i);
                return r4.A01;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("transfer-retries/run error; retry, hasProgress=");
            A0S2.append(z2);
            A0S2.append("; responseCode=");
            AnonymousClass008.A1K(A0S2, i);
            z = true;
            try {
                Thread.sleep(r6.A4t());
                A5o = r6.A5o();
            } catch (InterruptedException unused) {
                Log.d("transfer-retries/interrupted; return");
                Thread.currentThread().interrupt();
            }
        }
        if (r4 != null) {
            return r4.A01;
        }
        return null;
    }
}
