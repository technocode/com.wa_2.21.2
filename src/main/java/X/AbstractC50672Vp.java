package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.2Vp  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC50672Vp {
    public final C58142lR A00;
    public final C58142lR A01;
    public final InputStream A02;

    public AbstractC50672Vp(InputStream inputStream, C58142lR r5) {
        if (inputStream == null || r5 == null) {
            throw new C29001Wo((byte) 80, new SSLException("transportIn or recordStream is null"));
        }
        this.A02 = inputStream;
        this.A00 = new C58142lR();
        this.A01 = r5;
    }

    public AnonymousClass2VY A00() {
        try {
            boolean z = false;
            if (this.A00.available() > 0) {
                z = true;
            }
            if (!z) {
                return null;
            }
            C58142lR r6 = this.A00;
            r6.A00();
            byte[] bArr = new byte[4];
            if (r6.read(bArr) < 4) {
                r6.reset();
                return new C58522m3();
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A0E = C28051Sr.A0E(bArr2);
            if (r6.available() < A0E) {
                r6.reset();
                return new C58522m3();
            }
            r6.reset();
            int i = A0E + 4;
            byte[] bArr3 = new byte[i];
            if (r6.read(bArr3) == i) {
                byte b2 = (byte) b;
                if (b2 == 1) {
                    return new C58442lv(bArr3);
                }
                if (b2 != 2) {
                    if (b2 == 4) {
                        return new C58512m2(bArr3);
                    }
                    if (b2 == 8) {
                        return new C58492m0(bArr3);
                    }
                    if (b2 == 11) {
                        return new C58552m6(bArr3);
                    }
                    if (b2 == 13) {
                        return new C58422lt(bArr3);
                    }
                    if (b2 == 15) {
                        return new C58562m7(bArr3);
                    }
                    if (b2 == 20) {
                        return new C58572m8(bArr3);
                    }
                    if (b2 == 24) {
                        return new C58532m4(bArr3);
                    }
                    throw new SSLException(AnonymousClass008.A0F("Invalid handshake message type ", b2));
                } else if (i < 38 || !C28051Sr.A1y(Arrays.copyOfRange(bArr3, 6, 38), C50612Vj.A09)) {
                    return new AnonymousClass2m9(bArr3);
                } else {
                    return new C58502m1(bArr3);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not read handshake message of length ");
                sb.append(i);
                throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
            }
        } catch (IOException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }

    public AnonymousClass2VY A01() {
        if (!(this instanceof C58582mA)) {
            C58362ln r5 = (C58362ln) this;
            try {
                AnonymousClass2VY A002 = r5.A00();
                if (A002 != null && !(A002 instanceof C58522m3)) {
                    return A002;
                }
                if (r5.A02()) {
                    byte[] bArr = new byte[5];
                    C58142lR r1 = ((AbstractC50672Vp) r5).A01;
                    int read = r1.read(bArr);
                    if (read == 5) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        byte b = wrap.get();
                        wrap.getShort();
                        byte[] bArr2 = new byte[2];
                        wrap.get(bArr2);
                        int A0F = C28051Sr.A0F(bArr2);
                        if (b == 23 || b == 20) {
                            byte[] bArr3 = new byte[A0F];
                            int read2 = r1.read(bArr3);
                            if (read2 != A0F) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("read returned fewer than expected bytes ");
                                sb.append(read2);
                                sb.append(" != ");
                                sb.append(A0F);
                                throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
                            } else if (b == 20) {
                                return new C58522m3();
                            } else {
                                byte[] A3Y = r5.A01.A3Y(r5.A00, bArr, bArr3, 0, A0F);
                                r5.A00++;
                                C50712Vt r7 = new C50712Vt(A3Y);
                                byte b2 = r7.A00;
                                if (b2 == 20) {
                                    return new C58522m3();
                                }
                                switch (b2) {
                                    case 21:
                                        return new C58392lq(r7.A02);
                                    case 22:
                                        C58142lR r4 = ((AbstractC50672Vp) r5).A00;
                                        byte[] bArr4 = r7.A02;
                                        r4.A01(bArr4, bArr4.length);
                                        return r5.A00();
                                    case 23:
                                        boolean z = false;
                                        if (((AbstractC50672Vp) r5).A00.available() > 0) {
                                            z = true;
                                        }
                                        if (!z) {
                                            return new C58402lr(r7.A02);
                                        }
                                        throw new C29001Wo((byte) 10, new SSLException("App data and handshake messages cannot interleave"));
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Invalid content type ");
                                        sb2.append((int) b2);
                                        throw new C29001Wo((byte) 10, new SSLException(sb2.toString()));
                                }
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid content type ");
                            sb3.append((int) b);
                            throw new C29001Wo((byte) 47, new SSLException(sb3.toString()));
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("read returned fewer than expected bytes ");
                        sb4.append(read);
                        sb4.append(" != ");
                        sb4.append(5);
                        throw new C29001Wo((byte) 80, new SSLException(sb4.toString()));
                    }
                } else {
                    byte[] bArr5 = new byte[16645];
                    int read3 = r5.A02.read(bArr5);
                    if (read3 != -1) {
                        ((AbstractC50672Vp) r5).A01.A01(bArr5, read3);
                        return new C58522m3();
                    }
                    throw new C29001Wo((byte) 80, new SSLException("Transport layer is reached end of file."), true);
                }
            } catch (SocketException | SocketTimeoutException e) {
                throw new C29001Wo((byte) 80, new SSLException(e), true);
            } catch (IOException e2) {
                throw new C29001Wo((byte) 80, new SSLException(e2));
            }
        } else {
            try {
                AnonymousClass2VY A003 = A00();
                if (A003 != null && !(A003 instanceof C58522m3)) {
                    return A003;
                }
                if (A02()) {
                    byte[] bArr6 = new byte[5];
                    C58142lR r9 = this.A01;
                    int read4 = r9.read(bArr6);
                    if (read4 == 5) {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr6);
                        byte b3 = wrap2.get();
                        wrap2.getShort();
                        byte[] bArr7 = new byte[2];
                        wrap2.get(bArr7);
                        int A0F2 = C28051Sr.A0F(bArr7);
                        byte[] bArr8 = new byte[A0F2];
                        int read5 = r9.read(bArr8);
                        if (read5 != A0F2) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("read returned fewer than expected bytes ");
                            sb5.append(read5);
                            sb5.append(" != ");
                            sb5.append(A0F2);
                            throw new C29001Wo((byte) 80, new SSLException(sb5.toString()));
                        } else if (b3 == 20) {
                            return new C58522m3();
                        } else {
                            switch (b3) {
                                case 21:
                                    return new C58392lq(bArr8);
                                case 22:
                                    this.A00.A01(bArr8, A0F2);
                                    return A00();
                                case 23:
                                    boolean z2 = false;
                                    if (this.A00.available() > 0) {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        return new C58402lr(bArr8);
                                    }
                                    throw new C29001Wo((byte) 10, new SSLException("App data and handshake messages cannot interleave"));
                                default:
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Received Message with invalid type ");
                                    sb6.append((int) b3);
                                    throw new C29001Wo((byte) 10, new SSLException(sb6.toString()));
                            }
                        }
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("read returned fewer than expected bytes ");
                        sb7.append(read4);
                        sb7.append(" != ");
                        sb7.append(5);
                        throw new C29001Wo((byte) 80, new SSLException(sb7.toString()));
                    }
                } else {
                    byte[] bArr9 = new byte[16645];
                    int read6 = this.A02.read(bArr9);
                    if (read6 != -1) {
                        this.A01.A01(bArr9, read6);
                        return new C58522m3();
                    }
                    throw new C29001Wo((byte) 80, new SSLException("Transport layer is reached end of file."), true);
                }
            } catch (SocketException | SocketTimeoutException e3) {
                throw new C29001Wo((byte) 80, new SSLException(e3), true);
            } catch (IOException e4) {
                throw new C29001Wo((byte) 80, new SSLException(e4));
            }
        }
    }

    public boolean A02() {
        try {
            C58142lR r9 = this.A01;
            if (r9.available() < 5) {
                return false;
            }
            byte[] bArr = new byte[5];
            r9.A00();
            int read = r9.read(bArr);
            if (read == 5) {
                r9.reset();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                short s = wrap.getShort();
                byte[] bArr2 = new byte[2];
                wrap.get(bArr2);
                int A0F = C28051Sr.A0F(bArr2);
                if (!C50622Vk.A00.contains(Byte.valueOf(b)) || s != 771) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid record header ");
                    sb.append(C28051Sr.A1A(bArr));
                    throw new C29001Wo((byte) 10, new SSLException(sb.toString()), true);
                } else if (A0F < 0 || A0F > 16640) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid record header ");
                    sb2.append(C28051Sr.A1A(bArr));
                    throw new C29001Wo((byte) 22, new SSLException(sb2.toString()), true);
                } else if (r9.available() >= A0F + 5) {
                    return true;
                } else {
                    return false;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("read returned fewer than expected bytes ");
                sb3.append(read);
                sb3.append(" != ");
                sb3.append(5);
                throw new C29001Wo((byte) 80, new SSLException(sb3.toString()));
            }
        } catch (IOException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }
}
