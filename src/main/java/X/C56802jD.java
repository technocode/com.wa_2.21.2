package X;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public class C56802jD extends C49972Sx {
    public final int responseCode;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r3 >= 500) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r4.contains("URL signature expired") != false) goto L_0x003b;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56802jD(int r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x0028
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x003d
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x0031
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L_0x003b
            r0 = 408(0x198, float:5.72E-43)
            if (r3 == r0) goto L_0x0028
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L_0x003b
            r0 = 416(0x1a0, float:5.83E-43)
            r1 = 6
            if (r3 == r0) goto L_0x002a
            r0 = 507(0x1fb, float:7.1E-43)
            r1 = 12
            if (r3 == r0) goto L_0x002a
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = -1
            if (r3 < r0) goto L_0x002a
        L_0x0028:
            r1 = 16
        L_0x002a:
            r0 = 0
            r2.<init>(r0, r0, r1)
            r2.responseCode = r3
            return
        L_0x0031:
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = "URL signature expired"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r1 = 5
            goto L_0x002a
        L_0x003d:
            r1 = 8
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56802jD.<init>(int, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("failed to download; code=");
        A0S.append(this.responseCode);
        A0S.append("; status=");
        A0S.append(AnonymousClass1W8.A00(this.downloadStatus));
        return A0S.toString();
    }
}
