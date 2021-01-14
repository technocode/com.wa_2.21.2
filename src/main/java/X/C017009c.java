package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.09c  reason: invalid class name and case insensitive filesystem */
public class C017009c {
    public static final long A09 = TimeUnit.HOURS.toMillis(24);
    public static volatile C017009c A0A;
    public final AnonymousClass02M A00;
    public final AnonymousClass01I A01;
    public final C017109d A02;
    public final C017209e A03;
    public final AnonymousClass08B A04;
    public final AnonymousClass00S A05;
    public final AnonymousClass00D A06;
    public final AnonymousClass09H A07;
    public final AnonymousClass00T A08;

    public C017009c(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass01I r4, AnonymousClass00T r5, AnonymousClass09H r6, AnonymousClass08B r7, AnonymousClass08H r8, AnonymousClass00D r9, C017109d r10) {
        this.A05 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A08 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A06 = r9;
        this.A02 = r10;
        this.A03 = new C017209e(r8);
    }

    public static C017009c A00() {
        if (A0A == null) {
            synchronized (C017009c.class) {
                if (A0A == null) {
                    A0A = new C017009c(AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass09H.A01(), AnonymousClass08B.A00, AnonymousClass08H.A00(), AnonymousClass00D.A00(), C017109d.A00());
                }
            }
        }
        return A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(com.whatsapp.jid.UserJid r12) {
        /*
            r11 = this;
            X.09e r4 = r11.A03
            r9 = 0
            if (r4 == 0) goto L_0x0047
            if (r12 != 0) goto L_0x000d
            java.lang.String r0 = "contact-mgr-db/cannot get business description details by null jid"
            com.whatsapp.util.Log.w(r0)
        L_0x000c:
            return r9
        L_0x000d:
            java.lang.String r3 = X.AnonymousClass1VY.A0D(r12)
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]
            r0 = 0
            java.lang.String r2 = "business_description"
            r6[r0] = r2
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r0] = r3
            java.lang.String r5 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            java.lang.String r7 = "wa_biz_profiles.jid = ?"
            java.lang.String r10 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r1 = r4.A07(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003a
            int r0 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r9 = r1.getString(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x003a:
            if (r1 == 0) goto L_0x000c
        L_0x003c:
            r1.close()
            return r9
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017009c.A01(com.whatsapp.jid.UserJid):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A02() {
        /*
            r13 = this;
            X.09e r6 = r13.A03
            if (r6 == 0) goto L_0x0049
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r4 = 0
            java.lang.String r0 = "jid"
            r8[r4] = r0
            r3 = 1
            java.lang.String r0 = "tag"
            r8[r3] = r0
            r9 = 0
            java.lang.String r7 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            java.lang.String r12 = "CONTACT_BIZ_PROFILES"
            r10 = r9
            r11 = r9
            android.database.Cursor r2 = r6.A07(r7, r8, r9, r10, r11, r12)
            if (r2 != 0) goto L_0x0026
            return r5
        L_0x0026:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x0042 }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x0042 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0026
        L_0x003e:
            r2.close()
            return r5
        L_0x0042:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        L_0x0049:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017009c.A02():java.util.Map");
    }

    public void A03(UserJid userJid, AnonymousClass1RW r5) {
        this.A08.ANC(new C41761vb(this, userJid, r5), new Void[0]);
    }

    public void A04(UserJid userJid, C28231Tk r6) {
        if (this.A01.A09(userJid)) {
            AnonymousClass008.A0l(this.A06, "smb_last_my_business_profile_sync_time", this.A05.A05());
        }
        C017209e r1 = this.A03;
        if (r1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(userJid, r6);
            r1.A0B(hashMap);
            return;
        }
        throw null;
    }
}
