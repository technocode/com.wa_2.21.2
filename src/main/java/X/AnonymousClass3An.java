package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLException;

/* renamed from: X.3An  reason: invalid class name */
public class AnonymousClass3An {
    public SecureRandom A00;

    public AnonymousClass3An() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw new C29001Wo((byte) 80, new SSLException("SHA1PRNGalgorithm not found."));
        }
    }
}
