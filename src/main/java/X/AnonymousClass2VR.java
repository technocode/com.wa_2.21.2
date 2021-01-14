package X;

/* renamed from: X.2VR  reason: invalid class name */
public class AnonymousClass2VR {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass2VR(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.A02 = (byte[]) bArr.clone();
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WtWriteParams{offset=");
        A0S.append(this.A01);
        A0S.append(", len=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
