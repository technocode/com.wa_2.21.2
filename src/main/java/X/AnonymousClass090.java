package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.090  reason: invalid class name */
public class AnonymousClass090 {
    public static volatile AnonymousClass090 A09;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass04v A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00D A05;
    public final C016608y A06;
    public final C014508d A07;
    public final C015408m A08;

    public AnonymousClass090(AnonymousClass00S r1, AnonymousClass009 r2, AnonymousClass01I r3, C000300f r4, C015408m r5, AnonymousClass04v r6, C014508d r7, AnonymousClass00D r8, C016608y r9) {
        this.A04 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r5;
        this.A03 = r6;
        this.A07 = r7;
        this.A05 = r8;
        this.A06 = r9;
    }

    public static AnonymousClass090 A00() {
        if (A09 == null) {
            synchronized (AnonymousClass090.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass090(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C000300f.A00(), C015408m.A00(), AnonymousClass04v.A00(), C014508d.A00(), AnonymousClass00D.A00(), C016608y.A01);
                }
            }
        }
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r7 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05340Od A01(X.AnonymousClass02X r13) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A01(X.02X):X.0Od");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e A[Catch:{ all -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A02(X.AnonymousClass02X r15) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A02(X.02X):java.util.Set");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00c0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        if (r8 != null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A03(X.AnonymousClass02X r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A03(X.02X, java.lang.String):java.util.Set");
    }

    public void A04(C05340Od r5) {
        Iterator it = r5.A04().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (r1.hasNext()) {
                A05(r5, (AnonymousClass1M5) r1.next(), false);
            } else {
                AnonymousClass02X r2 = r5.A02;
                A06(r2);
                AnonymousClass04v r0 = this.A03;
                r0.A01.A01(new AnonymousClass1Q2(r2));
                return;
            }
        }
    }

    public final void A05(C05340Od r6, AnonymousClass1M5 r7, boolean z) {
        if (r7.A04.get(DeviceJid.of(r7.A03)) == null) {
            AnonymousClass009 r3 = this.A00;
            StringBuilder A0S = AnonymousClass008.A0S("grp=");
            A0S.append(r6.A02);
            A0S.append("participants=");
            A0S.append(r7.toString());
            A0S.append("props=");
            int i = 0;
            String A012 = this.A08.A01("participant_user_ready");
            if (A012 != null) {
                i = Integer.parseInt(A012);
            }
            A0S.append(i);
            A0S.append("/");
            A0S.append(this.A02.A06(AbstractC000400g.A2z));
            A0S.append("/");
            if (this.A05 != null) {
                A0S.append(2);
                r3.A04("participant-message-store/group-participant-without-device", A0S.toString(), true);
            } else {
                throw null;
            }
        }
        Iterator it = r7.A00().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (r1.hasNext()) {
                ((AnonymousClass1M4) r1.next()).A00 = z;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass02X r10) {
        /*
            r9 = this;
            r3 = 0
            java.lang.String r0 = "msgstore/setParticipantsHaveSenderKey/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = " value:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            X.08d r0 = r9.A07
            X.0OQ r2 = r0.A04()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0049 }
            r5.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "sent_sender_key"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0049 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0049 }
            X.0BK r3 = r2.A04     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "group_participants"
            java.lang.String r6 = "gjid = ?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r1 = 0
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0049 }
            r7[r1] = r0     // Catch:{ all -> 0x0049 }
            java.lang.String r8 = "setParticipantsHaveSenderKey/UPDATE_GROUP_PARTICIPANTS"
            r3.A00(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0049 }
            r2.close()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A06(X.02X):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass02X r7, java.util.Collection r8, int r9, java.lang.String r10, java.lang.String r11) {
        /*
            r6 = this;
            java.lang.String r0 = ","
            java.lang.String r5 = android.text.TextUtils.join(r0, r8)
            boolean r0 = android.text.TextUtils.equals(r10, r11)
            if (r0 != 0) goto L_0x0061
            r0 = 6
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            X.00S r0 = r6.A04
            long r2 = r0.A05()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "timestamp"
            r4.put(r0, r1)
            java.lang.String r1 = r7.getRawString()
            java.lang.String r0 = "gjid"
            r4.put(r0, r1)
            java.lang.String r0 = "jid"
            r4.put(r0, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "action"
            r4.put(r0, r1)
            java.lang.String r0 = "old_phash"
            r4.put(r0, r10)
            java.lang.String r0 = "new_phash"
            r4.put(r0, r11)
            X.08d r0 = r6.A07
            X.0OQ r3 = r0.A04()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "group_participants_history"
            java.lang.String r0 = "updateParticipantsHistory/INSERT_GROUP_PARTICIPANTS_HISTORY"
            r2.A02(r1, r4, r0)     // Catch:{ all -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        L_0x005e:
            r3.close()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A07(X.02X, java.util.Collection, int, java.lang.String, java.lang.String):void");
    }
}
