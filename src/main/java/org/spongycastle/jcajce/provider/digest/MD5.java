package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass05G;
import X.AnonymousClass2A8;
import X.C05790Qe;
import X.C11510gR;
import X.C11660gk;
import X.C67963Be;
import X.C68063Bo;

public class MD5 {

    public class Mappings extends AnonymousClass05G {
        public static final String A00 = MD5.class.getName();
    }

    public class Digest extends C05790Qe implements Cloneable {
        public Digest() {
            super(new AnonymousClass2A8());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() {
            C05790Qe r2 = (C05790Qe) super.clone();
            r2.A00 = new AnonymousClass2A8((AnonymousClass2A8) this.A00);
            return r2;
        }
    }

    public class HashMac extends C11660gk {
        public HashMac() {
            super(new C11510gR(new AnonymousClass2A8()));
        }
    }

    public class KeyGenerator extends C68063Bo {
        public KeyGenerator() {
            super("HMACMD5", 128, new C67963Be());
        }
    }
}
