package X;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.18p  reason: invalid class name and case insensitive filesystem */
public class C240318p {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240318p.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r2.trim().isEmpty() != false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(android.os.WorkSource r9) {
        /*
            java.lang.String r7 = "Unable to assign blame through WorkSource"
            java.lang.String r6 = "WorkSourceUtil"
            r5 = 0
            if (r9 == 0) goto L_0x001c
            java.lang.reflect.Method r1 = X.C240318p.A02
            if (r1 == 0) goto L_0x001c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0018 }
            java.lang.Object r0 = r1.invoke(r9, r0)     // Catch:{ Exception -> 0x0018 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0018 }
            int r8 = r0.intValue()     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            android.util.Log.wtf(r6, r7, r0)
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 != 0) goto L_0x0024
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0024:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
        L_0x002a:
            if (r3 >= r8) goto L_0x005b
            java.lang.reflect.Method r2 = X.C240318p.A03
            if (r2 == 0) goto L_0x0044
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0040 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0040 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r2 = r2.invoke(r9, r1)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
            android.util.Log.wtf(r6, r7, r0)
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x0052
            java.lang.String r0 = r2.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            if (r0 != 0) goto L_0x0058
            r4.add(r2)
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240318p.A00(android.os.WorkSource):java.util.List");
    }

    public static boolean A01(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        C04670Lh A002 = C04660Lg.A00(context);
        if (A002.A00.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}
