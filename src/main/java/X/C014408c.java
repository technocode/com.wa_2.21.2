package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.08c  reason: invalid class name and case insensitive filesystem */
public class C014408c {
    public static volatile C014408c A08;
    public final AnonymousClass009 A00;
    public final C006903j A01;
    public final C015308l A02;
    public final AnonymousClass094 A03;
    public final C014508d A04;
    public final C015408m A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public C014408c(C015308l r2, AnonymousClass009 r3, C006903j r4, C015408m r5, C014508d r6, AnonymousClass094 r7) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A03 = r7;
    }

    public static C014408c A00() {
        if (A08 == null) {
            synchronized (C014408c.class) {
                if (A08 == null) {
                    A08 = new C014408c(C015308l.A00(), AnonymousClass009.A00(), C006903j.A00(), C015408m.A00(), C014508d.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(android.content.ContentValues r12, X.AnonymousClass02N r13) {
        /*
            r11 = this;
            X.08d r0 = r11.A04
            X.0OQ r3 = r0.A04()
            java.lang.String r1 = "hidden"
            r4 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0031 }
            r7 = r12
            r12.put(r1, r0)     // Catch:{ all -> 0x0031 }
            X.08l r0 = r11.A02     // Catch:{ all -> 0x0031 }
            long r1 = r0.A02(r13)     // Catch:{ all -> 0x0031 }
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = "chat"
            java.lang.String r8 = "jid_row_id=?"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0031 }
            r9[r4] = r0     // Catch:{ all -> 0x0031 }
            java.lang.String r10 = "updateChatTable/UPDATE_CHAT"
            int r0 = r5.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0031 }
            r3.close()
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A01(android.content.ContentValues, X.02N):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.content.ContentValues r10, X.AnonymousClass02N r11) {
        /*
            r9 = this;
            X.08d r0 = r9.A04
            X.0OQ r2 = r0.A04()
            java.lang.String r0 = "hidden"
            r5 = r10
            r10.remove(r0)     // Catch:{ all -> 0x0026 }
            X.0BK r3 = r2.A04     // Catch:{ all -> 0x0026 }
            java.lang.String r4 = "chat_list"
            java.lang.String r6 = "key_remote_jid=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0026 }
            r1 = 0
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0026 }
            r7[r1] = r0     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "ChatStore/update/UPDATE_CHAT_LIST"
            int r0 = r3.A00(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0026 }
            r2.close()
            return r0
        L_0x0026:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A02(android.content.ContentValues, X.02N):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A03(android.content.ContentValues r5) {
        /*
            r4 = this;
            X.08d r0 = r4.A04
            X.0OQ r3 = r0.A04()
            java.lang.String r1 = "hidden"
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x001e }
            r5.put(r1, r0)     // Catch:{ all -> 0x001e }
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "insertIntoChatTable/INSERT_CHAT"
            long r0 = r2.A02(r1, r5, r0)     // Catch:{ all -> 0x001e }
            r3.close()
            return r0
        L_0x001e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A03(android.content.ContentValues):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A04(android.content.ContentValues r5) {
        /*
            r4 = this;
            X.08d r0 = r4.A04
            X.0OQ r3 = r0.A04()
            java.lang.String r0 = "hidden"
            r5.remove(r0)     // Catch:{ all -> 0x0019 }
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0019 }
            java.lang.String r1 = "chat_list"
            java.lang.String r0 = "ChatStore/insert/INSERT_CHAT_LIST"
            long r0 = r2.A02(r1, r5, r0)     // Catch:{ all -> 0x0019 }
            r3.close()
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A04(android.content.ContentValues):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = java.lang.Long.valueOf(r3);
        r5.put(r7, r1);
        r6.A07.put(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = A06(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3 == -1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(X.AnonymousClass02N r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r5 = r6.A06     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r5.get(r7)     // Catch:{ all -> 0x002f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0011
            long r0 = r0.longValue()     // Catch:{ all -> 0x002f }
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return r0
        L_0x0011:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            long r3 = r6.A06(r7)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x002b }
            r5.put(r7, r1)     // Catch:{ all -> 0x002b }
            java.util.Map r0 = r6.A07     // Catch:{ all -> 0x002b }
            r0.put(r1, r7)     // Catch:{ all -> 0x002b }
            monitor-exit(r6)     // Catch:{ all -> 0x002b }
            return r3
        L_0x002b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            return r3
        L_0x002f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A05(X.02N):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r3 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A06(X.AnonymousClass02N r12) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A06(X.02N):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A07(X.AnonymousClass02N r10) {
        /*
            r9 = this;
            X.08l r0 = r9.A02
            long r7 = r0.A02(r10)
            r5 = -1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            java.lang.String r1 = "ChatStore/insertHiddenChat/jid row id not found; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            return r5
        L_0x001e:
            r2 = 1
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "jid_row_id"
            r4.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "hidden"
            r4.put(r0, r1)
            X.08d r0 = r9.A04     // Catch:{ SQLiteConstraintException -> 0x0051 }
            X.0OQ r3 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x0051 }
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "insertHiddenChat/INSERT_CHAT"
            long r0 = r2.A03(r1, r4, r0)     // Catch:{ all -> 0x004a }
            r3.close()
            return r0
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        L_0x0051:
            r2 = move-exception
            java.lang.String r1 = "ChatStore/insertHiddenChat/row already exists but can't be read; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A07(X.02N):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r3 = r9.A04.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = r3.A04.A07("SELECT jid_row_id FROM chat WHERE _id=?", new java.lang.String[]{java.lang.Long.toString(r10)}, "GET_CHAT_BY_ROW_ID_SQL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r4.moveToLast() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r1 = r9.A02.A04(r4.getLong(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if ((r1 instanceof X.AnonymousClass02N) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r1 = (X.AnonymousClass02N) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r1 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.put(r5, r1);
        r9.A06.put(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r4.close();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        r4.close();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (r4 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02N A08(long r10) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A08(long):X.02N");
    }

    public AnonymousClass02N A09(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A08(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("key_remote_jid");
        if (columnIndex2 >= 0) {
            return AnonymousClass02N.A01(cursor.getString(columnIndex2));
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0213 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A0A() {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A0A():java.util.Map");
    }

    public void A0B(C08560bL r5) {
        ContentValues contentValues;
        if (!A0G()) {
            A02(r5.A01(), r5.A0T);
            return;
        }
        synchronized (r5) {
            contentValues = new ContentValues(2);
            contentValues.put("change_number_notified_message_row_id", Long.valueOf(r5.A08));
        }
        AnonymousClass02N r1 = r5.A0T;
        if (A01(contentValues, r1) > 0) {
            A02(r5.A01(), r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C08560bL r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A0C(X.0bL):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C08560bL r10) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A0D(X.0bL):void");
    }

    public void A0E(C08560bL r3) {
        if (!A0G()) {
            A02(r3.A06(), r3.A0T);
            return;
        }
        ContentValues A062 = r3.A06();
        AnonymousClass02N r1 = r3.A0T;
        if (A01(A062, r1) > 0) {
            A02(r3.A06(), r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.AnonymousClass02N r11) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014408c.A0F(X.02N):void");
    }

    public boolean A0G() {
        String A012 = this.A05.A01("chat_ready");
        return A012 != null && Long.parseLong(A012) == 2;
    }

    public boolean A0H(C08560bL r2) {
        if (!A0G()) {
            return A0J(r2, r2.A0D());
        }
        if (A0I(r2, r2.A0D())) {
            return A0J(r2, r2.A0D());
        }
        return false;
    }

    public boolean A0I(C08560bL r7, ContentValues contentValues) {
        AnonymousClass02N r1 = r7.A0T;
        if (A01(contentValues, r1) == 0) {
            contentValues.put("jid_row_id", Long.valueOf(this.A02.A02(r1)));
            long A032 = A03(contentValues);
            r7.A0J = A032;
            return A032 != -1;
        }
    }

    public final boolean A0J(C08560bL r7, ContentValues contentValues) {
        AnonymousClass02N r1 = r7.A0T;
        if (A02(contentValues, r1) == 0) {
            contentValues.put("key_remote_jid", r1.getRawString());
            return A04(contentValues) != -1;
        }
    }
}
