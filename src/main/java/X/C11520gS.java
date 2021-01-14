package X;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
public class C11520gS implements AbstractC11530gT {
    public byte[] A00;

    public C11520gS(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public C11520gS(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
