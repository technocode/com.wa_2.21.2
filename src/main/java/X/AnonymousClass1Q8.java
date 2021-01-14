package X;

import java.util.Arrays;

/* renamed from: X.1Q8  reason: invalid class name */
public class AnonymousClass1Q8 {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public AnonymousClass1Q8(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A03 = bArr;
        this.A00 = str;
        this.A04 = bArr2;
        this.A02 = bArr3;
        this.A01 = bArr4;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("BackupCipher [cipherVersion=");
        A0S.append(Arrays.toString(this.A03));
        A0S.append(" keyVersion=");
        A0S.append(this.A00);
        A0S.append(", serverSalt=");
        A0S.append(Arrays.toString(this.A04));
        A0S.append(", googleIdSalt=");
        A0S.append(Arrays.toString(this.A02));
        A0S.append(", encryptionIv=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append("]");
        return A0S.toString();
    }
}
