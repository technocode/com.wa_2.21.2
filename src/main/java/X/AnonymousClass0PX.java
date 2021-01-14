package X;

/* renamed from: X.0PX  reason: invalid class name */
public class AnonymousClass0PX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public AnonymousClass0PX(int i, int i2, int i3, int i4, int i5) {
        this.A01 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r11 == 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0PX A00(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r12.split(r0)     // Catch:{ Exception -> 0x003a }
            int r11 = r6.length     // Catch:{ Exception -> 0x003a }
            r5 = 4
            r4 = 1
            r3 = 3
            r2 = 0
            if (r11 == r3) goto L_0x0010
            r1 = 0
            if (r11 != r5) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "Version name must have 3 or 4 parts"
            X.AnonymousClass00E.A09(r1, r0)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r2]     // Catch:{ Exception -> 0x003a }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r4]     // Catch:{ Exception -> 0x003a }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = 2
            r0 = r6[r0]     // Catch:{ Exception -> 0x003a }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            if (r11 != r5) goto L_0x0037
            r0 = r6[r3]     // Catch:{ Exception -> 0x003a }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
        L_0x0031:
            X.0PX r6 = new X.0PX     // Catch:{ Exception -> 0x003a }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x003a }
            goto L_0x0039
        L_0x0037:
            r10 = 0
            goto L_0x0031
        L_0x0039:
            return r6
        L_0x003a:
            r2 = move-exception
            java.lang.String r0 = "version/parse ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PX.A00(java.lang.String):X.0PX");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(".");
        sb.append(this.A04);
        sb.append(".");
        sb.append(this.A03);
        if (this.A02 == 4) {
            StringBuilder A0S = AnonymousClass008.A0S(".");
            A0S.append(this.A00);
            str = A0S.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
