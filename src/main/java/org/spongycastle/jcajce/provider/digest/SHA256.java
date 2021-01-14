package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass05G;
import X.C05790Qe;
import X.C05830Qk;
import X.C11510gR;
import X.C11660gk;
import X.C67963Be;
import X.C68063Bo;

public class SHA256 {

    public class Mappings extends AnonymousClass05G {
        public static final String A00 = SHA256.class.getName();
    }

    public class Digest extends C05790Qe implements Cloneable {
        public Digest() {
            super(new C05830Qk());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() {
            C05790Qe r2 = (C05790Qe) super.clone();
            r2.A00 = new C05830Qk((C05830Qk) this.A00);
            return r2;
        }
    }

    public class HashMac extends C11660gk {
        public HashMac() {
            super(new C11510gR(new C05830Qk()));
        }
    }

    public class KeyGenerator extends C68063Bo {
        public KeyGenerator() {
            super("HMACSHA256", 256, new C67963Be());
        }
    }
}
