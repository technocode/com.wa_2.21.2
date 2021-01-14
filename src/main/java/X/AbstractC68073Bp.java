package X;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Bp  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC68073Bp extends CipherSpi {
    public AlgorithmParameters A00 = null;
    public final AnonymousClass3X1 A01 = new AnonymousClass3X1();

    @Override // javax.crypto.CipherSpi
    public abstract byte[] engineDoFinal(byte[] bArr, int i, int i2);

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory instance = KeyFactory.getInstance(str, this.A01.A00);
                if (i == 1) {
                    return instance.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return instance.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException(AnonymousClass008.A0F("Unknown key type ", i));
            } catch (NoSuchProviderException e) {
                StringBuilder A0S = AnonymousClass008.A0S("Unknown key type ");
                A0S.append(e.getMessage());
                throw new InvalidKeyException(A0S.toString());
            } catch (InvalidKeySpecException e2) {
                StringBuilder A0S2 = AnonymousClass008.A0S("Unknown key type ");
                A0S2.append(e2.getMessage());
                throw new InvalidKeyException(A0S2.toString());
            }
        } catch (C73273We e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return engineDoFinal(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
