package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.08z  reason: invalid class name and case insensitive filesystem */
public class C016708z {
    public static volatile C016708z A05;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final C015308l A02;
    public final C014508d A03;
    public final AnonymousClass00T A04;

    public C016708z(C015308l r1, AnonymousClass009 r2, AnonymousClass01I r3, AnonymousClass00T r4, C014508d r5) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public static C016708z A00() {
        if (A05 == null) {
            synchronized (C016708z.class) {
                if (A05 == null) {
                    A05 = new C016708z(C015308l.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), C014508d.A00());
                }
            }
        }
        return A05;
    }

    public final long A01(UserJid userJid) {
        AnonymousClass00E.A09(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
        C015308l r1 = this.A02;
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        UserJid userJid2 = r0.A03;
        if (userJid2 != null) {
            if (userJid.equals(userJid2)) {
                userJid = AnonymousClass02Z.A00;
            }
            return r1.A02(userJid);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass02X r8) {
        /*
            r7 = this;
            java.lang.String r1 = "participant-device-store/resetSentSenderKeyForAllParticipants/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            X.08l r0 = r7.A02
            long r5 = r0.A02(r8)
            X.08d r0 = r7.A03
            X.0OQ r4 = r0.A04()
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)"
            java.lang.String r0 = "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_GROUP_SQL"
            X.1VB r3 = r2.A0A(r1, r0)     // Catch:{ all -> 0x0040 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0040 }
            r1 = 0
            java.lang.String r0 = "0"
            r2[r1] = r0     // Catch:{ all -> 0x0040 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0040 }
            r2[r1] = r0     // Catch:{ all -> 0x0040 }
            r3.A09(r2)     // Catch:{ all -> 0x0040 }
            r3.A00()     // Catch:{ all -> 0x0040 }
            r4.close()
            return
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016708z.A02(X.02X):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass02X r16, com.whatsapp.jid.UserJid r17, long r18, X.C05350Oe r20) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016708z.A03(X.02X, com.whatsapp.jid.UserJid, long, X.0Oe):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass02X r10, com.whatsapp.jid.UserJid r11, long r12, X.C05350Oe r14) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016708z.A04(X.02X, com.whatsapp.jid.UserJid, long, X.0Oe):void");
    }
}
