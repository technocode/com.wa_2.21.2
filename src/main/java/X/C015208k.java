package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08k  reason: invalid class name and case insensitive filesystem */
public class C015208k {
    public static volatile C015208k A0D;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass04v A02;
    public final AnonymousClass00S A03;
    public final C015508n A04;
    public final C016608y A05;
    public final C015308l A06;
    public final C014508d A07;
    public final C016708z A08;
    public final C015408m A09;
    public final AnonymousClass01L A0A;
    public final C015808q A0B;
    public final AnonymousClass00T A0C;

    public C015208k(AnonymousClass00S r1, C015308l r2, AnonymousClass009 r3, AnonymousClass01I r4, AnonymousClass00T r5, C015808q r6, C015408m r7, AnonymousClass01L r8, AnonymousClass04v r9, C015508n r10, C014508d r11, C016608y r12, C016708z r13) {
        this.A03 = r1;
        this.A06 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A0C = r5;
        this.A0B = r6;
        this.A09 = r7;
        this.A0A = r8;
        this.A02 = r9;
        this.A04 = r10;
        this.A07 = r11;
        this.A05 = r12;
        this.A08 = r13;
    }

    public static C015208k A00() {
        if (A0D == null) {
            synchronized (C015208k.class) {
                if (A0D == null) {
                    A0D = new C015208k(AnonymousClass00S.A00(), C015308l.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), C015808q.A00(), C015408m.A00(), AnonymousClass01L.A00(), AnonymousClass04v.A00(), C015508n.A00(), C014508d.A00(), C016608y.A01, C016708z.A00());
                }
            }
        }
        return A0D;
    }

    public static AnonymousClass0PN A01(AnonymousClass0PQ r5) {
        return new C43631yh(r5.A02, r5.A0B, r5.A0Z, r5.A0W, r5);
    }

    public final long A02(UserJid userJid) {
        AnonymousClass00E.A09(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
        C015308l r1 = this.A06;
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

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0206, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0207, code lost:
        if (r8 != null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02db, code lost:
        if (r6 != null) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05340Od A03(X.AnonymousClass02X r39) {
        /*
        // Method dump skipped, instructions count: 745
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A03(X.02X):X.0Od");
    }

    public final UserJid A04(UserJid userJid) {
        if (userJid.equals(AnonymousClass02Z.A00)) {
            StringBuilder A0S = AnonymousClass008.A0S("participant-user-store/sanitizeParticipantJid/my jid = ");
            AnonymousClass01I r1 = this.A01;
            r1.A04();
            AnonymousClass008.A1Q(A0S, r1.A03);
            r1.A04();
            userJid = r1.A03;
            if (userJid == null) {
                throw null;
            }
        }
        return userJid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A05(X.AnonymousClass02X r9) {
        /*
            r8 = this;
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.08l r5 = r8.A06
            long r0 = r5.A02(r9)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            X.08d r0 = r8.A07
            X.0OQ r4 = r0.A03()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x005d }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "GET_GROUP_PARTICIPANT_USER_JIDS_SQL"
            android.database.Cursor r3 = r3.A07(r2, r1, r0)     // Catch:{ all -> 0x005d }
        L_0x0025:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004d
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0054 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0054 }
            com.whatsapp.jid.Jid r0 = r5.A08(r2, r0, r3)     // Catch:{ all -> 0x0054 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            com.whatsapp.jid.UserJid r0 = r8.A04(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x0025
            r6.add(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0025
        L_0x004d:
            r3.close()
            r4.close()
            return r6
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            if (r3 == 0) goto L_0x005c
            r3.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        L_0x005d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A05(X.02X):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r4 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A06(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.08d r0 = r8.A07
            X.0OQ r5 = r0.A03()
            X.0BK r7 = r5.A04     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r2 = 0
            long r0 = r8.A02(r9)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0053 }
            r3[r2] = r0     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "GET_PARTICIPANT_GROUPS_BY_USER_JID_SQL"
            android.database.Cursor r4 = r7.A07(r4, r3, r0)     // Catch:{ all -> 0x0053 }
        L_0x0023:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "group_jid_row_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004a }
            long r2 = r4.getLong(r0)     // Catch:{ all -> 0x004a }
            X.08l r1 = r8.A06     // Catch:{ all -> 0x004a }
            java.lang.Class<X.02X> r0 = X.AnonymousClass02X.class
            com.whatsapp.jid.Jid r0 = r1.A07(r0, r2)     // Catch:{ all -> 0x004a }
            X.02X r0 = (X.AnonymousClass02X) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0023
            r6.add(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0023
        L_0x0043:
            r4.close()
            r5.close()
            return r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0052
            r4.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0
        L_0x0053:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A06(com.whatsapp.jid.UserJid):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r5 = this;
            X.08d r0 = r5.A07
            X.0OQ r2 = r0.A04()
            X.0Rk r4 = r2.A00()     // Catch:{ all -> 0x004b }
            X.0BK r3 = r2.A04     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "DELETE FROM group_participant_user"
            java.lang.String r0 = "CLEAR_TABLE_GROUP_PARTICIPANT_USER"
            r3.A0C(r1, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "DELETE FROM group_participant_device"
            java.lang.String r0 = "CLEAR_TABLE_GROUP_PARTICIPANT_DEVICE"
            r3.A0C(r1, r0)     // Catch:{ all -> 0x0044 }
            X.08m r1 = r5.A09     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "participant_user_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "migration_participant_user_index"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "migration_participant_user_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "broadcast_me_jid_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "migration_broadcast_me_jid_index"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "migration_broadcast_me_jid_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0044 }
            r4.A00()     // Catch:{ all -> 0x0044 }
            r4.close()
            r2.close()
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
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A07():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C05340Od r5) {
        /*
            r4 = this;
            java.lang.String r1 = "participant-user-store/resetSentSenderKeyForAllParticipants/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            X.02X r3 = r5.A02
            X.08d r0 = r4.A07
            X.0OQ r2 = r0.A04()
            X.0Rk r1 = r2.A00()     // Catch:{ all -> 0x0042 }
            X.08z r0 = r4.A08     // Catch:{ all -> 0x003b }
            r0.A02(r3)     // Catch:{ all -> 0x003b }
            r4.A09(r5)     // Catch:{ all -> 0x003b }
            r1.A00()     // Catch:{ all -> 0x003b }
            r1.close()
            r2.close()
            X.04v r0 = r4.A02
            X.1Q2 r1 = new X.1Q2
            r1.<init>(r3)
            X.04w r0 = r0.A01
            r0.A01(r1)
            return
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        L_0x0042:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A08(X.0Od):void");
    }

    public final void A09(C05340Od r5) {
        Iterator it = r5.A04().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (r1.hasNext()) {
                Iterator it2 = ((AnonymousClass1M5) r1.next()).A00().iterator();
                while (true) {
                    C28351Tz r12 = (C28351Tz) it2;
                    if (r12.hasNext()) {
                        ((AnonymousClass1M4) r12.next()).A00 = false;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass02X r16, X.AnonymousClass1M5 r17) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A0A(X.02X, X.1M5):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass02X r7, java.util.Collection r8) {
        /*
            r6 = this;
            X.0Od r5 = r6.A03(r7)
            X.08d r0 = r6.A07
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x003d }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0012:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0036 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0036 }
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0036 }
            X.1M5 r0 = (X.AnonymousClass1M5) r0     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0012
            r6.A0A(r7, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x0012
        L_0x002c:
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            return
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A0B(X.02X, java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass02X r6, java.util.List r7) {
        /*
            r5 = this;
            X.08d r0 = r5.A07
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x003b }
            r2 = 0
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0034 }
        L_0x000f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0034 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0034 }
            boolean r0 = r5.A0I(r6, r0)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000f
            r2 = 1
            goto L_0x000f
        L_0x0023:
            if (r2 == 0) goto L_0x002a
            X.08z r0 = r5.A08     // Catch:{ all -> 0x0034 }
            r0.A02(r6)     // Catch:{ all -> 0x0034 }
        L_0x002a:
            r3.A00()     // Catch:{ all -> 0x0034 }
            r3.close()
            r4.close()
            return
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A0C(X.02X, java.util.List):void");
    }

    public final void A0D(UserJid userJid, C05340Od r10, C05350Oe r11) {
        Pair pair;
        AnonymousClass1M5 r0 = (AnonymousClass1M5) r10.A01.get(userJid);
        if (r0 == null) {
            StringBuilder sb = new StringBuilder("GroupParticipants/refreshDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            Boolean bool = Boolean.FALSE;
            pair = new Pair(bool, bool);
        } else {
            ConcurrentHashMap concurrentHashMap = r0.A04;
            C05350Oe A012 = C05350Oe.A01(concurrentHashMap.keySet());
            Iterator it = r11.iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                C28351Tz r1 = (C28351Tz) it;
                if (!r1.hasNext()) {
                    break;
                }
                DeviceJid deviceJid = (DeviceJid) r1.next();
                if (!A012.A00.contains(deviceJid)) {
                    AnonymousClass1M4 r2 = new AnonymousClass1M4(deviceJid, false);
                    DeviceJid deviceJid2 = r2.A01;
                    if (!concurrentHashMap.containsKey(deviceJid2)) {
                        concurrentHashMap.put(deviceJid2, r2);
                    }
                    z2 = true;
                }
            }
            Iterator it2 = A012.iterator();
            while (true) {
                C28351Tz r12 = (C28351Tz) it2;
                if (!r12.hasNext()) {
                    break;
                }
                Object next = r12.next();
                if (!r11.A00.contains(next)) {
                    concurrentHashMap.remove(next);
                    z = true;
                }
            }
            if (z2 || z) {
                r10.A06();
                if (z) {
                    r10.A07();
                }
            }
            pair = new Pair(Boolean.valueOf(z2), Boolean.valueOf(z));
        }
        if (((Boolean) pair.first).booleanValue() || ((Boolean) pair.second).booleanValue()) {
            A0E(userJid, r10, ((Boolean) pair.second).booleanValue());
        }
    }

    public final void A0E(UserJid userJid, C05340Od r9, boolean z) {
        if (r9.A01.get(userJid) != null) {
            this.A08.A04(r9.A02, userJid, A02(userJid), ((AnonymousClass1M5) r9.A01.get(userJid)).A00());
        }
        if (z) {
            this.A08.A02(r9.A02);
        }
    }

    public boolean A0F() {
        String A012 = this.A09.A01("participant_user_ready");
        if (A012 == null || Integer.parseInt(A012) != 2) {
            return false;
        }
        return true;
    }

    public boolean A0G() {
        if (A0F()) {
            return true;
        }
        String A012 = this.A09.A01("migration_participant_user_index");
        return A012 != null && Long.parseLong(A012) > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(X.AnonymousClass02X r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "participant-user-store/removeGroupParticipant/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            X.08l r0 = r8.A06
            long r0 = r0.A02(r9)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.08d r0 = r8.A07
            X.0OQ r7 = r0.A04()
            X.0BK r6 = r7.A04     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "group_participant_user"
            java.lang.String r4 = "group_jid_row_id = ? AND user_jid_row_id = ?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r2 = 0
            r3[r2] = r1     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0049 }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "removeGroupParticipant/DELETE_GROUP_PARTICIPANT_USER"
            int r0 = r6.A01(r5, r4, r3, r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            r2 = 1
        L_0x0045:
            r7.close()
            return r2
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015208k.A0H(X.02X, long):boolean");
    }

    public boolean A0I(AnonymousClass02X r3, UserJid userJid) {
        StringBuilder sb = new StringBuilder("participant-user-store/removeGroupParticipant/");
        sb.append(r3);
        sb.append(" ");
        sb.append(userJid);
        Log.i(sb.toString());
        return A0H(r3, A02(userJid));
    }
}
