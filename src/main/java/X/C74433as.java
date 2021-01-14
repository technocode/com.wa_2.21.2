package X;

/* renamed from: X.3as  reason: invalid class name and case insensitive filesystem */
public class C74433as extends AbstractC73293Wg {
    public int A00;
    public int A01;
    public AbstractC11690gn A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public C74433as(AbstractC11690gn r4, int i) {
        this.A02 = r4;
        int i2 = i >> 3;
        this.A00 = i2;
        int A4x = r4.A4x();
        this.A04 = new byte[A4x];
        this.A06 = new byte[A4x];
        this.A05 = new byte[A4x];
        this.A07 = new byte[i2];
    }

    @Override // X.AbstractC11690gn
    public String A4i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.A4i());
        sb.append("/CFB");
        sb.append(this.A00 << 3);
        return sb.toString();
    }

    @Override // X.AbstractC11690gn
    public int A4x() {
        return this.A00;
    }

    @Override // X.AbstractC11690gn
    public void AAX(boolean z, AbstractC11530gT r9) {
        this.A03 = z;
        if (r9 instanceof C11550gV) {
            C11550gV r92 = (C11550gV) r9;
            byte[] bArr = r92.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A04;
            int length2 = bArr2.length;
            if (length < length2) {
                System.arraycopy(bArr, 0, bArr2, length2 - length, length);
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.A04;
                    if (i >= bArr3.length - bArr.length) {
                        break;
                    }
                    bArr3[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            AbstractC11530gT r1 = r92.A00;
            if (r1 != null) {
                this.A02.AAX(true, r1);
                return;
            }
            return;
        }
        reset();
        if (r9 != null) {
            this.A02.AAX(true, r9);
        }
    }

    @Override // X.AbstractC11690gn
    public int AM9(byte[] bArr, int i, byte[] bArr2, int i2) {
        A00(bArr, i, this.A00, bArr2, i2);
        return this.A00;
    }

    @Override // X.AbstractC11690gn
    public void reset() {
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        byte[] bArr2 = this.A07;
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = 0;
        }
        this.A01 = 0;
        this.A02.reset();
    }
}
