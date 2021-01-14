package X;

/* renamed from: X.0qX  reason: invalid class name and case insensitive filesystem */
public class C16840qX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r1.contains("DOUB") != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16840qX(java.lang.String r4, java.lang.String r5, boolean r6, int r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.A04 = r4
            r3.A05 = r5
            r3.A06 = r6
            r3.A02 = r7
            r2 = 5
            if (r5 == 0) goto L_0x001d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.toUpperCase(r0)
            java.lang.String r0 = "INT"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0024
            r2 = 3
        L_0x001d:
            r3.A00 = r2
            r3.A03 = r8
            r3.A01 = r9
            return
        L_0x0024:
            java.lang.String r0 = "CHAR"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "CLOB"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "TEXT"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "BLOB"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "REAL"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "FLOA"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "DOUB"
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 == 0) goto L_0x001d
        L_0x005d:
            r2 = 4
            goto L_0x001d
        L_0x005f:
            r2 = 2
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16840qX.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0068, code lost:
        if (r4 != 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16840qX.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Column{name='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", type='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", affinity='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append(", notNull=");
        A0S.append(this.A06);
        A0S.append(", primaryKeyPosition=");
        A0S.append(this.A02);
        A0S.append(", defaultValue='");
        A0S.append(this.A03);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
