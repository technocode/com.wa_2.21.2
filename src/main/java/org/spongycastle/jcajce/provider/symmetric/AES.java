package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass05H;
import X.AnonymousClass3X0;
import X.AnonymousClass3X1;
import X.C67963Be;
import X.C68063Bo;
import X.C73353Wz;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

public final class AES {

    public class AlgParams extends AnonymousClass3X0 {
        public String engineToString() {
            return "AES IV";
        }
    }

    public class Mappings extends AnonymousClass05H {
        public static final String A00 = AES.class.getName();
    }

    public class AlgParamGen extends AlgorithmParameterGeneratorSpi {
        public SecureRandom A00;
        public final AnonymousClass3X1 A01 = new AnonymousClass3X1();

        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("AES", this.A01.A00);
                instance.init(new IvParameterSpec(bArr));
                return instance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            this.A00 = secureRandom;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class KeyGen extends C68063Bo {
        public KeyGen() {
            super("AES", 192, new C67963Be());
        }
    }

    public class ECB extends C73353Wz {
        public ECB() {
            new Object() {
                /* class org.spongycastle.jcajce.provider.symmetric.AES.ECB.AnonymousClass1 */
            };
        }
    }
}
