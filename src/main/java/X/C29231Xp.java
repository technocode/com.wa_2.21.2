package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: X.1Xp  reason: invalid class name and case insensitive filesystem */
public final class C29231Xp implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public C29231Xp(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29231Xp.class != obj.getClass()) {
            return false;
        }
        C29231Xp r4 = (C29231Xp) obj;
        if (!this.A00.equals(r4.A00)) {
            return false;
        }
        return this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }
}
