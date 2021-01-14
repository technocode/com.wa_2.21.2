package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.08p  reason: invalid class name and case insensitive filesystem */
public class C015708p {
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String[] A06;
    public static volatile C015708p A07;
    public final C014508d A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    static {
        String[] strArr = {"chat_row_id", "from_me", "key_id", "sender_jid_row_id", "status", "broadcast", "recipient_count", "participant_hash", "origination_flags", "origin", "timestamp", "received_timestamp", "receipt_server_timestamp", "message_type", "text_data", "starred", "lookup_tables", "sort_id"};
        A06 = strArr;
        String join = TextUtils.join(",", strArr);
        A05 = join;
        StringBuilder A0S = AnonymousClass008.A0S("INSERT INTO message(");
        A0S.append(join);
        A0S.append("    , _id ");
        A0S.append(") VALUES (");
        A0S.append(TextUtils.join(",", Collections.nCopies(A06.length + 1, "?")));
        A0S.append(")");
        A04 = A0S.toString();
        StringBuilder A0S2 = AnonymousClass008.A0S("INSERT INTO message(");
        A0S2.append(A05);
        A0S2.append(") VALUES (");
        A0S2.append(TextUtils.join(",", Collections.nCopies(A06.length, "?")));
        A0S2.append(")");
        A03 = A0S2.toString();
    }

    public C015708p(C014508d r3) {
        this.A00 = r3;
    }

    public static C015708p A00() {
        if (A07 == null) {
            synchronized (C015708p.class) {
                if (A07 == null) {
                    A07 = new C015708p(C014508d.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1VB A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.ThreadLocal r2 = r4.A01
            java.lang.Object r3 = r2.get()
            X.1VA r3 = (X.AnonymousClass1VA) r3
            if (r3 != 0) goto L_0x001a
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A02
            int r1 = r0.get()
            X.08d r0 = r4.A00
            X.1VA r3 = new X.1VA
            r3.<init>(r1, r0)
            r2.set(r3)
        L_0x001a:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A02
            int r1 = r0.get()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0029
            r3.A00()
            r3.A00 = r1
        L_0x0029:
            java.util.Map r2 = r3.A02
            boolean r0 = r2.containsKey(r5)
            if (r0 != 0) goto L_0x004b
            X.08d r0 = r3.A01
            X.0OQ r1 = r0.A03()
            X.0BK r0 = r1.A04     // Catch:{ all -> 0x0041 }
            X.1VB r0 = r0.A0A(r5, r6)     // Catch:{ all -> 0x0041 }
            r2.put(r5, r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r1.close()
        L_0x004b:
            java.lang.Object r0 = r2.get(r5)
            X.1VB r0 = (X.AnonymousClass1VB) r0
            r0.A02()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015708p.A01(java.lang.String, java.lang.String):X.1VB");
    }

    public void A02() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        AnonymousClass1VA r0 = (AnonymousClass1VA) this.A01.get();
        if (r0 != null) {
            r0.A00();
        }
    }
}
