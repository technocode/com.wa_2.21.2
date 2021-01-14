package X;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.0c5  reason: invalid class name and case insensitive filesystem */
public final class C08980c5 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
