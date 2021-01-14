package X;

/* renamed from: X.1AE  reason: invalid class name */
public final class AnonymousClass1AE {
    public static C24571Bm A00;
    public static Boolean A01;
    public static Object A02 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.enabled == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r4) {
        /*
            X.C001801b.A1Q(r4)
            java.lang.Boolean r0 = X.AnonymousClass1AE.A01
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()
            return r0
        L_0x000c:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r0 = r1.getReceiverInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0023 }
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.AnonymousClass1AE.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AE.A00(android.content.Context):boolean");
    }
}
