package org.spongycastle.jcajce.provider.digest;

import X.AbstractC11530gT;
import X.AnonymousClass008;
import X.AnonymousClass05G;
import X.AnonymousClass0Qf;
import X.AnonymousClass1YV;
import X.C05790Qe;
import X.C11490gP;
import X.C11500gQ;
import X.C11510gR;
import X.C11540gU;
import X.C11660gk;
import X.C67963Be;
import X.C68063Bo;
import X.C68093Br;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

public class SHA1 {

    public class Mappings extends AnonymousClass05G {
        public static final String A00 = SHA1.class.getName();
    }

    public class Digest extends C05790Qe implements Cloneable {
        public Digest() {
            super(new AnonymousClass0Qf());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() {
            C05790Qe r2 = (C05790Qe) super.clone();
            r2.A00 = new AnonymousClass0Qf((AnonymousClass0Qf) this.A00);
            return r2;
        }
    }

    public class PBKDF2WithHmacSHA18BIT extends BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA18BIT() {
            super("PBKDF2WithHmacSHA1And8bit", 1);
        }
    }

    public class BasePBKDF2WithHmacSHA1 extends C11490gP {
        public int A00;

        public BasePBKDF2WithHmacSHA1(String str, int i) {
            super(str);
            this.A00 = i;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            byte[] bArr;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    throw new InvalidKeySpecException("missing required salt");
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder A0S = AnonymousClass008.A0S("positive iteration count required: ");
                    A0S.append(pBEKeySpec.getIterationCount());
                    throw new InvalidKeySpecException(A0S.toString());
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("positive key length required: ");
                    A0S2.append(pBEKeySpec.getKeyLength());
                    throw new InvalidKeySpecException(A0S2.toString());
                } else if (pBEKeySpec.getPassword().length != 0) {
                    int keyLength = pBEKeySpec.getKeyLength();
                    int i = this.A00;
                    C11500gQ A0A = AnonymousClass1YV.A0A(i, 1);
                    if (i == 5) {
                        char[] password = pBEKeySpec.getPassword();
                        if (password != null) {
                            bArr = C68093Br.A01(password);
                        } else {
                            bArr = new byte[0];
                        }
                    } else {
                        char[] password2 = pBEKeySpec.getPassword();
                        if (password2 != null) {
                            int length = password2.length;
                            bArr = new byte[length];
                            for (int i2 = 0; i2 != length; i2++) {
                                bArr[i2] = (byte) password2[i2];
                            }
                        } else {
                            bArr = new byte[0];
                        }
                    }
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A0A.A02 = bArr;
                    A0A.A03 = salt;
                    A0A.A00 = iterationCount;
                    AbstractC11530gT A002 = A0A.A00(keyLength);
                    for (int i3 = 0; i3 != bArr.length; i3++) {
                        bArr[i3] = 0;
                    }
                    return new C11540gU(super.A00, this.A00, keyLength, pBEKeySpec, A002);
                } else {
                    throw new IllegalArgumentException("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    public class HashMac extends C11660gk {
        public HashMac() {
            super(new C11510gR(new AnonymousClass0Qf()));
        }
    }

    public class KeyGenerator extends C68063Bo {
        public KeyGenerator() {
            super("HMACSHA1", 160, new C67963Be());
        }
    }

    public class SHA1Mac extends C11660gk {
        public SHA1Mac() {
            super(new C11510gR(new AnonymousClass0Qf()));
        }
    }

    public class PBKDF2WithHmacSHA1UTF8 extends BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA1UTF8() {
            super("PBKDF2WithHmacSHA1", 5);
        }
    }
}
