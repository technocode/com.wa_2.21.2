package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.2VO  reason: invalid class name */
public class AnonymousClass2VO extends OutputStream {
    public boolean A00 = false;
    public final AnonymousClass2VQ A01;

    public AnonymousClass2VO(AnonymousClass2VQ r2) {
        this.A01 = r2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00 = true;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.A00) {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
            return;
        }
        throw new IOException("Stream is closed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw new IOException("Stream is closed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        List list;
        if (!this.A00) {
            C58602mC r8 = (C58602mC) this.A01;
            if (r8 != null) {
                try {
                    AnonymousClass2VR r6 = new AnonymousClass2VR(bArr, i, i2);
                    if (r8.A0F && !r8.A0E) {
                        C58382lp r10 = r8.A05;
                        if (!(!r10.A0Y || r10.A0R == null || (list = r10.A0S) == null)) {
                            r10.A0Z = true;
                            long j = (long) i2;
                            long j2 = r10.A0C.A03.maxEarlyDataSize;
                            if (r10.A04 + j > j2) {
                                r10.A04 = j2;
                                long j3 = r10.A05 + j;
                                long j4 = r10.A06;
                                if (j3 <= j4) {
                                    r10.A05 = j3;
                                    list.add(r6);
                                    return;
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("Client request exceeded the max spillover limit ");
                                sb.append(j3);
                                sb.append(" > ");
                                sb.append(j4);
                                throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
                            }
                            r8.A09.A00(new C58472ly(r6));
                            r8.A05.A0R.add(r6);
                            r8.A05.A04 += j;
                            return;
                        }
                    }
                    r8.A09.A00(new C58412ls(r6));
                } catch (C29001Wo e) {
                    r8.A04((byte) 2, e.description, e.errorTransient, e.ex);
                } catch (Exception e2) {
                    e = e2;
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    r8.A04((byte) 2, (byte) 80, false, new SSLException(e));
                }
            } else {
                throw null;
            }
        } else {
            throw new IOException("Stream is closed.");
        }
    }
}
