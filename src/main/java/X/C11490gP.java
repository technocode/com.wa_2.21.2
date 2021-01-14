package X;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0gP  reason: invalid class name and case insensitive filesystem */
public class C11490gP extends SecretKeyFactorySpi {
    public String A00;

    public C11490gP(String str) {
        this.A00 = str;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        } else if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.A00);
        } else {
            try {
                return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            String str = this.A00;
            if (algorithm.equalsIgnoreCase(str)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.A00);
            }
            throw new InvalidKeyException(AnonymousClass008.A0O(AnonymousClass008.A0S("Key not of type "), str, "."));
        }
        throw new InvalidKeyException("key parameter is null");
    }
}
