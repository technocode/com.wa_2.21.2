package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.0Qn  reason: invalid class name and case insensitive filesystem */
public class C05850Qn {
    public static void A00(byte[] bArr) {
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
