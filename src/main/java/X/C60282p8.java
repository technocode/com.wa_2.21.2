package X;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* renamed from: X.2p8  reason: invalid class name and case insensitive filesystem */
public class C60282p8 extends C58602mC {
    public final Socket A00;
    public final boolean A01;

    public C60282p8(Socket socket, String str, int i, boolean z, AbstractC50662Vo r7) {
        if (socket.isConnected()) {
            this.A00 = socket;
            this.A06 = r7;
            this.A01 = z;
            this.A0C = str;
            super.A00 = i;
            A02();
            return;
        }
        throw new SocketException("Socket is not connected.");
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        throw new IOException("Underlying tls13 is already connected.");
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        throw new IOException("Underlying tls13 is already connected.");
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        throw new IOException("Underlying tls13 is already connected.");
    }

    public InetAddress getInetAddress() {
        return this.A00.getInetAddress();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return this.A00.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A00.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A00.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A00.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return this.A00.getOOBInline();
    }

    public int getPort() {
        return this.A00.getPort();
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() {
        return this.A00.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A00.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return this.A00.getReuseAddress();
    }

    @Override // java.net.Socket
    public int getSendBufferSize() {
        return this.A00.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return this.A00.getSoLinger();
    }

    @Override // java.net.Socket
    public int getSoTimeout() {
        return this.A00.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return this.A00.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return this.A00.getTrafficClass();
    }

    public boolean isBound() {
        return this.A00.isBound();
    }

    @Override // X.C58602mC
    public boolean isClosed() {
        return this.A00.isClosed();
    }

    public boolean isConnected() {
        return this.A00.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A00.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A00.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
        this.A00.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i) {
        this.A00.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
        this.A00.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i) {
        this.A00.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
        this.A00.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) {
        this.A00.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
        this.A00.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
        this.A00.setTrafficClass(i);
    }
}
