package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.2mC  reason: invalid class name and case insensitive filesystem */
public class C58602mC extends SSLSocket implements AnonymousClass2VQ {
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass2VN A03;
    public AnonymousClass2VO A04;
    public C58382lp A05;
    public AbstractC50662Vo A06;
    public C29011Wq A07;
    public C29011Wq A08;
    public C50692Vr A09;
    public InputStream A0A;
    public OutputStream A0B;
    public String A0C;
    public Set A0D = new HashSet();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;

    public boolean getEnableSessionCreation() {
        return true;
    }

    public String[] getEnabledProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public String[] getSupportedProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public boolean getUseClientMode() {
        return true;
    }

    public void setEnableSessionCreation(boolean z) {
    }

    public void setUseClientMode(boolean z) {
    }

    public C58602mC() {
    }

    public C58602mC(AbstractC50662Vo r2) {
        this.A06 = r2;
        this.A0C = null;
        this.A00 = -1;
        A02();
    }

    public C58602mC(String str, int i, AbstractC50662Vo r4) {
        super(str, i);
        this.A06 = r4;
        this.A0C = str;
        this.A00 = i;
        A02();
    }

    public C58602mC(String str, int i, InetAddress inetAddress, int i2, AbstractC50662Vo r6) {
        super(str, i, inetAddress, i2);
        this.A06 = r6;
        this.A0C = str;
        this.A00 = i;
        A02();
    }

    public C58602mC(InetAddress inetAddress, int i, AbstractC50662Vo r4) {
        super(inetAddress, i);
        this.A06 = r4;
        this.A0C = null;
        this.A00 = i;
        A02();
    }

    public C58602mC(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, AbstractC50662Vo r6) {
        super(inetAddress, i, inetAddress2, i2);
        this.A06 = r6;
        this.A0C = inetAddress.getHostName();
        this.A00 = i;
        A02();
    }

    public final String A00() {
        StringBuilder A0S = AnonymousClass008.A0S("host=");
        C58382lp r2 = this.A05;
        A0S.append(r2.A0Q);
        A0S.append(" hrr=");
        A0S.append(r2.A0c);
        A0S.append(" r=");
        A0S.append(r2.A0g);
        A0S.append(" ed=");
        A0S.append(r2.A0Z);
        A0S.append(" eda=");
        A0S.append(r2.A0f);
        A0S.append(" s=");
        A0S.append(this.A09.A00.A00.A03);
        return A0S.toString();
    }

