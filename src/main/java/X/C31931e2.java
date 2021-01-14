package X;

/* renamed from: X.1e2  reason: invalid class name and case insensitive filesystem */
public class C31931e2 implements AbstractC18720to {
    public int A00 = 0;
    public int A01 = 0;
    public byte[] A02 = new byte[8];
    public float[] A03 = new float[16];

    public final void A00(byte b) {
        int i = this.A00;
        byte[] bArr = this.A02;
        int length = bArr.length;
        if (i == length) {
            byte[] bArr2 = new byte[(length << 1)];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.A02 = bArr2;
            bArr = bArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = b;
    }

    public final void A01(int i) {
        float[] fArr = this.A03;
        int length = fArr.length;
        if (length < this.A01 + i) {
            float[] fArr2 = new float[(length << 1)];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.A03 = fArr2;
        }
    }

    public void A02(AbstractC18720to r16) {
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            byte b = this.A02[i2];
            if (b == 0) {
                float[] fArr = this.A03;
                int i3 = i + 1;
                float f = fArr[i];
                i = i3 + 1;
                r16.ACB(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.A03;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i = i4 + 1;
                r16.ABk(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.A03;
                int i5 = i + 1;
                float f3 = fArr3[i];
                int i6 = i5 + 1;
                float f4 = fArr3[i5];
                int i7 = i6 + 1;
                float f5 = fArr3[i6];
                int i8 = i7 + 1;
                float f6 = fArr3[i7];
                int i9 = i8 + 1;
                i = i9 + 1;
                r16.A3W(f3, f4, f5, f6, fArr3[i8], fArr3[i9]);
            } else if (b == 3) {
                float[] fArr4 = this.A03;
                int i10 = i + 1;
                float f7 = fArr4[i];
                int i11 = i10 + 1;
                float f8 = fArr4[i10];
                int i12 = i11 + 1;
                i = i12 + 1;
                r16.AMF(f7, f8, fArr4[i11], fArr4[i12]);
            } else if (b != 8) {
                boolean z = false;
                if ((b & 2) != 0) {
                    z = true;
                }
                boolean z2 = false;
                if ((b & 1) != 0) {
                    z2 = true;
                }
                float[] fArr5 = this.A03;
                int i13 = i + 1;
                float f9 = fArr5[i];
                int i14 = i13 + 1;
                float f10 = fArr5[i13];
                int i15 = i14 + 1;
                float f11 = fArr5[i14];
                int i16 = i15 + 1;
                i = i16 + 1;
                r16.A26(f9, f10, f11, z, z2, fArr5[i15], fArr5[i16]);
            } else {
                r16.close();
            }
        }
    }

    @Override // X.AbstractC18720to
    public void A26(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A00((byte) (i | 4 | (z2 ? 1 : 0)));
        A01(5);
        float[] fArr = this.A03;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f;
        int i4 = i3 + 1;
        this.A01 = i4;
        fArr[i3] = f2;
        int i5 = i4 + 1;
        this.A01 = i5;
        fArr[i4] = f3;
        int i6 = i5 + 1;
        this.A01 = i6;
        fArr[i5] = f4;
        this.A01 = i6 + 1;
        fArr[i6] = f5;
    }

    @Override // X.AbstractC18720to
    public void A3W(float f, float f2, float f3, float f4, float f5, float f6) {
        A00((byte) 2);
        A01(6);
        float[] fArr = this.A03;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        fArr[i] = f;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        this.A01 = i4;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        this.A01 = i5;
        fArr[i4] = f4;
        int i6 = i5 + 1;
        this.A01 = i6;
        fArr[i5] = f5;
        this.A01 = i6 + 1;
        fArr[i6] = f6;
    }

    @Override // X.AbstractC18720to
    public void ABk(float f, float f2) {
        A00((byte) 1);
        A01(2);
        float[] fArr = this.A03;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        fArr[i] = f;
        this.A01 = i2 + 1;
        fArr[i2] = f2;
    }

    @Override // X.AbstractC18720to
    public void ACB(float f, float f2) {
        A00((byte) 0);
        A01(2);
        float[] fArr = this.A03;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        fArr[i] = f;
        this.A01 = i2 + 1;
        fArr[i2] = f2;
    }

    @Override // X.AbstractC18720to
    public void AMF(float f, float f2, float f3, float f4) {
        A00((byte) 3);
        A01(4);
        float[] fArr = this.A03;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        fArr[i] = f;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        this.A01 = i4;
        fArr[i3] = f3;
        this.A01 = i4 + 1;
        fArr[i4] = f4;
    }

    @Override // X.AbstractC18720to
    public void close() {
        A00((byte) 8);
    }
}
