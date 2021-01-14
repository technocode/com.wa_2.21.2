package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0FS  reason: invalid class name */
public class AnonymousClass0FS {
    public static volatile AnonymousClass0FS A0K;
    public final AnonymousClass08V A00 = new AnonymousClass08V(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
    public final AnonymousClass009 A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass09A A05;
    public final AnonymousClass09V A06;
    public final AnonymousClass09W A07;
    public final C014408c A08;
    public final C006903j A09;
    public final AnonymousClass01K A0A;
    public final AnonymousClass0AB A0B;
    public final C017809k A0C;
    public final AnonymousClass0AC A0D;
    public final C014608e A0E;
    public final C014508d A0F;
    public final C015408m A0G;
    public final AnonymousClass00Y A0H;
    public final AnonymousClass0FT A0I;
    public final ReentrantReadWriteLock A0J;

    public AnonymousClass0FS(AnonymousClass00S r3, AnonymousClass01I r4, C014408c r5, AnonymousClass009 r6, C006903j r7, AnonymousClass00Y r8, AnonymousClass09W r9, AnonymousClass0AB r10, AnonymousClass0FT r11, AnonymousClass01K r12, AnonymousClass0AC r13, AnonymousClass00C r14, C015408m r15, AnonymousClass09A r16, AnonymousClass09V r17, C014608e r18, C017809k r19, C014508d r20) {
        this.A04 = r3;
        this.A02 = r4;
        this.A08 = r5;
        this.A01 = r6;
        this.A09 = r7;
        this.A0H = r8;
        this.A07 = r9;
        this.A0B = r10;
        this.A0I = r11;
        this.A0A = r12;
        this.A0D = r13;
        this.A03 = r14;
        this.A0G = r15;
        this.A05 = r16;
        this.A06 = r17;
        this.A0E = r18;
        this.A0C = r19;
        this.A0F = r20;
        this.A0J = new ReentrantReadWriteLock();
    }

    public static AnonymousClass0FS A00() {
        if (A0K == null) {
            synchronized (AnonymousClass0FS.class) {
                if (A0K == null) {
                    A0K = new AnonymousClass0FS(AnonymousClass00S.A00(), AnonymousClass01I.A00(), C014408c.A00(), AnonymousClass009.A00(), C006903j.A00(), AnonymousClass00Y.A00(), AnonymousClass09W.A00(), AnonymousClass0AB.A00(), AnonymousClass0FT.A00, AnonymousClass01K.A00(), AnonymousClass0AC.A00, AnonymousClass00C.A00(), C015408m.A00(), AnonymousClass09A.A02, AnonymousClass09V.A00(), C014608e.A01, C017809k.A00(), C014508d.A00());
                }
            }
        }
        return A0K;
    }

    public static AnonymousClass0QM A01(AnonymousClass0QM r23) {
        boolean z = false;
        if (r23.A06 != null) {
            z = true;
        }
        AnonymousClass00E.A09(z, "not a legacy/v1 call log");
        ArrayList arrayList = new ArrayList(((AbstractCollection) r23.A04()).size());
        Iterator it = ((AbstractCollection) r23.A04()).iterator();
        while (it.hasNext()) {
            AnonymousClass0QP r0 = (AnonymousClass0QP) it.next();
            arrayList.add(new AnonymousClass0QP(-1, r0.A02, r0.A00));
        }
        return new AnonymousClass0QM(r23.A09, null, -1, r23.A08, r23.A0E, r23.A01, r23.A00, r23.A02, false, false, r23.A05, r23.A0D, arrayList, r23.A04, r23.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r3 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0QM A02(long r11) {
        /*
            r10 = this;
            X.09W r9 = r10.A07
            X.08d r0 = r9.A01
            X.0OQ r4 = r0.A03()
            X.0BK r8 = r4.A04     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE _id = ?"
            r7 = 1
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0058 }
            r5 = 0
            r1[r5] = r6     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "GET_CALL_LOG_BY_CALL_ID"
            android.database.Cursor r3 = r8.A07(r2, r1, r0)     // Catch:{ all -> 0x0058 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0047
            java.lang.String r2 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x004f }
            r1[r5] = r6     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG"
            android.database.Cursor r1 = r8.A07(r2, r1, r0)     // Catch:{ all -> 0x004f }
            X.0QM r0 = r9.A02(r3, r1)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            r3.close()
            r4.close()
            return r0
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            r3.close()
            r4.close()
            r0 = 0
            return r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            if (r3 == 0) goto L_0x0057
            r3.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        L_0x0058:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.A02(long):X.0QM");
    }

    public final AnonymousClass0QM A03(UserJid userJid, boolean z, String str, int i, long j, boolean z2, boolean z3) {
        C09260ca r6 = new C09260ca(userJid, z, str, i);
        if (A04(r6) == null) {
            AnonymousClass0QM r5 = new AnonymousClass0QM(r6, null, -1, j, z2, 0, 0, 0, false, false, null, false, Collections.emptyList(), null, null);
            this.A00.A07(r6, r5);
            if (this.A07.A08()) {
                if (z3) {
                    this.A05.A01(new RunnableEBaseShape2S0200000_I0_1(this, r5, 18), 15);
                } else {
                    A09(r5);
                    return r5;
                }
            }
            return r5;
        }
        StringBuilder sb = new StringBuilder("CallsMessageStore/addCallLogInternal already exists for this key=");
        sb.append(r6);
        throw new IllegalArgumentException(sb.toString());
    }

    public final AnonymousClass0QM A04(C09260ca r2) {
        AnonymousClass0QM r0 = (AnonymousClass0QM) this.A00.A03(r2);
        if (r0 != null) {
            return r0;
        }
        return this.A07.A03(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        if (r7 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(int r17, int r18, X.AbstractC11180fq r19) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.A05(int, int, X.0fq):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0189, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x018a, code lost:
        if (r6 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0192, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0196, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r1 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0172, code lost:
        if (r6 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0177, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A06(int r12, int r13, X.AbstractC11180fq r14) {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.A06(int, int, X.0fq):java.util.ArrayList");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0132, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.A07():void");
    }

    public void A08(AnonymousClass0QM r4) {
        StringBuilder A0S = AnonymousClass008.A0S("CallsMessageStore/updateCallLog; callLog.key=");
        A0S.append(r4.A09);
        A0S.append("; callLog.row_id=");
        A0S.append(r4.A02());
        Log.i(A0S.toString());
        this.A05.A01(new RunnableEBaseShape2S0200000_I0_1(this, r4, 13), 16);
    }

    public final void A09(AnonymousClass0QM r5) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0J;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.A07.A07(r5);
            StringBuilder sb = new StringBuilder();
            sb.append("CallsMessageStore/insertCallLog; callLog.key=");
            sb.append(r5.A09);
            sb.append("; callLog.getRowId()=");
            sb.append(r5.A02());
            Log.i(sb.toString());
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void A0A(Collection collection) {
        StringBuilder A0S = AnonymousClass008.A0S("CallsMessageStore/deleteCallLogs ");
        A0S.append(collection.size());
        Log.i(A0S.toString());
        this.A05.A01(new RunnableEBaseShape2S0200000_I0_1(this, collection, 17), 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B() {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.A0B():boolean");
    }
}
