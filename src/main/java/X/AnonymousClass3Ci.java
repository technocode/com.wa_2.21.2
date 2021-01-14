package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Ci  reason: invalid class name */
public class AnonymousClass3Ci {
    public static final byte[] A02 = {2};
    public static final byte[] A03 = {1};
    public final int A00;
    public final byte[] A01;

    public AnonymousClass3Ci(int i, byte[] bArr) {
        this.A00 = i;
        this.A01 = bArr;
    }

    public static final byte[] A00(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