    public void A01() {
        AnonymousClass2VY A012;
        while (!this.A09.A00.A00.equals(C50702Vs.A08)) {
            AbstractC50672Vp r2 = this.A05.A0A;
            synchronized (r2) {
                A012 = r2.A01();
            }
            if (!(A012 instanceof C58522m3)) {
                if (!(A012 instanceof C58392lq)) {
                    this.A09.A00(A012);
                    if (A012 instanceof C58502m1) {
                        byte[] A22 = C28051Sr.A22((byte) 1, C28051Sr.A25(this.A05));
                        this.A05.A0B.A01((byte) 22, A22, 0, A22.length);
                        this.A05.A0D.A00(A22);
                    }
                } else {
                    A05(A012);
                    throw null;
                }
            }
        }
        if (!this.A05.A0b) {
            A04((byte) 2, (byte) 116, false, new SSLException("Server must either choose a PSK or send certificates."));
        }
        if (this.A05.A0f) {
            byte[] A222 = C28051Sr.A22((byte) 5, new byte[0]);
            this.A05.A0B.A01((byte) 22, A222, 0, A222.length);
            this.A05.A0D.A00(A222);
        }
        C58382lp r1 = this.A05;
        if (r1.A0d && !r1.A0e) {
            r1.A0B.A01((byte) 20, new byte[]{1}, 0, 1);
        }
        AnonymousClass2VM A002 = AnonymousClass3WK.A00();
        A002.AAY((byte[]) this.A05.A0U.get("client_hs_key"), (byte[]) this.A05.A0U.get("client_hs_iv"));
        C58382lp r22 = this.A05;
        r22.A0B = new C58372lo(r22.A0N, A002);
        if (r22.A0X) {
            byte[] A223 = C28051Sr.A22((byte) 11, new byte[4]);
            this.A05.A0B.A01((byte) 22, A223, 0, A223.length);
            this.A05.A0D.A00(A223);
        }
        C58382lp r3 = this.A05;
        if (r3 != null) {
            byte[] A224 = C28051Sr.A22((byte) 20, C28051Sr.A2A((byte[]) r3.A0U.get("client_finished"), r3.A0D.A01(), r3.A0P));
            this.A05.A0B.A01((byte) 22, A224, 0, A224.length);
            this.A09.A00(new C58432lu(A224));
            long currentTimeMillis = System.currentTimeMillis();
            this.A01 = currentTimeMillis;
            this.A0E = true;
            AnonymousClass2VU r4 = AnonymousClass2VU.INFO;
            StringBuilder A0S = AnonymousClass008.A0S("Handshake complete : session_resumed ");
            C58382lp r6 = this.A05;
            A0S.append(r6.A0g);
            A0S.append(" ");
            A0S.append("early_data_sent ");
            A0S.append(r6.A0Z);
            A0S.append(" ");
            A0S.append("early_data_accepted ");
            A0S.append(r6.A0f);
            A0S.append(" ");
            A0S.append("client_cert_requested ");
            A0S.append(r6.A0X);
            A0S.append(" ");
            A0S.append("time_ms ");
            A0S.append(currentTimeMillis - this.A02);
            AnonymousClass2VT.A00(r4, A0S.toString());
            HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A08);
            for (HandshakeCompletedListener handshakeCompletedListener : this.A0D) {
                handshakeCompletedListener.handshakeCompleted(handshakeCompletedEvent);
            }
            return;
        }
        throw new C29001Wo((byte) 80, new SSLException("Illegal argument. Context cannot be null."));
    }

    public void A02() {
        if (this.A06 != null) {
            AnonymousClass2VT.A00 = new AnonymousClass3WJ();
            if (!(this instanceof C60282p8)) {
                this.A0A = super.getInputStream();
                this.A0B = super.getOutputStream();
            } else {
                C60282p8 r2 = (C60282p8) this;
                Socket socket = r2.A00;
                r2.A0A = socket.getInputStream();
                r2.A0B = socket.getOutputStream();
            }
            this.A03 = new AnonymousClass2VN(this);
            this.A04 = new AnonymousClass2VO(this);
            C58382lp r1 = new C58382lp();
            this.A05 = r1;
            try {
                this.A09 = new C50692Vr(r1);
            } catch (C29001Wo e) {
                throw new IOException(e);
            }
        } else {
            throw null;
        }
    }

    public final synchronized void A03() {
        this.A0G = true;
        C58382lp r1 = this.A05;
        r1.A0R = null;
        r1.A0S = null;
        if (this.A0F) {
            this.A03.A00.close();
            this.A04.A00 = true;
        }
        if (!(this instanceof C60282p8)) {
            super.close();
            this.A0A.close();
            this.A0B.close();
        } else {
            C60282p8 r12 = (C60282p8) this;
            if (r12.A01) {
                r12.A00.close();
                r12.A0A.close();
                r12.A0B.close();
            }
        }
    }

    public final synchronized void A04(byte b, byte b2, boolean z, SSLException sSLException) {
        String str;
        if (z) {
            Throwable cause = sSLException.getCause();
            IOException iOException = sSLException;
            if (cause != null) {
                iOException = sSLException.getCause();
            }
            throw iOException;
        }
        if (!this.A0G) {
            AnonymousClass2VU r6 = AnonymousClass2VU.DEBUG;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending Alert : type : ");
            sb.append(b == 2 ? "FATAL" : "WARNING");
            sb.append(" description : ");
            sb.append(C28051Sr.A0m(b2));
            sb.append("(");
            sb.append((int) b2);
            sb.append(")");
            sb.append(" exception : ");
            if (sSLException == null) {
                str = "";
            } else {
                str = sSLException.toString();
            }
            sb.append(str);
            String obj = sb.toString();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AnonymousClass2VV r1 = AnonymousClass2VT.A00;
            String obj2 = stackTrace[2].toString();
            if (!(r1 instanceof AnonymousClass3WJ)) {
                PrintStream printStream = System.err;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r6);
                sb2.append(": ");
                sb2.append(obj2);
                sb2.append(" : ");
                sb2.append(obj);
                printStream.println(sb2.toString());
                if (sSLException != null) {
                    sSLException.printStackTrace(printStream);
                }
            } else {
                int ordinal = r6.ordinal();
                if (ordinal == 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj2);
                    sb3.append(" :");
                    sb3.append(obj);
                    Log.d(sb3.toString(), sSLException);
                } else if (ordinal == 2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj2);
                    sb4.append(" :");
                    sb4.append(obj);
                    Log.i(sb4.toString(), sSLException);
                } else if (ordinal == 3) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj2);
                    sb5.append(" :");
                    sb5.append(obj);
                    Log.w(sb5.toString(), sSLException);
                } else if (ordinal == 4) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(" :");
                    sb6.append(obj);
                    Log.e(sb6.toString(), sSLException);
                } else if (ordinal == 5) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj2);
                    sb7.append(" :");
                    sb7.append(obj);
                    Log.a(sb7.toString());
                }
            }
            try {
                this.A05.A0B.A01((byte) 21, new byte[]{b, b2}, 0, 2);
            } catch (Exception e) {
                AnonymousClass2VU r2 = AnonymousClass2VU.ERROR;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Encountered exception. Nothing much can be done here. ");
                sb8.append(e);
                AnonymousClass2VT.A00(r2, sb8.toString());
            }
            A03();
        }
        if (b == 2) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("WATLS Exception\n");
            sb9.append(A00());
            String obj3 = sb9.toString();
            Throwable th = sSLException;
            if (sSLException != null) {
                Throwable cause2 = sSLException.getCause();
                th = sSLException;
                if (cause2 != null) {
                    th = sSLException.getCause();
                }
            }
            throw new IOException(obj3, th);
        }
    }

    public final void A05(AnonymousClass2VY r7) {
        byte[] bArr = (byte[]) r7.A00;
        AnonymousClass2VU r4 = AnonymousClass2VU.DEBUG;
        StringBuilder A0S = AnonymousClass008.A0S("Received Alert: Level ");
        A0S.append((int) bArr[0]);
        A0S.append(" Description ");
        byte b = bArr[1];
        A0S.append(C28051Sr.A0m(b));
        A0S.append("(");
        A0S.append((int) b);
        A0S.append(")");
        AnonymousClass2VT.A00(r4, A0S.toString());
        A03();
        byte b2 = bArr[1];
        if (b2 == 0 || b2 == 50) {
            StringBuilder A0S2 = AnonymousClass008.A0S("Received alert ");
            A0S2.append((int) b2);
            throw new IOException(new SSLException(A0S2.toString()));
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("WATLS Exception\n");
        A0S3.append(A00());
        String obj = A0S3.toString();
        StringBuilder A0S4 = AnonymousClass008.A0S("Received alert ");
        A0S4.append((int) b2);
        throw new IOException(obj, new SSLException(A0S4.toString()));
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0D.add(handshakeCompletedListener);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.A0G) {
            if (this.A0F) {
                A04((byte) 1, (byte) 0, false, null);
            } else {
                A03();
            }
        }
    }

    public SocketChannel getChannel() {
        throw new AssertionError("Channels are not supported by WtSocket.");
    }

    public String[] getEnabledCipherSuites() {
        String[] strArr = new String[2];
        if (this.A06 == null) {
            throw null;
        } else if (C006703h.A00() != null) {
            strArr[0] = "TLS_AES_128_GCM_SHA256";
            strArr[1] = "use default";
            return strArr;
        } else {
            throw null;
        }
    }

    public SSLSession getHandshakeSession() {
        return this.A07;
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        AnonymousClass2VN r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw new IOException("Input stream is closed.");
    }

    public boolean getNeedClientAuth() {
        return this.A06.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        AnonymousClass2VO r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw new IOException("Output stream is closed.");
    }

    public SSLParameters getSSLParameters() {
        return this.A06;
    }

    public SSLSession getSession() {
        return this.A08;
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = new String[2];
        if (this.A06 == null) {
            throw null;
        } else if (C006703h.A00() != null) {
            strArr[0] = "TLS_AES_128_GCM_SHA256";
            strArr[1] = "use default";
            return strArr;
        } else {
            throw null;
        }
    }

    public boolean getWantClientAuth() {
        return this.A06.getWantClientAuth();
    }

    public boolean isClosed() {
        return this.A0G;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0D.remove(handshakeCompletedListener);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A06.setCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.A06.setProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.A06.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof AbstractC50662Vo) {
            this.A06 = (AbstractC50662Vo) sSLParameters;
        }
    }

    public void setWantClientAuth(boolean z) {
        this.A06.setWantClientAuth(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0110, code lost:
        if (r7 == null) goto L_0x011d;
     */
    @Override // javax.net.ssl.SSLSocket
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startHandshake() {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58602mC.startHandshake():void");
    }
}
