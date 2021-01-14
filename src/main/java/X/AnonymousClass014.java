package X;

import java.security.AccessController;
import java.security.Provider;
import org.spongycastle.jcajce.provider.digest.MD5;
import org.spongycastle.jcajce.provider.digest.SHA1;
import org.spongycastle.jcajce.provider.digest.SHA256;
import org.spongycastle.jcajce.provider.digest.SHA384;
import org.spongycastle.jcajce.provider.symmetric.AES;

/* renamed from: X.014  reason: invalid class name */
public final class AnonymousClass014 extends Provider implements AnonymousClass015 {
    public static final String[] A00 = {"MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3"};
    public static final String[] A01 = {"BC", "PKCS12"};
    public static final String[] A02 = {"AES", "ARC4"};

    public AnonymousClass014() {
        super("SC", 1.54d, "BouncyCastle Security Provider v1.54");
        AccessController.doPrivileged(new AnonymousClass05E(this));
    }

    public void A00(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException(AnonymousClass008.A0L("duplicate provider key (", str, ") found"));
    }

    public final void A01(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class<?> cls = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(strArr[i]);
                    sb.append("$Mappings");
                    cls = classLoader.loadClass(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings");
                    cls = Class.forName(sb2.toString());
                }
            } catch (ClassNotFoundException unused) {
            }
            if (cls != null) {
                try {
                    AnonymousClass05H r1 = (AnonymousClass05H) cls.newInstance();
                    if (r1 instanceof AES.Mappings) {
                        StringBuilder sb3 = new StringBuilder();
                        String str2 = AES.Mappings.A00;
                        A00("AlgorithmParameters.AES", AnonymousClass008.A0O(sb3, str2, "$AlgParams"));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append("$AlgParamGen");
                        A00("AlgorithmParameterGenerator.AES", sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append("$ECB");
                        A00("Cipher.AES", sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append("$KeyGen");
                        A00("KeyGenerator.AES", sb6.toString());
                    } else if (r1 instanceof SHA384.Mappings) {
                        StringBuilder sb7 = new StringBuilder();
                        String str3 = SHA384.Mappings.A00;
                        A00("MessageDigest.SHA-384", AnonymousClass008.A0O(sb7, str3, "$Digest"));
                        A00("Alg.Alias.MessageDigest.SHA384", "SHA-384");
                        AnonymousClass05G.A00(this, "SHA384", AnonymousClass008.A0O(new StringBuilder(), str3, "$HashMac"), AnonymousClass008.A0O(new StringBuilder(), str3, "$KeyGenerator"));
                    } else if (r1 instanceof SHA256.Mappings) {
                        StringBuilder sb8 = new StringBuilder();
                        String str4 = SHA256.Mappings.A00;
                        A00("MessageDigest.SHA-256", AnonymousClass008.A0O(sb8, str4, "$Digest"));
                        A00("Alg.Alias.MessageDigest.SHA256", "SHA-256");
                        AnonymousClass05G.A00(this, "SHA256", AnonymousClass008.A0O(new StringBuilder(), str4, "$HashMac"), AnonymousClass008.A0O(new StringBuilder(), str4, "$KeyGenerator"));
                    } else if (!(r1 instanceof SHA1.Mappings)) {
                        StringBuilder sb9 = new StringBuilder();
                        String str5 = MD5.Mappings.A00;
                        A00("MessageDigest.MD5", AnonymousClass008.A0O(sb9, str5, "$Digest"));
                        AnonymousClass05G.A00(this, "MD5", AnonymousClass008.A0O(new StringBuilder(), str5, "$HashMac"), AnonymousClass008.A0O(new StringBuilder(), str5, "$KeyGenerator"));
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        String str6 = SHA1.Mappings.A00;
                        A00("MessageDigest.SHA-1", AnonymousClass008.A0O(sb10, str6, "$Digest"));
                        A00("Alg.Alias.MessageDigest.SHA1", "SHA-1");
                        A00("Alg.Alias.MessageDigest.SHA", "SHA-1");
                        AnonymousClass05G.A00(this, "SHA1", AnonymousClass008.A0O(new StringBuilder(), str6, "$HashMac"), AnonymousClass008.A0O(new StringBuilder(), str6, "$KeyGenerator"));
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str6);
                        sb11.append("$SHA1Mac");
                        A00("Mac.PBEWITHHMACSHA", sb11.toString());
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(str6);
                        sb12.append("$SHA1Mac");
                        A00("Mac.PBEWITHHMACSHA1", sb12.toString());
                        A00("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(str6);
                        sb13.append("$PBKDF2WithHmacSHA1UTF8");
                        A00("SecretKeyFactory.PBKDF2WithHmacSHA1", sb13.toString());
                        A00("Alg.Alias.SecretKeyFactory.PBKDF2WithHmacSHA1AndUTF8", "PBKDF2WithHmacSHA1");
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(str6);
                        sb14.append("$PBKDF2WithHmacSHA18BIT");
                        A00("SecretKeyFactory.PBKDF2WithHmacSHA1And8BIT", sb14.toString());
                        A00("Alg.Alias.SecretKeyFactory.PBKDF2withASCII", "PBKDF2WithHmacSHA1And8BIT");
                        A00("Alg.Alias.SecretKeyFactory.PBKDF2with8BIT", "PBKDF2WithHmacSHA1And8BIT");
                    }
                } catch (Exception e) {
                    StringBuilder A0Y = AnonymousClass008.A0Y("cannot create instance of ", str);
                    A0Y.append(strArr[i]);
                    A0Y.append("$Mappings : ");
                    A0Y.append(e);
                    throw new InternalError(A0Y.toString());
                }
            }
        }
    }
}
