package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0w6  reason: invalid class name and case insensitive filesystem */
public class C20090w6 extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    public C20090w6(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.A02 = bArr;
    }

    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.A00 = this.A01;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            return read;
        }
        int i = this.A01;
        byte[] bArr = this.A02;
        if (i >= bArr.length) {
            return -1;
        }
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = this.A01;
            byte[] bArr2 = this.A02;
            if (i4 >= bArr2.length) {
                break;
            }
            this.A01 = i4 + 1;
            int i5 = bArr2[i4] & 255;
            if (i5 == -1) {
                break;
            }
            bArr[i + i3] = (byte) i5;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.A01 = this.A00;
            return;
        }
        throw new IOException("mark is not supported");
    }
}
