package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2lR  reason: invalid class name and case insensitive filesystem */
public class C58142lR extends InputStream implements AnonymousClass2VP {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public byte[] A03 = new byte[1024];

    public boolean markSupported() {
        return true;
    }

    public synchronized void A00() {
        this.A00 = this.A02;
    }

    public void A01(byte[] bArr, int i) {
        byte[] bArr2 = this.A03;
        byte[] bArr3 = bArr2;
        if (bArr2 == null) {
            throw new IOException("Stream is closed.");
        } else if (i != 0) {
            if (0 + i <= bArr.length) {
                int i2 = this.A02;
                int i3 = this.A01;
                int i4 = i3;
                if (i2 == i3 && this.A00 == -1) {
                    this.A01 = 0;
                    i3 = 0;
                    i4 = 0;
                    this.A02 = 0;
                    i2 = 0;
                }
                int i5 = i3 + i;
                int length = bArr2.length;
                if (i5 > length) {
                    int i6 = this.A00;
                    int i7 = i3 - i6;
                    if (i6 == -1) {
                        i7 = i3 - i2;
                    }
                    int i8 = length - i7;
                    if (i8 < i) {
                        bArr3 = new byte[((((int) Math.ceil(((double) (i - i8)) / 1024.0d)) << 10) + length)];
                        if (i6 == -1) {
                            int i9 = i3 - i2;
                            System.arraycopy(bArr2, i2, bArr3, 0, i9);
                            this.A02 = 0;
                            this.A01 = i9;
                            i4 = i9;
                            this.A00 = -1;
                        } else {
                            System.arraycopy(bArr2, i6, bArr3, 0, i3 - i6);
                            int i10 = this.A02;
                            int i11 = this.A00;
                            this.A02 = i10 - i11;
                            i4 = this.A01 - i11;
                            this.A01 = i4;
                            this.A00 = 0;
                        }
                        this.A03 = bArr3;
                    } else {
                        bArr3 = new byte[length];
                        if (i6 == -1) {
                            int i12 = i3 - i2;
                            System.arraycopy(bArr2, i2, bArr3, 0, i12);
                            this.A02 = 0;
                            this.A01 = i12;
                            i4 = i12;
                            this.A00 = -1;
                        } else {
                            System.arraycopy(bArr2, i6, bArr3, 0, i3 - i6);
                            int i13 = this.A02;
                            int i14 = this.A00;
                            this.A02 = i13 - i14;
                            i4 = this.A01 - i14;
                            this.A01 = i4;
                            this.A00 = 0;
                        }
                        this.A03 = bArr3;
                    }
                }
                System.arraycopy(bArr, 0, bArr3, i4, i);
                this.A01 += i;
                return;
            }
            throw new IOException(AnonymousClass008.A0G("Len ", i, " exceeds supplied buffer limits."));
        }
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A01 - this.A02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.A03 != null) {
            super.close();
            this.A03 = null;
            this.A01 = 0;
            this.A02 = 0;
            this.A00 = -1;
            return;
        }
        throw new IOException("Stream is already closed.");
    }

    public synchronized void mark(int i) {
        A00();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw new IOException("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) (((short) (bArr[0] & 255)) | 0);
        } else {
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw new IOException("Dst buffer is null");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IOException("Dst buffer is null");
        } else if (i2 == 0) {
            return i2;
        } else {
            if (i + i2 <= bArr.length) {
                int available = available();
                if (available < 1) {
                    return available;
                }
                int min = Math.min(available, i2);
                System.arraycopy(this.A03, this.A02, bArr, i, min);
                this.A02 += min;
                return min;
            }
            throw new IOException("Not enough space in destination buffer.");
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (this.A03 != null) {
            int i = this.A00;
            if (i != -1) {
                this.A02 = i;
                this.A00 = -1;
            } else {
                throw new IOException("No marked position found.");
            }
        } else {
            throw new IOException("Stream is closed.");
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (this.A03 == null) {
            throw new IOException("Stream is closed.");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = ((long) this.A02) + j;
            int i = this.A01;
            if (j2 >= ((long) i)) {
                int available = available();
                this.A02 = i;
                return (long) available;
            }
            this.A02 = (int) j2;
            return j;
        }
    }
}
