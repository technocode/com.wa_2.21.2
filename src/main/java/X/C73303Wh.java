package X;

/* renamed from: X.3Wh  reason: invalid class name and case insensitive filesystem */
public class C73303Wh implements AbstractC11690gn {
    public int A00;
    public AbstractC11690gn A01;
    public boolean A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;

    public C73303Wh(AbstractC11690gn r3) {
        this.A01 = r3;
        int A4x = r3.A4x();
        this.A00 = A4x;
        this.A03 = new byte[A4x];
        this.A05 = new byte[A4x];
        this.A04 = new byte[A4x];
    }

    @Override // X.AbstractC11690gn
    public String A4i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.A4i());
        sb.append("/CBC");
        return sb.toString();
    }

    @Override // X.AbstractC11690gn
    public int A4x() {
        return this.A01.A4x();
    }

    @Override // X.AbstractC11690gn
    public void AAX(boolean z, AbstractC11530gT r8) {
        boolean z2 = this.A02;
        this.A02 = z;
        if (r8 instanceof C11550gV) {
            C11550gV r82 = (C11550gV) r8;
            byte[] bArr = r82.A01;
            int length = bArr.length;
            if (length == this.A00) {
                System.arraycopy(bArr, 0, this.A03, 0, length);
                reset();
                AbstractC11530gT r1 = r82.A00;
                if (r1 != null) {
                    this.A01.AAX(z, r1);
                } else if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
            } else {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (r8 != null) {
                this.A01.AAX(z, r8);
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
        }
    }

    @Override // X.AbstractC11690gn
    public int AM9(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.A02) {
            int i3 = this.A00;
            if (i3 + i <= bArr.length) {
                for (int i4 = 0; i4 < i3; i4++) {
                    byte[] bArr3 = this.A05;
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr[i + i4]);
                }
                int AM9 = this.A01.AM9(this.A05, 0, bArr2, i2);
                byte[] bArr4 = this.A05;
                System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
                return AM9;
            }
            throw new C67983Bg("input buffer too short");
        }
        int i5 = this.A00;
        if (i + i5 <= bArr.length) {
            System.arraycopy(bArr, i, this.A04, 0, i5);
            int AM92 = this.A01.AM9(bArr, i, bArr2, i2);
            for (int i6 = 0; i6 < this.A00; i6++) {
                int i7 = i2 + i6;
                bArr2[i7] = (byte) (bArr2[i7] ^ this.A05[i6]);
            }
            byte[] bArr5 = this.A05;
            this.A05 = this.A04;
            this.A04 = bArr5;
            return AM92;
        }
        throw new C67983Bg("input buffer too short");
    }

    @Override // X.AbstractC11690gn
    public void reset() {
        byte[] bArr = this.A03;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        byte[] bArr2 = this.A04;
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = 0;
        }
        this.A01.reset();
    }
}
