package X;

import java.util.Arrays;

/* renamed from: X.1QE  reason: invalid class name */
public class AnonymousClass1QE {
    public final AnonymousClass1Q8 A00;
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass1QE(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A00 = new AnonymousClass1Q8(bArr, str, bArr2, bArr3, bArr5);
        this.A02 = bArr4;
        this.A01 = bArr6;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("BackupKey [");
        A0S.append(this.A00.toString());
        A0S.append(", hashedGoogleId=");
        A0S.append(Arrays.toString(this.A02));
        A0S.append(", cipherKey=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append("]");
        return A0S.toString();
    }
}
