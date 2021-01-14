package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.326  reason: invalid class name */
public final class AnonymousClass326 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("No client certificate verification provided");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        Date date = new Date();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            x509Certificate.checkValidity(date);
        }
        try {
            CertPathValidator instance = CertPathValidator.getInstance("PKIX");
            CertPath generateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(x509CertificateArr));
            X509Certificate[] x509CertificateArr2 = C451022z.A01;
            int length = x509CertificateArr2.length;
            HashSet hashSet = new HashSet(length);
            for (X509Certificate x509Certificate2 : x509CertificateArr2) {
                hashSet.add(new TrustAnchor(x509Certificate2, null));
            }
            try {
                PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
                pKIXParameters.setDate(date);
                pKIXParameters.setRevocationEnabled(false);
                try {
                    instance.validate(generateCertPath, pKIXParameters);
                } catch (InvalidAlgorithmParameterException | CertPathValidatorException e) {
                    throw new CertificateException(e);
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new CertificateException(e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new CertificateException(e3);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return C451022z.A01;
    }
}
