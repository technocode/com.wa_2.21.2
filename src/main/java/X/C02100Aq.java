package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0Aq  reason: invalid class name and case insensitive filesystem */
public class C02100Aq {
    public static volatile C02100Aq A06;
    public boolean A00 = false;
    public boolean A01 = false;
    public final C014408c A02;
    public final C006903j A03;
    public final C014508d A04;
    public final AnonymousClass095 A05;

    public C02100Aq(C014408c r2, C006903j r3, AnonymousClass095 r4, C014508d r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
    }

    public static C02100Aq A00() {
        if (A06 == null) {
            synchronized (C02100Aq.class) {
                if (A06 == null) {
                    A06 = new C02100Aq(C014408c.A00(), C006903j.A00(), AnonymousClass095.A00(), C014508d.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r2 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r7) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02100Aq.A01(X.02N):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28551Ut A02(long r7) {
        /*
            r6 = this;
            X.08d r0 = r6.A04
            X.0OQ r5 = r0.A03()
            X.0BK r4 = r5.A04     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories  FROM deleted_chat_job WHERE chat_row_id=? ORDER BY _id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x003d }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x003d }
            r2[r1] = r0     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "GET_DELETED_CHAT_JOBS_LATEST_SQL"
            android.database.Cursor r1 = r4.A07(r3, r2, r0)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0038
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002d
            X.1Ut r0 = r6.A03(r1)     // Catch:{ all -> 0x0031 }
            r1.close()
            r5.close()
            return r0
        L_0x002d:
            r1.close()
            goto L_0x0038
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        L_0x0038:
            r5.close()
            r0 = 0
            return r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02100Aq.A02(long):X.1Ut");
    }

    public final C28551Ut A03(Cursor cursor) {
        long j = cursor.getLong(1);
        AnonymousClass02N A08 = this.A02.A08(j);
        if (A08 == null) {
            return null;
        }
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("block_size"));
        long max = Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_message_row_id")), 1L);
        long max2 = Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_starred_message_row_id")), 1L);
        boolean z = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("deleted_messages_remove_files")) != 0) {
            z = true;
        }
        long max3 = Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_categories_message_row_id")), 1L);
        long max4 = Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_categories_starred_message_row_id")), 1L);
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("deleted_categories_remove_files")) != 0) {
            z2 = true;
        }
        return new C28551Ut(j2, j, A08, i, max, max2, z, max3, max4, z2, cursor.getString(cursor.getColumnIndexOrThrow("deleted_message_categories")), false);
    }

    public final C28551Ut A04(C28551Ut r39) {
        Throwable th;
        Throwable th2;
        C28551Ut r19;
        AnonymousClass0OQ A042 = this.A04.A04();
        try {
            C06020Rk A002 = A042.A00();
            try {
                long j = r39.A01;
                AnonymousClass02N A08 = this.A02.A08(j);
                if (A08 == null) {
                    A002.close();
                    A042.close();
                    return null;
                }
                int i = r39.A00;
                C08560bL A052 = this.A03.A05(A08);
                C28551Ut A022 = A02(j);
                if (A022 == null || TextUtils.isEmpty(r39.A08) || TextUtils.isEmpty(A022.A08)) {
                    long j2 = r39.A04;
                    long j3 = r39.A05;
                    boolean z = r39.A0A;
                    long j4 = r39.A02;
                    long j5 = r39.A03;
                    boolean z2 = r39.A09;
                    String str = r39.A08;
                    String str2 = str;
                    if (A022 != null) {
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(A022.A08)) {
                            String str3 = A022.A08;
                            if (!TextUtils.isEmpty(str3)) {
                                str2 = str3;
                                z2 = A022.A09;
                            }
                            try {
                                j2 = Math.max(j2, A022.A04);
                                j3 = Math.max(j3, A022.A05);
                                j4 = Math.max(j4, A022.A02);
                                j5 = Math.max(j5, A022.A03);
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    throw th2;
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            A002.close();
                            A042.close();
                            return null;
                        }
                    }
                    ContentValues contentValues = new ContentValues(9);
                    contentValues.put("chat_row_id", Long.valueOf(j));
                    contentValues.put("block_size", Integer.valueOf(i));
                    contentValues.put("deleted_message_row_id", Long.valueOf(j2));
                    contentValues.put("deleted_starred_message_row_id", Long.valueOf(j3));
                    contentValues.put("deleted_messages_remove_files", Boolean.valueOf(z));
                    contentValues.put("deleted_categories_message_row_id", Long.valueOf(j4));
                    contentValues.put("deleted_categories_starred_message_row_id", Long.valueOf(j5));
                    contentValues.put("deleted_message_categories", str2);
                    contentValues.put("deleted_categories_remove_files", Boolean.valueOf(z2));
                    try {
                        AnonymousClass0BK r15 = A042.A04;
                        long A023 = r15.A02("deleted_chat_job", contentValues, "markChatForDeletion/INSERT_DELETED_CHAT_JOB");
                        if (A022 != null) {
                            r15.A01("deleted_chat_job", "_id = ?", new String[]{Long.toString(A022.A06)}, "markChatForDeletion/DELETE_DELETED_CHAT_JOB");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/deletemsgs/mark jid:");
                        sb.append(A08);
                        sb.append(" lastDeletedMessageId:");
                        sb.append(j2);
                        sb.append(" lastDeletedStarredMessageId:");
                        sb.append(j3);
                        Log.i(sb.toString());
                        if (A023 > 0 && A052 != null) {
                            synchronized (A052) {
                                A052.A0B = j2;
                                A052.A0C = j3;
                                A052.A09 = j4;
                                A052.A0A = j5;
                                A052.A0P = str2;
                            }
                        }
                        A002.A00();
                        try {
                            r19 = new C28551Ut(A023, j, A08, i, j2, j3, z, j4, j5, z2, str2, false);
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        throw th2;
                    }
                    try {
                        A002.close();
                        A042.close();
                        return r19;
                    } catch (Throwable th6) {
                        th = th6;
                        try {
                            throw th;
                        } catch (Throwable unused2) {
                        }
                    }
                } else {
                    A002.close();
                    A042.close();
                    return null;
                }
            } catch (Throwable th7) {
                th2 = th7;
                throw th2;
            }
            throw th;
            throw th;
        } catch (Throwable th8) {
            th = th8;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28551Ut A05(X.AnonymousClass02N r27, boolean r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02100Aq.A05(X.02N, boolean, boolean):X.1Ut");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A06() {
        /*
            r6 = this;
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.08d r0 = r6.A04
            X.0OQ r4 = r0.A03()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "SELECT DISTINCT chat_row_id FROM deleted_chat_job"
            r1 = 0
            java.lang.String r0 = "GET_DELETED_CHATS_SQL"
            android.database.Cursor r3 = r3.A07(r2, r1, r0)     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x0036
        L_0x0018:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0036
            r0 = 0
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x002f }
            X.08c r0 = r6.A02     // Catch:{ all -> 0x002f }
            X.02N r0 = r0.A08(r1)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0018
            r5.add(r0)     // Catch:{ all -> 0x002f }
            goto L_0x0018
        L_0x002f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0
        L_0x0036:
            if (r3 == 0) goto L_0x003b
            r3.close()
        L_0x003b:
            r4.close()
            return r5
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02100Aq.A06():java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C28551Ut r11) {
        /*
            r10 = this;
            X.03j r0 = r10.A03
            X.02N r4 = r11.A07
            X.0bL r5 = r0.A05(r4)
            X.08d r0 = r10.A04
            X.0OQ r3 = r0.A04()
            X.0BK r9 = r3.A04     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "deleted_chat_job"
            java.lang.String r7 = "_id=?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            r2 = 0
            long r0 = r11.A06     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005b }
            r6[r2] = r0     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "unmarkJidForDeletionInChats/DELETE_DELETED_CHAT_JOB"
            r9.A01(r8, r7, r6, r0)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x0043
            long r0 = r11.A01     // Catch:{ all -> 0x005b }
            X.1Ut r0 = r10.A02(r0)     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0043
            r2 = 0
            r0 = 1
            monitor-enter(r5)     // Catch:{ all -> 0x005b }
            r5.A0B = r0     // Catch:{ all -> 0x003f }
            r5.A0C = r0     // Catch:{ all -> 0x003f }
            r5.A09 = r0     // Catch:{ all -> 0x003f }
            r5.A0A = r0     // Catch:{ all -> 0x003f }
            r5.A0P = r2     // Catch:{ all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0042:
            monitor-exit(r5)
        L_0x0043:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/deletemsgs/unmark jid:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r3.close()
            return
        L_0x005b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02100Aq.A07(X.1Ut):void");
    }
}
