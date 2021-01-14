package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Bo  reason: invalid class name and case insensitive filesystem */
public class C68063Bo extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public C67963Be A02;
    public boolean A03 = true;

    public C68063Bo(String str, int i, C67963Be r4) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = r4;
    }

    public SecretKey engineGenerateKey() {
        if (this.A03) {
            C67963Be r2 = this.A02;
            SecureRandom secureRandom = new SecureRandom();
            int i = this.A00;
            r2.A01 = secureRandom;
            r2.A00 = (i + 7) >> 3;
            this.A03 = false;
        }
        C67963Be r1 = this.A02;
        byte[] bArr = new byte[r1.A00];
        r1.A01.nextBytes(bArr);
        return new SecretKeySpec(bArr, this.A01);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = new SecureRandom();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        C67963Be r1 = this.A02;
        r1.A01 = secureRandom;
        r1.A00 = (i + 7) / 8;
        this.A03 = false;
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            C67963Be r1 = this.A02;
            int i = this.A00;
            r1.A01 = secureRandom;
            r1.A00 = (i + 7) >> 3;
            this.A03 = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
