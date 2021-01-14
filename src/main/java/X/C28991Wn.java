package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Wn  reason: invalid class name and case insensitive filesystem */
public class C28991Wn {
    public static volatile C28991Wn A03;
    public final C002701k A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public C28991Wn(C002701k r2) {
        this.A00 = r2;
    }

    public static C28991Wn A00() {
        if (A03 == null) {
            synchronized (C28991Wn.class) {
                if (A03 == null) {
                    A03 = new C28991Wn(C002701k.A00());
                }
            }
        }
        return A03;
    }

    public final synchronized AbstractC28981Wm A01(int i, long j) {
        return (AbstractC28981Wm) A02(i).get(Long.valueOf(j));
    }

    public final Map A02(int i) {
        if (i == 0) {
            return this.A01;
        }
        if (i == 1) {
            return this.A02;
        }
        throw new RuntimeException("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public synchronized void A03(long j, AbstractC28981Wm r6) {
        if (this.A00.A0E(296)) {
            Map A022 = A02(r6.A03);
            if (A022 == null) {
                Log.w("LoggableStanzaCache/unexpected loggable stanza type");
                return;
            }
            Long valueOf = Long.valueOf(j);
            if (A022.containsKey(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append("LoggableStanzaCache/skipped caching loggable stanza:");
                sb.append(r6);
                Log.w(sb.toString());
                return;
            }
            A022.put(valueOf, r6);
        }
    }
}
