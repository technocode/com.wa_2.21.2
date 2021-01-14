package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass05G;
import X.C05790Qe;
import X.C11510gR;
import X.C11660gk;
import X.C67963Be;
import X.C68063Bo;
import X.C75093cE;

public class SHA384 {

    public class Mappings extends AnonymousClass05G {
        public static final String A00 = SHA384.class.getName();
    }

    public class Digest extends C05790Qe implements Cloneable {
        public Digest() {
            super(new C75093cE());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() {
            C05790Qe r2 = (C05790Qe) super.clone();
            r2.A00 = new C75093cE((C75093cE) this.A00);
            return r2;
        }
    }

    public class HashMac extends C11660gk {
        public HashMac() {
            super(new C11510gR(new C75093cE()));
        }
    }

    public class KeyGenerator extends C68063Bo {
        public KeyGenerator() {
            super("HMACSHA384", 384, new C67963Be());
        }
    }
}
