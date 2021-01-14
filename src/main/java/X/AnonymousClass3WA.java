package X;

/* renamed from: X.3WA  reason: invalid class name */
public class AnonymousClass3WA implements AbstractC20980xu {
    public AnonymousClass3Ak A00;
    public final AnonymousClass0CM A01;
    public final C60602pn A02;

    @Override // X.AbstractC20980xu
    public boolean AAv() {
        return false;
    }

    public AnonymousClass3WA(AnonymousClass0CM r1, C60602pn r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r6 == 7) goto L_0x001a;
     */
    @Override // X.AbstractC20980xu
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2t(int r6) {
        /*
            r5 = this;
            X.3Ak r4 = r5.A00
            if (r4 == 0) goto L_0x0030
            r3 = 0
            r2 = 0
            if (r6 == 0) goto L_0x001c
            r2 = 11
            if (r6 == r2) goto L_0x002d
            r0 = 4
            if (r6 == r0) goto L_0x001c
            r0 = 5
            if (r6 == r0) goto L_0x001a
            r0 = 6
            if (r6 == r0) goto L_0x001a
            r0 = 7
            r2 = 17
            if (r6 != r0) goto L_0x001c
        L_0x001a:
            r2 = 9
        L_0x001c:
            r1 = 0
            if (r2 != 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            X.1W8 r0 = new X.1W8
            r0.<init>(r2, r1, r3)
            r4.A01 = r0
            java.util.concurrent.CountDownLatch r0 = r4.A00
            r0.countDown()
            return
        L_0x002d:
            r2 = 8
            goto L_0x001c
        L_0x0030:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WA.A2t(int):void");
    }

    @Override // X.AbstractC20980xu
    public void AMB(long j, long j2, long j3) {
        this.A02.A0J.A04(Long.valueOf(j2));
    }
}
