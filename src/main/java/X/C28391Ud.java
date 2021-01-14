package X;

import java.util.Arrays;

/* renamed from: X.1Ud  reason: invalid class name and case insensitive filesystem */
public class C28391Ud {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public C28391Ud(int i, byte[] bArr, byte[] bArr2) {
        this.A00 = i;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("GetCipherKeyResult [code=");
        A0S.append(this.A00);
        A0S.append(", key=");
        A0S.append(Arrays.toString(this.A02));
        A0S.append(", accountHash=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append("]");
        return A0S.toString();
    }
}
