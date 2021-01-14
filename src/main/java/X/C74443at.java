package X;

/* renamed from: X.3at  reason: invalid class name and case insensitive filesystem */
public class C74443at extends AbstractC73293Wg {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final AbstractC11690gn A05;

    public C74443at(AbstractC11690gn r3, int i) {
        this.A05 = r3;
        this.A04 = i >> 3;
        int A4x = r3.A4x();
        this.A01 = new byte[A4x];
        this.A03 = new byte[A4x];
        this.A02 = new byte[A4x];
    }

    @Override // X.AbstractC11690gn
    public String A4i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A4i());
        sb.append("/OFB");
        sb.append(this.A04 << 3);
        return sb.toString();
    }

    @Override // X.AbstractC11690gn
    public int A4x() {
        return this.A04;
    }

    @Override // X.AbstractC11690gn
    public void AAX(boolean z, AbstractC11530gT r9) {
        if (r9 instanceof C11550gV) {
            C11550gV r92 = (C11550gV) r9;
            byte[] bArr = r92.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A01;
            int length2 = bArr2.length;
            if (length < length2) {
                System.arraycopy(bArr, 0, bArr2, length2 - length, length);
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.A01;
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
                this.A05.AAX(true, r1);
                return;
            }
            return;
        }
        reset();
        if (r9 != null) {
            this.A05.AAX(true, r9);
        }
    }

    @Override // X.AbstractC11690gn
    public int AM9(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.A04;
        A00(bArr, i, i3, bArr2, i2);
        return i3;
    }

    @Override // X.AbstractC11690gn
    public void reset() {
        byte[] bArr = this.A01;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }
}
