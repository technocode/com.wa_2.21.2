package X;

import android.util.Base64;

/* renamed from: X.3Aq  reason: invalid class name and case insensitive filesystem */
public class C67823Aq {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;

    public C67823Aq(String str, String str2, String str3, byte[] bArr) {
        this.A02 = str;
        this.A00 = str3;
        this.A01 = str2;
        this.A03 = Base64.encodeToString(bArr, 2);
        this.A04 = bArr;
    }
}
