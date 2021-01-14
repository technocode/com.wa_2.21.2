package X;

/* renamed from: X.3au  reason: invalid class name and case insensitive filesystem */
public class C74453au extends AbstractC73293Wg implements AbstractC67993Bh {
    public int A00 = 0;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final AbstractC11690gn A05;

    public C74453au(AbstractC11690gn r3) {
        this.A05 = r3;
        int A4x = r3.A4x();
        this.A04 = A4x;
        this.A01 = new byte[A4x];
        this.A02 = new byte[A4x];
        this.A03 = new byte[A4x];
    }

    @Override // X.AbstractC11690gn
    public String A4i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A4i());
        sb.append("/SIC");
        return sb.toString();
    }

    @Override // X.AbstractC11690gn
    public int A4x() {
        return this.A05.A4x();
    }

    @Override // X.AbstractC11690gn
    public void AAX(boolean z, AbstractC11530gT r7) {
        if (r7 instanceof C11550gV) {
            C11550gV r72 = (C11550gV) r7;
            byte[] A3m = C002001d.A3m(r72.A01);
            this.A01 = A3m;
            int i = this.A04;
            int length = A3m.length;
            if (i >= length) {
                int i2 = i >> 1;
                int i3 = 8;
                if (8 > i2) {
                    i3 = i2;
                }
                if (i - length <= i3) {
                    AbstractC11530gT r2 = r72.A00;
                    if (r2 != null) {
                        this.A05.AAX(true, r2);
                    }
                    reset();
                    return;
                }
                StringBuilder A0S = AnonymousClass008.A0S("CTR/SIC mode requires IV of at least: ");
                A0S.append(i - i3);
                A0S.append(" bytes.");
                throw new IllegalArgumentException(A0S.toString());
            }
            throw new IllegalArgumentException(AnonymousClass008.A0N(AnonymousClass008.A0S("CTR/SIC mode requires IV no greater than: "), i, " bytes."));
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // X.AbstractC11690gn
    public int AM9(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.A04;
        A00(bArr, i, i3, bArr2, i2);
        return i3;
    }

    @Override // X.AbstractC11690gn
    public void reset() {
        byte[] bArr = this.A02;
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }
}
