package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0gh  reason: invalid class name and case insensitive filesystem */
public class C11650gh {
    public byte[] A00;

    public C11650gh(byte[] bArr) {
        try {
            if (bArr.length <= 32) {
                this.A00 = bArr;
            } else {
                this.A00 = MessageDigest.getInstance("SHA-256").digest(bArr);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void A00(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(this.A00);
            this.A00 = instance.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
