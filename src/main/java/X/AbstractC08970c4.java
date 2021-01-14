package X;

import android.content.Context;
import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0c4  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC08970c4 extends SSLSocketFactory {
    public SSLSocketFactory A00;
    public final SSLSessionCache A01;
    public final C08990c6 A02;
    public final SSLContext A03;

    public AbstractC08970c4(Context context) {
        C08990c6 r0;
        synchronized (C08990c6.class) {
            r0 = C08990c6.A04;
            if (r0 == null) {
                r0 = new C08990c6();
                C08990c6.A04 = r0;
            }
        }
        this.A02 = r0;
        SSLSessionCache sSLSessionCache = null;
        SSLContext A002 = A00(A00(A00(null, "TLS"), "SSLv3"), "SSL");
        if (A002 != null) {
            this.A03 = A002;
            A002.getClientSessionContext().setSessionTimeout(86400);
            A002.getClientSessionContext().setSessionCacheSize(24);
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.exists()) {
                try {
                    sSLSessionCache = new SSLSessionCache(new File(externalCacheDir, "SSLSessionCache"));
                } catch (IOException unused) {
                }
            }
            this.A01 = sSLSessionCache;
            return;
        }
        NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException("No known algorithm available to provide SSL sockets");
        Log.e(noSuchAlgorithmException);
        throw new RuntimeException(noSuchAlgorithmException);
    }

    public static SSLContext A00(SSLContext sSLContext, String str) {
        if (sSLContext == null) {
            try {
                return SSLContext.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" algorithm not available for SSLContext: ");
                Log.w(sb.toString(), e);
            }
        }
        return sSLContext;
    }

    public final synchronized SSLSocketFactory A01() {
        SSLSocketFactory sSLSocketFactory;
        sSLSocketFactory = this.A00;
        if (sSLSocketFactory == null) {
            SSLContext sSLContext = this.A03;
            SSLSessionCache sSLSessionCache = this.A01;
            if (this instanceof AnonymousClass231) {
                AnonymousClass231 r2 = (AnonymousClass231) this;
                try {
                    sSLContext.init(null, AnonymousClass231.A03, null);
                    if (sSLSessionCache != null) {
                        AnonymousClass327.A00(sSLContext, sSLSessionCache);
                    }
                    sSLSocketFactory = new AnonymousClass32A(r2, sSLContext.getSocketFactory(), sSLContext, sSLSessionCache);
                } catch (KeyManagementException e) {
                    Log.e(e);
                    throw new RuntimeException(e);
                }
            } else if (!(this instanceof C08960c3)) {
                try {
                    sSLContext.init(null, C451022z.A02, null);
                    if (sSLSessionCache != null) {
                        AnonymousClass327.A00(sSLContext, sSLSessionCache);
                    }
                    sSLSocketFactory = sSLContext.getSocketFactory();
                } catch (KeyManagementException e2) {
                    Log.e(e2);
                    throw new RuntimeException(e2);
                }
            } else {
                try {
                    sSLContext.init(null, C08960c3.A00, null);
                    sSLSocketFactory = sSLContext.getSocketFactory();
                } catch (KeyManagementException e3) {
                    Log.e(e3);
                    throw new RuntimeException(e3);
                }
            }
            this.A00 = sSLSocketFactory;
        }
        return sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return A01().createSocket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = A01().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = A01().createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = A01().createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, inetAddress.getHostName());
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = A01().createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, inetAddress.getHostName());
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = A01().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return A01().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return A01().getSupportedCipherSuites();
    }
}
