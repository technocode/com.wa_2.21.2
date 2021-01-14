package X;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public class C07340Xd {
    public static volatile C07340Xd A04;
    public String A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass0AR A03;

    public C07340Xd(AnonymousClass00G r1, AnonymousClass0AR r2, AnonymousClass00D r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public static C07340Xd A00() {
        if (A04 == null) {
            synchronized (C07340Xd.class) {
                if (A04 == null) {
                    A04 = new C07340Xd(AnonymousClass00G.A01, AnonymousClass0AR.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r2.A03 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.String r6) {
        /*
            r5 = this;
            X.00D r0 = r5.A02
            android.content.SharedPreferences r4 = r0.A00
            java.lang.String r1 = "fbns_token"
            r0 = 0
            java.lang.String r3 = r4.getString(r1, r0)
            java.lang.String r0 = "fbns_app_vers"
            r2 = 0
            int r1 = r4.getInt(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0023
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x0023
            r0 = 210204500(0xc877754, float:2.0871861E-31)
            if (r0 == r1) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            monitor-enter(r5)
            r5.A00 = r6     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0051
            X.0wF r3 = new X.0wF
            r3.<init>()
            X.00G r0 = r5.A01
            android.app.Application r1 = r0.A00
            java.lang.String r0 = X.AnonymousClass04k.A07
            X.0wE r2 = new X.0wE
            r2.<init>(r3, r1, r0)
            X.0wF r0 = r2.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.A03
            r1 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            java.lang.String r0 = "FbnsTokenManager/requestFbnsToken fbns-enabled:"
            X.AnonymousClass008.A1G(r0, r1)
            if (r1 == 0) goto L_0x0050
            r2.A00()
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r0 = "FbnsTokenManager/verifyFbnsToken no-need-to-refresh"
            com.whatsapp.util.Log.d(r0)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07340Xd.A01(java.lang.String):void");
    }
}
