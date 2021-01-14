package X;

/* renamed from: X.02P  reason: invalid class name */
public class AnonymousClass02P {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass02P(int i, int i2, byte[] bArr) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("EncryptedMessage{ciphertextVersion=");
        A0S.append(this.A01);
        A0S.append(", ciphertextType=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
