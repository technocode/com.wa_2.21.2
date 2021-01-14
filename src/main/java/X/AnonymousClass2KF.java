package X;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.2KF  reason: invalid class name */
public abstract class AnonymousClass2KF extends FilterInputStream {
    public int A00 = 0;
    public Mac A01;
    public boolean A02 = false;
    public final int A03 = 10;
    public final AnonymousClass2KD A04;
    public final AnonymousClass2KE A05 = new AnonymousClass2KE();
    public final AnonymousClass2KK A06;
    public final List A07;
    public final byte[] A08;

    public AnonymousClass2KF(InputStream inputStream, AnonymousClass2KK r4) {
        super(inputStream);
        this.A06 = r4;
        this.A07 = new ArrayList();
        this.A01 = C28051Sr.A1E(r4.A01, r4.A02);
        this.A08 = new byte[8192];
        this.A04 = new AnonymousClass2KD(this);
    }

    public final byte[] A00(byte[] bArr, int i) {
        byte[] bArr2 = new byte[16];
        if (i < 16) {
            AnonymousClass2KE r5 = this.A05;
            int i2 = 16 - i;
            boolean z = false;
            if (i2 <= r5.A00) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (r5.A02 - i2) + i3;
                if (i4 < 0) {
                    i4 += r5.A01;
                }
                bArr3[i3] = r5.A03[i4];
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i);
            return bArr2;
        }
        System.arraycopy(bArr, i - 16, bArr2, 0, 16);
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        super.close();
        if (this.A00 > 0) {
            this.A07.add(C05360Of.A07(this.A01.doFinal(), this.A03));
        }
        this.A02 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        boolean z;
        int intValue;
        int intValue2;
        boolean z2;
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            if (!(this instanceof C52502bE)) {
                z = false;
            } else {
                C52502bE r2 = (C52502bE) this;
                int i3 = r2.A00;
                z = true;
                if (i3 != r2.A01.size() - 1) {
                    z = false;
                }
            }
            if (z) {
                this.A00 += read;
                this.A01.update(bArr, 0, read);
            } else {
                if (!(this instanceof C52502bE)) {
                    intValue = ((C52462bA) this).A00;
                } else {
                    C52502bE r22 = (C52502bE) this;
                    intValue = ((Number) r22.A01.get(r22.A00)).intValue();
                }
                int i4 = this.A00;
                int i5 = i4 + read;
                if (i5 <= intValue) {
                    this.A00 = i5;
                    this.A01.update(bArr, 0, read);
                    if (this.A00 == intValue) {
                        this.A00 = 0;
                        this.A07.add(C05360Of.A07(this.A01.doFinal(), this.A03));
                        this.A01 = C28051Sr.A1E(A00(bArr, read), this.A06.A02);
                        if (this instanceof C52502bE) {
                            ((C52502bE) this).A00++;
                        }
                    }
                } else if (i5 > intValue) {
                    this.A01.update(bArr, 0, intValue - i4);
                    byte[] doFinal = this.A01.doFinal();
                    int i6 = this.A03;
                    byte[] A072 = C05360Of.A07(doFinal, i6);
                    List list = this.A07;
                    list.add(A072);
                    byte[] A002 = A00(bArr, intValue - this.A00);
                    byte[] bArr2 = this.A06.A02;
                    this.A01 = C28051Sr.A1E(A002, bArr2);
                    int i7 = this.A00;
                    int i8 = (i7 + read) - intValue;
                    int i9 = intValue - i7;
                    this.A00 = 0;
                    if (this instanceof C52502bE) {
                        ((C52502bE) this).A00++;
                    }
                    while (true) {
                        if (i8 <= 0) {
                            break;
                        }
                        if (!(this instanceof C52502bE)) {
                            intValue2 = ((C52462bA) this).A00;
                        } else {
                            C52502bE r9 = (C52502bE) this;
                            intValue2 = ((Number) r9.A01.get(r9.A00)).intValue();
                        }
                        if (!(this instanceof C52502bE)) {
                            z2 = false;
                        } else {
                            C52502bE r10 = (C52502bE) this;
                            int i10 = r10.A00;
                            z2 = true;
                            if (i10 != r10.A01.size() - 1) {
                                z2 = false;
                            }
                        }
                        if (z2 || i8 < intValue2) {
                            this.A01.update(bArr, i9, i8);
                            this.A00 = i8;
                        } else {
                            this.A01.update(bArr, i9, intValue2);
                            list.add(C05360Of.A07(this.A01.doFinal(), i6));
                            i9 += intValue2;
                            this.A01 = C28051Sr.A1E(A00(bArr, i9), bArr2);
                            i8 -= intValue2;
                            if (this instanceof C52502bE) {
                                ((C52502bE) this).A00++;
                            }
                        }
                    }
                }
            }
            for (int max = Math.max(0, read - 16); max < read; max++) {
                AnonymousClass2KE r5 = this.A05;
                byte b = bArr[max];
                int i11 = r5.A02;
                int i12 = r5.A01;
                if (i11 >= i12) {
                    r5.A02 = 0;
                    i11 = 0;
                }
                r5.A03[i11] = b;
                r5.A02 = i11 + 1;
                int i13 = r5.A00;
                if (i13 < i12) {
                    r5.A00 = i13 + 1;
                }
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        byte[] bArr = this.A08;
        return (long) read(bArr, 0, (int) Math.min((long) bArr.length, j));
    }
}
