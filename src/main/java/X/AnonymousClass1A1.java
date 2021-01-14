package X;

import java.util.Set;

/* renamed from: X.1A1  reason: invalid class name */
public final class AnonymousClass1A1 {
    public String A00;
    public Set A01;
    public final C242819u A02;
    public volatile Boolean A03;

    public AnonymousClass1A1(C242819u r1) {
        C001801b.A1Q(r1);
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.equals(r5) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.1A6 r0 = X.AnonymousClass1A5.A00
            java.lang.Object r5 = r0.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = r6.A01
            if (r4 == 0) goto L_0x0014
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0037
        L_0x0014:
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r5, r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r2 = r3.length
            r1 = 0
        L_0x0021:
            if (r1 >= r2) goto L_0x0033
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0030 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0030 }
            r4.add(r0)     // Catch:{ NumberFormatException -> 0x0030 }
        L_0x0030:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0033:
            r6.A00 = r5
            r6.A01 = r4
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A1.A00():java.util.Set");
    }
}
