package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.2Vq  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC50682Vq {
    public void A00(byte b, byte[] bArr, int i, int i2) {
        if (!(this instanceof C58592mB)) {
            C58372lo r5 = (C58372lo) this;
            if (i2 <= 16384) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                ByteBuffer allocate = ByteBuffer.allocate(copyOfRange.length + 1 + 0);
                allocate.put(copyOfRange);
                allocate.put(b);
                allocate.put(new byte[0]);
                byte[] array = allocate.array();
                ByteBuffer allocate2 = ByteBuffer.allocate(5);
                allocate2.put((byte) 23);
                allocate2.putShort(771);
                int length = array.length;
                if (r5.A01.A8b() != null) {
                    allocate2.put(C28051Sr.A24(length + 16));
                    byte[] A43 = r5.A01.A43(r5.A00, allocate2.array(), array, 0, length);
                    r5.A00++;
                    try {
                        ByteBuffer allocate3 = ByteBuffer.allocate(A43.length + 5);
                        allocate3.put(allocate2.array());
                        allocate3.put(A43);
                        r5.A02.write(allocate3.array());
                    } catch (SocketException | SocketTimeoutException e) {
                        throw new C29001Wo((byte) 80, new SSLException(e), true);
                    } catch (IOException e2) {
                        throw new C29001Wo((byte) 80, new SSLException(e2));
                    }
                } else {
                    throw null;
                }
            } else {
                throw new C29001Wo((byte) 22, new SSLException(AnonymousClass008.A0H("record size cannot exceed max length. ", i2, " > ", 16384)));
            }
        } else {
            C58592mB r1 = (C58592mB) this;
            if (i2 <= 16384) {
                try {
                    ByteBuffer allocate4 = ByteBuffer.allocate(i2 + 5);
                    allocate4.put(b);
                    if (b != 22 || r1.A01) {
                        allocate4.putShort(771);
                    } else {
                        r1.A01 = true;
                        allocate4.putShort(769);
                    }
                    allocate4.put(C28051Sr.A24(i2));
                    allocate4.put(bArr, i, i2);
                    r1.A00.write(allocate4.array());
                } catch (SocketException | SocketTimeoutException e3) {
                    throw new C29001Wo((byte) 80, new SSLException(e3), true);
                } catch (IOException e4) {
                    throw new C29001Wo((byte) 80, new SSLException(e4));
                }
            } else {
                throw new C29001Wo((byte) 22, new SSLException(AnonymousClass008.A0H("record size cannot exceed max length. ", i2, " > ", 16384)));
            }
        }
    }

    public synchronized void A01(byte b, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new C29001Wo((byte) 80, new SSLException("Data cannot be null"));
        } else if (C50622Vk.A00.contains(Byte.valueOf(b))) {
            while (i2 > 16384) {
                A00(b, bArr, i, 16384);
                i += 16384;
                i2 -= 16384;
            }
            if (i2 > 0) {
                A00(b, bArr, i, i2);
            }
        } else {
            throw new C29001Wo((byte) 80, new SSLException("Invalid content type"));
        }
    }
}
