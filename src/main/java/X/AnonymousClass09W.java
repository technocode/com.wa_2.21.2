package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.09W  reason: invalid class name */
public class AnonymousClass09W {
    public static volatile AnonymousClass09W A03;
    public final C015308l A00;
    public final C014508d A01;
    public final C015408m A02;

    public AnonymousClass09W(C015308l r1, C015408m r2, C014508d r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass09W A00() {
        if (A03 == null) {
            synchronized (AnonymousClass09W.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass09W(C015308l.A00(), C015408m.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    public final ContentValues A01(AnonymousClass0QM r7, C09260ca r8) {
        long j;
        ContentValues contentValues = new ContentValues();
        C015308l r5 = this.A00;
        contentValues.put("jid_row_id", Long.valueOf(r5.A02(r8.A01)));
        contentValues.put("from_me", Integer.valueOf(r8.A03 ? 1 : 0));
        contentValues.put("call_id", r8.A02);
        contentValues.put("transaction_id", Integer.valueOf(r8.A00));
        contentValues.put("timestamp", Long.valueOf(r7.A08));
        contentValues.put("video_call", Boolean.valueOf(r7.A0E));
        contentValues.put("duration", Integer.valueOf(r7.A01));
        contentValues.put("call_result", Integer.valueOf(r7.A00));
        contentValues.put("bytes_transferred", Long.valueOf(r7.A02));
        GroupJid groupJid = r7.A05;
        long j2 = 0;
        if (groupJid != null) {
            j = r5.A02(groupJid);
        } else {
            j = 0;
        }
        contentValues.put("group_jid_row_id", Long.valueOf(j));
        contentValues.put("is_joinable_group_call", Boolean.valueOf(r7.A0D));
        DeviceJid deviceJid = r7.A04;
        if (deviceJid != null) {
            j2 = r5.A02(deviceJid);
        }
        contentValues.put("call_creator_device_jid_row_id", Long.valueOf(j2));
        contentValues.put("call_random_id", r7.A07);
        return contentValues;
    }

    public final AnonymousClass0QM A02(Cursor cursor, Cursor cursor2) {
        GroupJid groupJid;
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("call_id"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("jid_row_id"));
        C015308l r2 = this.A00;
        UserJid of = UserJid.of(r2.A04(j2));
        if (!AnonymousClass1VY.A0e(of)) {
            StringBuilder sb = new StringBuilder("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=");
            sb.append(j2);
            Log.e(sb.toString());
            return null;
        }
        boolean z = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        C09260ca r15 = new C09260ca(of, z, string, cursor.getInt(cursor.getColumnIndexOrThrow("transaction_id")));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("video_call")) > 0) {
            z2 = true;
        }
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("duration"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("call_result"));
        long j4 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_transferred"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("group_jid_row_id"));
        boolean z3 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
            z3 = true;
        }
        long j5 = cursor.getLong(cursor.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
        ArrayList arrayList = new ArrayList();
        while (cursor2.moveToNext()) {
            long j6 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
            int i4 = cursor2.getInt(cursor2.getColumnIndexOrThrow("jid_row_id"));
            UserJid of2 = UserJid.of(r2.A04((long) i4));
            if (AnonymousClass1VY.A0e(of2)) {
                arrayList.add(new AnonymousClass0QP(j6, of2, cursor2.getInt(cursor2.getColumnIndexOrThrow("call_result"))));
            } else {
                AnonymousClass008.A0u("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=", i4);
            }
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("call_random_id"));
        Jid A04 = r2.A04((long) i3);
        if (A04 instanceof GroupJid) {
            groupJid = (GroupJid) A04;
        } else {
            groupJid = null;
        }
        return new AnonymousClass0QM(r15, null, j, j3, z2, i, i2, j4, false, false, groupJid, z3, arrayList, DeviceJid.of(r2.A04(j5)), string2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0146, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0147, code lost:
        if (r1 != null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0157, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0158, code lost:
        if (r0 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0164, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0QM A03(X.C09260ca r36) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A03(X.0ca):X.0QM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r0 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r2 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(X.C12220hk r31) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A04(X.0hk):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass0QM r20) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A05(X.0QM):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A06(X.AnonymousClass0QM r10) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A06(X.0QM):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r7.A0F() == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A07(X.AnonymousClass0QM r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r7.A0C     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = r7.A0B     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = r7.A0F()     // Catch:{ all -> 0x0052 }
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = "Only regular call log is stored here"
            X.AnonymousClass00E.A09(r1, r0)     // Catch:{ all -> 0x0052 }
            X.08d r0 = r6.A01     // Catch:{ all -> 0x0052 }
            X.0OQ r5 = r0.A04()     // Catch:{ all -> 0x0052 }
            X.0Rk r4 = r5.A00()     // Catch:{ all -> 0x004b }
            X.0ca r0 = r7.A09     // Catch:{ all -> 0x0044 }
            android.content.ContentValues r3 = r6.A01(r7, r0)     // Catch:{ all -> 0x0044 }
            X.0BK r2 = r5.A04     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "call_log"
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r2.A03(r1, r3, r0)     // Catch:{ all -> 0x0044 }
            r7.A08(r0)     // Catch:{ all -> 0x0044 }
            r7.A05()     // Catch:{ all -> 0x0044 }
            r6.A05(r7)     // Catch:{ all -> 0x0044 }
            r4.A00()     // Catch:{ all -> 0x0044 }
            r4.close()
            r5.close()
            monitor-exit(r6)
            return
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A07(X.0QM):void");
    }

    public boolean A08() {
        String A012 = this.A02.A01("call_log_ready");
        if (A012 == null || Integer.parseInt(A012) != 1) {
            return false;
        }
        return true;
    }
}
