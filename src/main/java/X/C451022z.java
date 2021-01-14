package X;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.TrustManager;

/* renamed from: X.22z  reason: invalid class name and case insensitive filesystem */
public class C451022z extends AbstractC08970c4 implements AbstractC29221Xo {
    public static final X509Certificate[] A01;
    public static final TrustManager[] A02 = {new AnonymousClass326()};
    public final AtomicInteger A00 = new AtomicInteger();

    static {
        try {
            try {
                A01 = (X509Certificate[]) CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDxTCCAq2gAwIBAgIQAqxcJmoLQJuPC3nyrkYldzANBgkqhkiG9w0BAQUFADBs\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSswKQYDVQQDEyJEaWdpQ2VydCBIaWdoIEFzc3VyYW5j\nZSBFViBSb290IENBMB4XDTA2MTExMDAwMDAwMFoXDTMxMTExMDAwMDAwMFowbDEL\nMAkGA1UEBhMCVVMxFTATBgNVBAoTDERpZ2lDZXJ0IEluYzEZMBcGA1UECxMQd3d3\nLmRpZ2ljZXJ0LmNvbTErMCkGA1UEAxMiRGlnaUNlcnQgSGlnaCBBc3N1cmFuY2Ug\nRVYgUm9vdCBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMbM5XPm\n+9S75S0tMqbf5YE/yc0lSbZxKsPVlDRnogocsF9ppkCxxLeyj9CYpKlBWTrT3JTW\nPNt0OKRKzE0lgvdKpVMSOO7zSW1xkX5jtqumX8OkhPhPYlG++MXs2ziS4wblCJEM\nxChBVfvLWokVfnHoNb9Ncgk9vjo4UFt3MRuNs8ckRZqnrG0AFFoEt7oT61EKmEFB\nIk5lYYeBQVCmeVyJ3hlKV9Uu5l0cUyx+mM0aBhakaHPQNAQTXKFx01p8VdteZOE3\nhzBWBOURtCmAEvF5OYiiAhF8J2a3iLd48soKqDirCmTCv2ZdlYTBoSUeh10aUAsg\nEsxBu24LUTi4S8sCAwEAAaNjMGEwDgYDVR0PAQH/BAQDAgGGMA8GA1UdEwEB/wQF\nMAMBAf8wHQYDVR0OBBYEFLE+w2kD+L9HAdSYJhoIAu9jZCvDMB8GA1UdIwQYMBaA\nFLE+w2kD+L9HAdSYJhoIAu9jZCvDMA0GCSqGSIb3DQEBBQUAA4IBAQAcGgaX3Nec\nnzyIZgYIVyHbIUf4KmeqvxgydkAQV8GK83rZEWWONfqe/EW1ntlMMUu4kehDLI6z\neM7b41N5cdblIZQB2lWHmiRk9opmzN6cN82oNLFpmyPInngiK3BD41VHMWEZ71jF\nhS9OMPagMRYjyOfiZRYzy78aG6A9+MpeizGLYAiJLQwGXFK3xPkKmNEVX58Svnw2\nYzi9RKR/5CYrCsSXaQ3pjOLAEFe4yHYSkVXySGnYvCoCWw9E1CAx2/S6cCZdkGCe\nvEsXCS+0yx5DaMkHJ8HSXPfqIbloEpw8nL+e/IBcm2PN7EeqJSdnoDfzAIJ9VNep\n+OkuE6N36B9K\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\nMIIDrDCCApSgAwIBAgIQCssoukZe5TkIdnRw883GEjANBgkqhkiG9w0BAQwFADBh\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSAwHgYDVQQDExdEaWdpQ2VydCBHbG9iYWwgUm9vdCBD\nQTAeFw0xMzAzMDgxMjAwMDBaFw0yMzAzMDgxMjAwMDBaMEwxCzAJBgNVBAYTAlVT\nMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxJjAkBgNVBAMTHURpZ2lDZXJ0IEVDQyBT\nZWN1cmUgU2VydmVyIENBMHYwEAYHKoZIzj0CAQYFK4EEACIDYgAE4ghC6nfYJN6g\nLGSkE85AnCNyqQIKDjc/ITa4jVMU9tWRlUvzlgKNcR7E2Munn17voOZ/WpIRllNv\n68DLP679Wz9HJOeaBy6Wvqgvu1cYr3GkvXg6HuhbPGtkESvMNCuMo4IBITCCAR0w\nEgYDVR0TAQH/BAgwBgEB/wIBADAOBgNVHQ8BAf8EBAMCAYYwNAYIKwYBBQUHAQEE\nKDAmMCQGCCsGAQUFBzABhhhodHRwOi8vb2NzcC5kaWdpY2VydC5jb20wQgYDVR0f\nBDswOTA3oDWgM4YxaHR0cDovL2NybDMuZGlnaWNlcnQuY29tL0RpZ2lDZXJ0R2xv\nYmFsUm9vdENBLmNybDA9BgNVHSAENjA0MDIGBFUdIAAwKjAoBggrBgEFBQcCARYc\naHR0cHM6Ly93d3cuZGlnaWNlcnQuY29tL0NQUzAdBgNVHQ4EFgQUo53mH/naOU/A\nbuiRy5Wl2jHiCp8wHwYDVR0jBBgwFoAUA95QNVbRTLtm8KPiGxvDl7I90VUwDQYJ\nKoZIhvcNAQEMBQADggEBAMeKoENL7HTJxavVHzA1Nm6YVntIrAVjrnuaVyRXzG/6\n3qttnMe2uuzO58pzZNvfBDcKAEmzP58mrZGMIOgfiA4q+2Y3yDDo0sIkp0VILeoB\nUEoxlBPfjV/aKrtJPGHzecicZpIalir0ezZYoyxBEHQa0+1IttK7igZFcTMQMHp6\nmCHdJLnsnLWSB62DxsRq+HfmNb4TDydkskO/g+l3VtsIh5RHFPVfKK+jaEyDj2D3\nloB5hWp2Jp2VDCADjT7ueihlZGak2YPqmXTNbk19HOuNssWvFhtOyPNV6og4ETQd\nEa8/B6hPatJ0ES8q/HO3X8IVQwVs1n3aAr0im0/T+Xc=\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\nMIIFKzCCBBOgAwIBAgIQfuFKb2/v8tN/P61lTTratDANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB3MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxKDAmBgNVBAMTH1N5bWFudGVjIENs\nYXNzIDMgRVYgU1NMIENBIC0gRzMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK\nAoIBAQDYoWV0I+grZOIy1zM3PY71NBZI3U9/hxz4RCMTjvsR2ERaGHGOYBYmkpv9\nFwvhcXBC/r/6HMCqo6e1cej/GIP23xAKE2LIPZyn3i4/DNkd5y77Ks7Imn+Hv9hM\nBBUyydHMlXGgTihPhNk1++OGb5RT5nKKY2cuvmn2926OnGAE6yn6xEdC0niY4+wL\npZLct5q9gGQrOHw4CVtm9i2VeoayNC6FnpAOX7ddpFFyRnATv2fytqdNFB5suVPu\nIxpOjUhVQ0GxiXVqQCjFfd3SbtICGS97JJRL6/EaqZvjI5rq+jOrCiy39GAI3Z8c\nzd0tAWaAr7MvKR0juIrhoXAHDDQPAgMBAAGjggFdMIIBWTAvBggrBgEFBQcBAQQj\nMCEwHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wEgYDVR0TAQH/BAgw\nBgEB/wIBADBlBgNVHSAEXjBcMFoGBFUdIAAwUjAmBggrBgEFBQcCARYaaHR0cDov\nL3d3dy5zeW1hdXRoLmNvbS9jcHMwKAYIKwYBBQUHAgIwHBoaaHR0cDovL3d3dy5z\neW1hdXRoLmNvbS9ycGEwMAYDVR0fBCkwJzAloCOgIYYfaHR0cDovL3MxLnN5bWNi\nLmNvbS9wY2EzLWc1LmNybDAOBgNVHQ8BAf8EBAMCAQYwKQYDVR0RBCIwIKQeMBwx\nGjAYBgNVBAMTEVN5bWFudGVjUEtJLTEtNTMzMB0GA1UdDgQWBBQBWavn3ToLWaZk\nY9bPIAdX1ZHnajAfBgNVHSMEGDAWgBR/02Wnwt3su/AwCfNDOfoCrzMxMzANBgkq\nhkiG9w0BAQsFAAOCAQEAQgFVe9AWGl1Y6LubqE3X89frE5SG1n8hC0e8V5uSXU8F\nnzikEHzPg74GQ0aNCLxq1xCm+quvL2GoY/Jl339MiBKIT7Np2f8nwAqXkY9W+4nE\nqLuSLRtzsMarNvSWbCAI7woeZiRFT2cAQMgHVHQzO6atuyOfZu2iRHA0+w7qAf3P\neHTfp61Vt19N9tY/4IbOJMdCqRMURDVLtt/JYKwMf9mTIUvunORJApjTYHtcvNUw\nLwfORELEC5n+5p/8sHiGUW3RLJ3GlvuFgrsEL/digO9i2n/2DqyQuFa9eT/ygG6j\n2bkPXToHHZGThkspTOHcteHgM52zyzaRS/6htO7w+Q==\n-----END CERTIFICATE-----".getBytes("UTF-8"))).toArray(new X509Certificate[0]);
            } catch (CertificateException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedEncodingException e2) {
                throw new Error(e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException(e3);
        }
    }

    public C451022z(Context context) {
        super(context);
    }

    @Override // X.AbstractC29221Xo
    public int A5N() {
        return this.A00.get();
    }
}
