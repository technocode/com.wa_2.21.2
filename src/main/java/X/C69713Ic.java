package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Ic  reason: invalid class name and case insensitive filesystem */
public class C69713Ic {
    public final long A00;
    public final AnonymousClass00Y A01;
    public final String A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public C69713Ic(AnonymousClass00Y r3, String str) {
        this.A01 = r3;
        this.A02 = str;
        this.A00 = SystemClock.elapsedRealtime();
    }

    public void A00(String str) {
        if (this.A03.compareAndSet(false, true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            StringBuilder A0S = AnonymousClass008.A0S("PerfTimer(");
            String str2 = this.A02;
            A0S.append(str2);
            A0S.append(") done in ");
            A0S.append(elapsedRealtime);
            Log.d(A0S.toString());
            C44001zL r2 = new C44001zL();
            r2.A00 = Long.valueOf(elapsedRealtime);
            r2.A02 = str2;
            r2.A01 = str;
            this.A01.A0B(r2, null, false);
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("PerfTimer(");
        A0S2.append(this.A02);
        A0S2.append(") already stopped");
        AnonymousClass00E.A08(false, A0S2.toString());
    }
}
