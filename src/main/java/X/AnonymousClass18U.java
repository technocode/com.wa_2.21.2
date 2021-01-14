package X;

import java.util.Locale;

/* renamed from: X.18U  reason: invalid class name */
public class AnonymousClass18U {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass18U(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r5 = r8.length
            if (r5 != 0) goto L_0x0020
            java.lang.String r0 = ""
        L_0x0005:
            r6.<init>()
            r6.A02 = r0
            r6.A01 = r7
            X.17z r0 = new X.17z
            r0.<init>(r7)
            r1 = 2
        L_0x0012:
            java.lang.String r0 = r6.A01
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x004d
            int r1 = r1 + 1
            r0 = 7
            if (r0 < r1) goto L_0x004d
            goto L_0x0012
        L_0x0020:
            java.lang.String r0 = "["
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r3 = 0
        L_0x0028:
            if (r3 >= r5) goto L_0x003e
            r2 = r8[r3]
            int r1 = r4.length()
            r0 = 1
            if (r1 <= r0) goto L_0x0038
            java.lang.String r0 = ","
            r4.append(r0)
        L_0x0038:
            r4.append(r2)
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003e:
            r0 = 93
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x0005
        L_0x004d:
            r6.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18U.<init>(java.lang.String, java.lang.String[]):void");
    }

    public final String A00(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.A02.concat(str);
    }
}
