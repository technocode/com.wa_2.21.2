package X;

/* renamed from: X.21w  reason: invalid class name and case insensitive filesystem */
public class C448421w extends AbstractC28981Wm {
    public int A00;
    public boolean A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r21.A07 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C448421w(X.AnonymousClass00S r17, X.AnonymousClass009 r18, X.AnonymousClass00Y r19, X.C28991Wn r20, X.AnonymousClass1XJ r21, long r22, long r24) {
        /*
            r16 = this;
            r4 = r21
            java.lang.String r10 = r4.A0c
            r13 = 0
            r9 = r20
            r11 = r22
            r14 = r24
            r6 = r17
            r5 = r16
            r7 = r18
            r8 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14)
            java.lang.Integer r0 = r4.A0F
            r5.A03 = r0
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0043
            r0 = 3
        L_0x001f:
            r5.A02 = r0
            X.02P r0 = r4.A08
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002c
            X.02P r1 = r4.A07
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r5.A05 = r0
            int r1 = r4.A01
            r0 = 0
            if (r1 <= 0) goto L_0x0035
            r0 = 1
        L_0x0035:
            r5.A04 = r0
            int r0 = r4.A00()
            if (r0 <= 0) goto L_0x003e
            r3 = 1
        L_0x003e:
            r5.A06 = r3
            r5.A00 = r2
            return
        L_0x0043:
            com.whatsapp.jid.Jid r0 = r4.A0Y
            X.02N r1 = X.AnonymousClass1VY.A09(r0)
            boolean r0 = X.AnonymousClass1VY.A0Y(r1)
            if (r0 == 0) goto L_0x0051
            r0 = 2
            goto L_0x001f
        L_0x0051:
            boolean r0 = X.AnonymousClass1VY.A0b(r1)
            if (r0 == 0) goto L_0x0059
            r0 = 4
            goto L_0x001f
        L_0x0059:
            r0 = 1
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448421w.<init>(X.00S, X.009, X.00Y, X.1Wn, X.1XJ, long, long):void");
    }

    @Override // X.AbstractC28981Wm
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; offlineCount = ");
        sb.append(this.A03);
        sb.append("; messageType = ");
        sb.append(this.A02);
        sb.append("; hasSenderKeyDistributionMessage = ");
        sb.append(this.A05);
        sb.append("; ephemeral = ");
        sb.append(this.A04);
        sb.append("; revoke = ");
        sb.append(this.A06);
        sb.append("; decryptionSuccess = ");
        sb.append(this.A01);
        sb.append("; mediaType = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
