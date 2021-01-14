package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1Qg  reason: invalid class name and case insensitive filesystem */
public class C27501Qg extends SSLSocketFactory {
    public final int A00 = 3;
    public final AnonymousClass0CL A01;
    public final SSLSocketFactory A02 = C28051Sr.A1F();

    public C27501Qg(AnonymousClass0CL r3) {
        this.A01 = r3;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return new C27491Qf((SSLSocket) this.A02.createSocket(str, i), this.A00, this.A01);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return new C27491Qf((SSLSocket) this.A02.createSocket(str, i, inetAddress, i2), this.A00, this.A01);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return new C27491Qf((SSLSocket) this.A02.createSocket(inetAddress, i), this.A00, this.A01);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return new C27491Qf((SSLSocket) this.A02.createSocket(inetAddress, i, inetAddress2, i2), this.A00, this.A01);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return new C27491Qf((SSLSocket) this.A02.createSocket(socket, str, i, z), this.A00, this.A01);
    }

    public String[] getDefaultCipherSuites() {
        return this.A02.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A02.getSupportedCipherSuites();
    }
}
