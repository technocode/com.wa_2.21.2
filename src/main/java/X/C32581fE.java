package X;

import android.graphics.Bitmap;

/* renamed from: X.1fE  reason: invalid class name and case insensitive filesystem */
public class C32581fE implements AbstractC20220wL {
    public int A00 = -1;
    public AbstractC20030w0 A01;

    @Override // X.AbstractC20220wL
    public void AGN(int i, AbstractC20030w0 r2, int i2) {
    }

    public final synchronized void A00() {
        AbstractC20030w0 r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (X.AbstractC20030w0.A02(r2.A01) == false) goto L_0x000e;
     */
    @Override // X.AbstractC20220wL
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A30(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0011 }
            if (r3 != r0) goto L_0x000e
            X.0w0 r0 = r2.A01     // Catch:{ all -> 0x0011 }
            boolean r1 = X.AbstractC20030w0.A02(r0)     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32581fE.A30(int):boolean");
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A4w(int i, int i2, int i3) {
        try {
        } finally {
            A00();
        }
        return AbstractC20030w0.A00(this.A01);
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A55(int i) {
        if (this.A00 != i) {
            return null;
        }
        return AbstractC20030w0.A00(this.A01);
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A6L(int i) {
        return AbstractC20030w0.A00(this.A01);
    }

    @Override // X.AbstractC20220wL
    public synchronized void AGO(int i, AbstractC20030w0 r4, int i2) {
        if (r4 != null) {
            if (this.A01 != null && ((Bitmap) r4.A04()).equals(this.A01.A04())) {
                return;
            }
        }
        AbstractC20030w0 r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = AbstractC20030w0.A00(r4);
        this.A00 = i;
    }

    @Override // X.AbstractC20220wL
    public synchronized void clear() {
        A00();
    }
}
