package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0A3  reason: invalid class name */
public class AnonymousClass0A3 {
    public static volatile AnonymousClass0A3 A05;
    public final AnonymousClass0A4 A00;
    public final C014408c A01;
    public final C006903j A02;
    public final C014508d A03;
    public final AnonymousClass01R A04;

    public AnonymousClass0A3(C014408c r1, C006903j r2, AnonymousClass0A4 r3, C014508d r4, AnonymousClass01R r5) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static AnonymousClass0A3 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0A3.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0A3(C014408c.A00(), C006903j.A00(), AnonymousClass0A4.A00(), C014508d.A00(), AnonymousClass01R.A01());
                }
            }
        }
        return A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(long r7) {
        /*
            r6 = this;
            X.08d r0 = r6.A03
            X.0OQ r3 = r0.A03()
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0043 }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_DURATION"
            android.database.Cursor r1 = r5.A07(r4, r1, r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x003f
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "setting_duration"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0038 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0038 }
            r1.close()
            r3.close()
            return r0
        L_0x0034:
            r1.close()
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        L_0x003f:
            r3.close()
            return r2
        L_0x0043:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A3.A01(long):int");
    }

    public final C08560bL A02(C12190hh r4) {
        UserJid of = UserJid.of(r4.A0n.A00);
        if (of == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        C08560bL A052 = this.A02.A05(of);
        if (A052 != null) {
            return A052;
        }
        Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(long r7, int r9) {
        /*
            r6 = this;
            X.08d r0 = r6.A03
            X.0OQ r5 = r0.A04()
            X.0BK r4 = r5.A04     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = X.AnonymousClass1VP.A02     // Catch:{ all -> 0x0024 }
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0024 }
            r1 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0024 }
            r2[r1] = r0     // Catch:{ all -> 0x0024 }
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0024 }
            r2[r1] = r0     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "INSERT_EPHEMERAL_SETTING_DURATION"
            r4.A0D(r3, r2, r0)     // Catch:{ all -> 0x0024 }
            r5.close()
            return
        L_0x0024:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A3.A03(long, int):void");
    }

    public void A04(C12190hh r3) {
        Integer valueOf = Integer.valueOf(A01(r3.A0p));
        if (valueOf == null || valueOf.intValue() <= 0) {
            valueOf = 0;
        }
        r3.A00 = valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1 <= r1) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C12190hh r19, X.C08560bL r20) {
        /*
            r18 = this;
            r4 = r20
            r6 = r19
            r5 = r18
            if (r20 != 0) goto L_0x000f
            X.0bL r4 = r5.A02(r6)
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            X.03l r3 = r4.A0M
            X.0A4 r10 = r5.A00
            X.00f r1 = r10.A01
            X.01l r0 = X.AbstractC000400g.A0t
            boolean r0 = r1.A0D(r0)
            r9 = 1
            if (r0 == 0) goto L_0x0041
            int r1 = r6.A00
            int r0 = r3.expiration
            if (r1 != r0) goto L_0x0041
            long r1 = r6.A0E
            long r7 = r3.ephemeralSettingTimestamp
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            int r0 = (r1 > r1 ? 1 : (r1 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
        L_0x0030:
            int r3 = r6.A00
            long r1 = r6.A0E
            X.03l r0 = new X.03l
            r0.<init>(r3, r1)
            r4.A0M = r0
            X.08c r0 = r5.A01
            r0.A0E(r4)
        L_0x0040:
            return
        L_0x0041:
            int r0 = r6.A09
            if (r0 != r9) goto L_0x0040
            if (r10 == 0) goto L_0x0059
            X.03n r0 = r6.A0n
            X.02N r11 = r0.A00
            long r12 = r6.A0E
            int r14 = r6.A00
            r15 = r12
            r17 = r3
            boolean r0 = r10.A01(r11, r12, r14, r15, r17)
            if (r0 == 0) goto L_0x0040
            goto L_0x0030
        L_0x0059:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A3.A05(X.0hh, X.0bL):void");
    }
}
