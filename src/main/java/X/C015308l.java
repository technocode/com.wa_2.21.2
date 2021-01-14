package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08l  reason: invalid class name and case insensitive filesystem */
public class C015308l {
    public static volatile C015308l A06;
    public final AnonymousClass009 A00;
    public final C014508d A01;
    public final C015408m A02;
    public final C015708p A03;
    public final Map A04 = new ConcurrentHashMap();
    public final Map A05 = new ConcurrentHashMap();

    public C015308l(AnonymousClass009 r2, C015408m r3, C015708p r4, C014508d r5) {
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public static C015308l A00() {
        if (A06 == null) {
            synchronized (C015308l.class) {
                if (A06 == null) {
                    A06 = new C015308l(AnonymousClass009.A00(), C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A06;
    }

    public static final void A01(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        StringBuilder A0a = AnonymousClass008.A0a(str, " user=", str2, " server=", str3);
        A0a.append(" agent=");
        A0a.append(i);
        A0a.append(" device=");
        A0a.append(i2);
        A0a.append(" type=");
        A0a.append(i3);
        A0a.append(" rawString=");
        A0a.append(str4);
        Log.e(A0a.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02d4, code lost:
        if (r4 != null) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0333, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0337, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x033a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x033e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A02(com.whatsapp.jid.Jid r19) {
        /*
        // Method dump skipped, instructions count: 831
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015308l.A02(com.whatsapp.jid.Jid):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r1 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A03(com.whatsapp.jid.Jid r14) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015308l.A03(com.whatsapp.jid.Jid):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.Jid A04(long r8) {
        /*
            r7 = this;
            r6 = 0
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
            return r6
        L_0x0008:
            java.util.Map r2 = r7.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r2.get(r1)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            return r0
        L_0x001b:
            X.08d r0 = r7.A01
            X.0OQ r3 = r0.A03()
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x0056 }
            r2[r1] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "GET_JID_BY_ROW_ID_SQL"
            android.database.Cursor r1 = r5.A07(r4, r2, r0)     // Catch:{ all -> 0x0056 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0046
            com.whatsapp.jid.Jid r0 = r7.A05(r8, r1)     // Catch:{ all -> 0x004d }
            r1.close()
            r3.close()
            return r0
        L_0x0046:
            r1.close()
            r3.close()
            return r6
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015308l.A04(long):com.whatsapp.jid.Jid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.Jid A05(long r9, android.database.Cursor r11) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015308l.A05(long, android.database.Cursor):com.whatsapp.jid.Jid");
    }

    public Jid A06(Cursor cursor) {
        int i;
        int i2;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("user"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("server"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("agent"));
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("device");
        if (cursor.isNull(columnIndexOrThrow)) {
            i = 0;
        } else {
            i = cursor.getInt(columnIndexOrThrow);
        }
        int i4 = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("raw_string"));
        try {
            Jid jid = Jid.get(string3);
            if (i4 == 0) {
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
            } else if (i4 == 17 && (jid instanceof UserJid) && (jid = DeviceJid.of(jid)) == null) {
                throw null;
            }
            if (C003701u.A0F(string, jid.user) && C003701u.A0F(string2, jid.getServer()) && i3 == jid.getAgent() && i == jid.getDevice() && i4 == jid.getType()) {
                return jid;
            }
            i2 = 1;
            try {
                A01("jidstore/readjidfromcursor/cursormismatch", string, string2, i3, i, i4, string3);
                return null;
            } catch (AnonymousClass02Y unused) {
                if (i4 == 11 || !string.isEmpty() || !string2.isEmpty() || i3 != 0 || i != 0 || !string3.isEmpty()) {
                    A01("jidstore/readjidfromcursor/invalidjid", string, string2, i3, i, i4, string3);
                    return null;
                }
                String A012 = this.A02.A01("blank_me_jid_ready");
                if (A012 != null && Integer.parseInt(A012) == i2) {
                    this.A00.A03("blank-me-jid", 3);
                }
                return AnonymousClass02Z.A00;
            }
        } catch (AnonymousClass02Y unused2) {
            i2 = 1;
            if (i4 == 11) {
            }
            A01("jidstore/readjidfromcursor/invalidjid", string, string2, i3, i, i4, string3);
            return null;
        }
    }

    public Jid A07(Class cls, long j) {
        try {
            return (Jid) cls.cast(A04(j));
        } catch (ClassCastException e) {
            StringBuilder A0V = AnonymousClass008.A0V("JidStore/readJidByRowId/jid wrong class; rowId=", j, "; db_data=");
            A0V.append(A09(j));
            Log.e(A0V.toString(), e);
            this.A00.A03("invalid-jid-in-store", 2);
            return null;
        }
    }

    public Jid A08(Class cls, long j, Cursor cursor) {
        try {
            return (Jid) cls.cast(A05(j, cursor));
        } catch (ClassCastException e) {
            StringBuilder A0V = AnonymousClass008.A0V("JidStore/readJidByRowId/jid wrong class; rowId=", j, "; db_data=");
            A0V.append(A09(j));
            Log.e(A0V.toString(), e);
            this.A00.A04("invalid-jid-in-store", null, false);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c6, code lost:
        if (r3 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A09(long r12) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015308l.A09(long):java.lang.String");
    }

    public final void A0A(long j, Jid jid) {
        Map map = this.A05;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jid);
        this.A04.put(jid, valueOf);
    }

    public final void A0B(Cursor cursor) {
        while (cursor.moveToNext()) {
            String A0W = C001801b.A0W(cursor);
            if (!TextUtils.isEmpty(A0W)) {
                for (String str : A0W.split(",")) {
                    Jid nullable = Jid.getNullable(str);
                    if (nullable != null) {
                        A02(nullable);
                    }
                }
            }
        }
    }

    public boolean A0C() {
        String A012 = this.A02.A01("jid_ready");
        return (A012 == null || Long.parseLong(A012) == 0) ? false : true;
    }
}
