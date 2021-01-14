package X;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Ck  reason: invalid class name and case insensitive filesystem */
public class C68233Ck {
    public final IvParameterSpec A00;
    public final SecretKeySpec A01;
    public final SecretKeySpec A02;

    public C68233Ck(byte[] bArr) {
        try {
            byte[][] A0i = AnonymousClass1YV.A0i(bArr, 32, 32, 16);
            this.A01 = new SecretKeySpec(A0i[0], "AES");
            this.A02 = new SecretKeySpec(A0i[1], "HmacSHA256");
            this.A00 = new IvParameterSpec(A0i[2]);
        } catch (ParseException e) {
            throw new AssertionError(e);
        }
    }
}
