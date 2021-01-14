package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0PK  reason: invalid class name */
public class AnonymousClass0PK {
    public final AnonymousClass009 A00;
    public final AnonymousClass00S A01;
    public final C02290Bk A02;
    public final C014508d A03;
    public final AnonymousClass00T A04;
    public final RunnableEBaseShape4S0100000_I0_4 A05 = new RunnableEBaseShape4S0100000_I0_4(this);
    public final List A06 = new ArrayList();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();

    public AnonymousClass0PK(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass00T r4, C02290Bk r5, C014508d r6) {
        this.A01 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A00() {
        synchronized (this) {
            for (Map.Entry entry : this.A07.entrySet()) {
                Handler handler = (Handler) entry.getKey();
                this.A08.put(handler, Boolean.TRUE);
                handler.postAtFrontOfQueue((Runnable) entry.getValue());
            }
        }
        this.A04.ANO(this.A05, 120000);
    }

    public void A01(Handler handler) {
        synchronized (this) {
            this.A07.put(handler, new RunnableEBaseShape4S0200000_I0_3(this, handler));
        }
    }

    public final void A02(String str) {
        String str2;
        C02290Bk r2 = this.A02;
        boolean equals = Boolean.TRUE.equals(r2.A01.A01());
        boolean z = false;
        if (this.A01.A01() - r2.A08() < 240000) {
            z = true;
        }
        if (equals || z) {
            this.A04.ANO(this.A05, 120000);
            return;
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("StuckDbHandlerThreadDetector/not responsive, debugName:", str, " msgStoreReadLock:");
        C015008i r0 = this.A03.A02;
        if (r0 != null) {
            str2 = r0.toString();
        } else {
            str2 = null;
        }
        A0Z.append(str2);
        Log.w(A0Z.toString());
        C003701u.A0C();
        AnonymousClass009 r22 = this.A00;
        StringBuilder sb = new StringBuilder("db-thread-stuck/");
        sb.append(str);
        r22.A04(sb.toString(), null, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("db-thread-stuck/");
        sb2.append(str);
        r22.A03(sb2.toString(), 3);
    }
}
