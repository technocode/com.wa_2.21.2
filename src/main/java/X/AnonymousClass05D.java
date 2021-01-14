package X;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.05D  reason: invalid class name */
public class AnonymousClass05D extends AnonymousClass1VU {
    public AnonymousClass05D(AnonymousClass009 r1, C000300f r2) {
        super(r1, r2);
    }

    public static final byte[] A00(String str, byte[] bArr) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr, 16, 128)).getEncoded(), "AES").getEncoded();
    }
}
