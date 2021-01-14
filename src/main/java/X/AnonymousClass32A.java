package X;

import android.net.SSLSessionCache;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.32A  reason: invalid class name */
public class AnonymousClass32A extends SSLSocketFactory {
    public final /* synthetic */ SSLSessionCache A00;
    public final /* synthetic */ AnonymousClass231 A01;
    public final /* synthetic */ SSLContext A02;
    public final /* synthetic */ SSLSocketFactory A03;

    public AnonymousClass32A(AnonymousClass231 r1, SSLSocketFactory sSLSocketFactory, SSLContext sSLContext, SSLSessionCache sSLSessionCache) {
        this.A01 = r1;
        this.A03 = sSLSocketFactory;
        this.A02 = sSLContext;
        this.A00 = sSLSessionCache;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = this.A03.createSocket(str, i);
        AnonymousClass231 r2 = this.A01;
        AnonymousClass231.A01(r2, createSocket);
        AnonymousClass327.A01(this.A02, this.A00, str, i);
        r2.A00.incrementAndGet();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.A03.createSocket(str, i, inetAddress, i2);
        AnonymousClass231 r2 = this.A01;
        AnonymousClass231.A01(r2, createSocket);
        AnonymousClass327.A01(this.A02, this.A00, str, i);
        r2.A00.incrementAndGet();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.A03.createSocket(inetAddress, i);
        AnonymousClass231 r3 = this.A01;
        AnonymousClass231.A01(r3, createSocket);
        AnonymousClass327.A01(this.A02, this.A00, inetAddress.getHostName(), i);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.A03.createSocket(inetAddress, i, inetAddress2, i2);
        AnonymousClass231 r3 = this.A01;
        AnonymousClass231.A01(r3, createSocket);
        AnonymousClass327.A01(this.A02, this.A00, inetAddress2.getHostName(), i);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.A03.createSocket(socket, str, i, z);
        AnonymousClass231 r2 = this.A01;
        AnonymousClass231.A01(r2, createSocket);
        AnonymousClass327.A01(this.A02, this.A00, str, i);
        r2.A00.incrementAndGet();
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }
}
