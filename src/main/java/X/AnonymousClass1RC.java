package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: X.1RC  reason: invalid class name */
public final class AnonymousClass1RC implements LayeredSocketFactory {
    public final SSLSocketFactory A00 = C28051Sr.A1F();

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (socket == null) {
            socket = createSocket();
        }
        socket.bind(new InetSocketAddress(inetAddress, i2));
        socket.connect(new InetSocketAddress(str, i), HttpConnectionParams.getConnectionTimeout(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        return this.A00.createSocket(socket, str, i, true);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.A00.createSocket();
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.A00.createSocket(socket, str, i, z);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        return socket instanceof SSLSocket;
    }
}
