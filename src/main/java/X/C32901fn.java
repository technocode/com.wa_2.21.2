package X;

import java.io.Closeable;

/* renamed from: X.1fn  reason: invalid class name and case insensitive filesystem */
public class C32901fn implements Closeable {
    public AbstractC20030w0 A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4 > ((X.AbstractC20730xC) r3.A04()).A96()) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32901fn(X.AbstractC20030w0 r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0021
            if (r4 < 0) goto L_0x0014
            java.lang.Object r0 = r3.A04()
            X.0xC r0 = (X.AbstractC20730xC) r0
            int r1 = r0.A96()
            r0 = 1
            if (r4 <= r1) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            X.AnonymousClass0N2.A1Y(r0)
            X.0w0 r0 = r3.clone()
            r2.A00 = r0
            r2.A01 = r4
            return
        L_0x0021:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32901fn.<init>(X.0w0, int):void");
    }

    public synchronized byte A00(int i) {
        A02();
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        AnonymousClass0N2.A1Y(z2);
        if (i >= this.A01) {
            z = false;
        }
        AnonymousClass0N2.A1Y(z);
        return ((AbstractC20730xC) this.A00.A04()).AMJ(i);
    }

    public synchronized int A01() {
        A02();
        return this.A01;
    }

    public synchronized void A02() {
        if (!AbstractC20030w0.A02(this.A00)) {
            throw new C19990vw();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AbstractC20030w0 r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
    }
}
