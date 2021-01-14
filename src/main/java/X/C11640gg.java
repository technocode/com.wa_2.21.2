package X;

/* renamed from: X.0gg  reason: invalid class name and case insensitive filesystem */
public class C11640gg {
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public long A00;
    public C11670gl A01;
    public byte[] A02;
    public final C11650gh A03;

    public C11640gg(byte[] bArr, byte[] bArr2) {
        C11650gh r1 = new C11650gh(bArr);
        this.A03 = r1;
        this.A02 = r1.A00;
        r1.A00(bArr2);
    }

    public void A00(byte[] bArr) {
        byte[][] A09 = C05360Of.A09(C002001d.A3p(bArr, this.A02, null, 64));
        this.A02 = A09[0];
        this.A01 = new C11670gl(A09[1]);
        this.A00 = 0;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C11670gl r5 = this.A01;
        if (r5 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r5.A01(j, this.A03.A00, bArr);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C11670gl r2 = this.A01;
        if (r2 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r2.A02(j, this.A03.A00, bArr2, bArr.length);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }
}
