package X;

import java.net.InetAddress;

/* renamed from: X.1VS  reason: invalid class name */
public final class AnonymousClass1VS {
    public final long A00;
    public final InetAddress A01;

    public AnonymousClass1VS(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("InetAddressWithExpiry{address=");
        A0S.append(this.A01);
        A0S.append(", expireTimeMillis=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
