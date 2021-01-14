package X;

import java.io.InputStream;

/* renamed from: X.0vx  reason: invalid class name and case insensitive filesystem */
public class C20000vx extends InputStream {
    public int A00;
    public int A01;
    public final C32901fn A02;

    public boolean markSupported() {
        return true;
    }

    public C20000vx(C32901fn r2) {
        boolean z;
        synchronized (r2) {
            z = !AbstractC20030w0.A02(r2.A00);
        }
        AnonymousClass0N2.A1Y(!z);
        this.A02 = r2;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A02.A01() - this.A01;
    }

    public void mark(int i) {
        this.A00 = this.A01;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        C32901fn r2 = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return r2.A00(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder A0S = AnonymousClass008.A0S("length=");
            AnonymousClass008.A1O(A0S, bArr.length, "; regionStart=", i, "; regionLength=");
            A0S.append(i2);
            throw new ArrayIndexOutOfBoundsException(A0S.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        C32901fn r4 = this.A02;
        int i3 = this.A01;
        synchronized (r4) {
            r4.A02();
            boolean z = false;
            if (i3 + min <= r4.A01) {
                z = true;
            }
            AnonymousClass0N2.A1Y(z);
            ((AbstractC20730xC) r4.A00.A04()).AMK(i3, bArr, i, min);
        }
        this.A01 += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.A01 = this.A00;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        AnonymousClass0N2.A1Y(z);
        int min = Math.min((int) j, available());
        this.A01 += min;
        return (long) min;
    }
}
