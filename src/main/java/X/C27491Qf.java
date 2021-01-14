package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.1Qf  reason: invalid class name and case insensitive filesystem */
public class C27491Qf extends SSLSocket {
    public final int A00;
    public final AnonymousClass0CL A01;
    public final SSLSocket A02;

    public C27491Qf(SSLSocket sSLSocket, int i, AnonymousClass0CL r3) {
        this.A00 = i;
        this.A02 = sSLSocket;
        this.A01 = r3;
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A02.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.A02.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.A02.close();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        this.A02.connect(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        this.A02.connect(socketAddress, i);
    }

    public SocketChannel getChannel() {
        return this.A02.getChannel();
    }

    public boolean getEnableSessionCreation() {
        return this.A02.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.A02.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.A02.getEnabledProtocols();
    }

    public InetAddress getInetAddress() {
        return this.A02.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return new C11440gI(this.A02.getInputStream(), this.A01, this.A00);
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return this.A02.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A02.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A02.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A02.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.A02.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return this.A02.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return new C11450gJ(this.A02.getOutputStream(), this.A01, this.A00);
    }

    public int getPort() {
        return this.A02.getPort();
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        return this.A02.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A02.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return this.A02.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.A02.getSSLParameters();
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        return this.A02.getSendBufferSize();
    }

    public SSLSession getSession() {
        return this.A02.getSession();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return this.A02.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() {
        return this.A02.getSoTimeout();
    }

    public String[] getSupportedCipherSuites() {
        return this.A02.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.A02.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return this.A02.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return this.A02.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.A02.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.A02.getWantClientAuth();
    }

    public boolean isBound() {
        return this.A02.isBound();
    }

    public boolean isClosed() {
        return this.A02.isClosed();
    }

    public boolean isConnected() {
        return this.A02.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A02.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A02.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A02.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
        this.A02.sendUrgentData(i);
    }

    public void setEnableSessionCreation(boolean z) {
        this.A02.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A02.setEnabledCipherSuites(strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ("SSLv3".equals(r14[0]) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEnabledProtocols(java.lang.String[] r14) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27491Qf.setEnabledProtocols(java.lang.String[]):void");
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
        this.A02.setKeepAlive(z);
    }

    public void setNeedClientAuth(boolean z) {
        this.A02.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
        this.A02.setOOBInline(z);
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
        this.A02.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        this.A02.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
        this.A02.setReuseAddress(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.A02.setSSLParameters(sSLParameters);
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        this.A02.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
        this.A02.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) {
        this.A02.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
        this.A02.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
        this.A02.setTrafficClass(i);
    }

    public void setUseClientMode(boolean z) {
        this.A02.setUseClientMode(z);
    }

    public void setWantClientAuth(boolean z) {
        this.A02.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        this.A02.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        this.A02.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
        try {
            this.A02.startHandshake();
        } catch (SSLHandshakeException | SSLProtocolException e) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive/accounting-socket-factory/enabled suites ");
            A0S.append(Arrays.toString(getEnabledCipherSuites()));
            A0S.append(" supported suites ");
            A0S.append(Arrays.toString(getSupportedCipherSuites()));
            Log.e(A0S.toString());
            throw e;
        }
    }

    public String toString() {
        return this.A02.toString();
    }
}
