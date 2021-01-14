package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.1UL  reason: invalid class name */
public class AnonymousClass1UL {
    public static Set A00 = Collections.singleton("Crypto");
    public static final Set A01;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A01 = linkedHashSet;
        linkedHashSet.add("GmsCore_OpenSSL");
        A01.add("AndroidOpenSSL");
    }

    public static Object A00(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return obj;
        }
        for (String str3 : A01) {
            try {
                if (str3.equals(str2)) {
                    return obj;
                }
                if (obj instanceof SecureRandom) {
                    return SecureRandom.getInstance(str, str3);
                }
                if (obj instanceof Cipher) {
                    return Cipher.getInstance(str, str3);
                }
                if (obj instanceof KeyGenerator) {
                    return KeyGenerator.getInstance(str, str3);
                }
                throw new IllegalArgumentException("Unknown instance type");
            } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
                e.getMessage();
            }
        }
        if (A00.contains(str2)) {
            AnonymousClass008.A16("SecureCryptoInstance/tryBestProvider/using insecure provider: ", str2);
        }
        return obj;
    }

    public static SecureRandom A01() {
        if (Build.VERSION.SDK_INT >= 26) {
            return SecureRandom.getInstanceStrong();
        }
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        return (SecureRandom) A00(instance, "SHA1PRNG", instance.getProvider().getName());
    }
}
