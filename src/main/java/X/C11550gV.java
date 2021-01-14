package X;

/* renamed from: X.0gV  reason: invalid class name and case insensitive filesystem */
public class C11550gV implements AbstractC11530gT {
    public AbstractC11530gT A00;
    public byte[] A01;

    public C11550gV(AbstractC11530gT r4, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A01 = bArr2;
        this.A00 = r4;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public C11550gV(AbstractC11530gT r3, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A01 = bArr2;
        this.A00 = r3;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
