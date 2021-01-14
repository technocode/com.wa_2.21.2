package X;

import java.util.Arrays;

/* renamed from: X.05X  reason: invalid class name */
public final class AnonymousClass05X {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass05X(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C001801b.A1b(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            r2.A02 = r5
            r2.A03 = r6
            r2.A04 = r7
            r2.A06 = r8
            r2.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05X.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass05X)) {
            return false;
        }
        AnonymousClass05X r4 = (AnonymousClass05X) obj;
        if (!AnonymousClass05S.A0H(this.A01, r4.A01) || !AnonymousClass05S.A0H(this.A00, r4.A00) || !AnonymousClass05S.A0H(this.A02, r4.A02) || !AnonymousClass05S.A0H(this.A03, r4.A03) || !AnonymousClass05S.A0H(this.A04, r4.A04) || !AnonymousClass05S.A0H(this.A06, r4.A06) || !AnonymousClass05S.A0H(this.A05, r4.A05)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02, this.A03, this.A04, this.A06, this.A05});
    }

    public String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("applicationId", this.A01);
        r2.A00("apiKey", this.A00);
        r2.A00("databaseUrl", this.A02);
        r2.A00("gcmSenderId", this.A04);
        r2.A00("storageBucket", this.A06);
        r2.A00("projectId", this.A05);
        return r2.toString();
    }
}
