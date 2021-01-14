package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.0Pw  reason: invalid class name and case insensitive filesystem */
public class C05740Pw {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public final AnonymousClass03M A03 = new AnonymousClass03M();
    public final C05650Pn A04;
    public final C05630Pl A05;
    public final AnonymousClass03K A06;

    public C05740Pw(RandomAccessFile randomAccessFile, int i, C05630Pl r7, int i2, AnonymousClass03K r9) {
        if (i2 == 0) {
            this.A04 = new C05650Pn(randomAccessFile, (i * 65536) + 65536, 65536);
        } else if (i2 == 1) {
            this.A04 = new C05650Pn(randomAccessFile, (i << 14) + 65536, 16384);
        } else {
            this.A04 = new C05650Pn(randomAccessFile, (i * 32768) + 65536, 32768);
        }
        this.A01 = i;
        this.A05 = r7;
        this.A06 = r9;
    }

    public void A00() {
        C05650Pn r4 = this.A04;
        r4.A05.clear();
        r4.A01 = 0;
        r4.A06.reset();
        r4.A00 = 0;
        C05640Pm r3 = this.A05.A05[this.A01];
        r3.A01 = r4.A01;
        r3.A04 = 0;
        r3.A02 = 1;
        r3.A00 = 0;
        r3.A03 = r4.A00();
        this.A02 = 0;
        this.A00 = 0;
        this.A03.A00.clear();
    }

    public void A01() {
        try {
            C05650Pn r3 = this.A04;
            r3.A01();
            C05640Pm r2 = this.A05.A05[this.A01];
            r2.A01 = r3.A01;
            r2.A03 = r3.A00();
        } catch (IOException e) {
            AnonymousClass03K r1 = this.A06;
            r1.A0F = Boolean.TRUE;
            r1.A07();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e);
            throw e;
        }
    }

    public void A02() {
        try {
            C05650Pn r6 = this.A04;
            C05640Pm[] r3 = this.A05.A05;
            r6.A02(r3[this.A01].A01);
            ByteBuffer byteBuffer = r6.A05;
            boolean z = false;
            if (byteBuffer.position() == r3[this.A01].A01) {
                z = true;
            }
            Log.a(z);
            boolean z2 = false;
            if (r6.A01 == r3[this.A01].A01) {
                z2 = true;
            }
            Log.a(z2);
            int i = (r6.A00() > r3[this.A01].A03 ? 1 : (r6.A00() == r3[this.A01].A03 ? 0 : -1));
            boolean A032 = A03();
            if (i != 0) {
                if (A032) {
                    this.A06.A01 = Boolean.TRUE;
                } else {
                    this.A06.A06 = Boolean.TRUE;
                }
                throw new AnonymousClass2OE(this, "Invalid checksum");
            } else if (A032) {
                this.A02 = 0;
                this.A00 = 0;
                AnonymousClass03M r4 = this.A03;
                r4.A00.clear();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                asReadOnlyBuffer.flip();
                if (asReadOnlyBuffer.limit() != 0) {
                    byte[][] bArr = C05750Px.A00;
                    int length = bArr.length;
                    int i2 = length - 1;
                    byte[] bArr2 = new byte[C05750Px.A00(i2).length];
                    try {
                        asReadOnlyBuffer.get(bArr2);
                        for (int i3 = 0; i3 < length; i3++) {
                            if (Arrays.equals(bArr2, bArr[i3])) {
                                if (i3 < 0 || i3 > i2) {
                                    throw new AnonymousClass2OE(this, "Invalid event buffer header");
                                } else {
                                    if (i3 >= 1) {
                                        asReadOnlyBuffer.get(A05(i3));
                                    }
                                    while (asReadOnlyBuffer.position() < asReadOnlyBuffer.limit()) {
                                        try {
                                            try {
                                                AnonymousClass0Q2 A033 = C05760Py.A03(asReadOnlyBuffer);
                                                this.A02++;
                                                int i4 = A033.A01;
                                                if (i4 == 1) {
                                                    this.A00++;
                                                }
                                                if (i4 == 0) {
                                                    r4.A01(A033.A00, A033.A02);
                                                }
                                            } catch (BufferUnderflowException unused) {
                                                throw new AnonymousClass2OG("Incomplete buffer");
                                            }
                                        } catch (AnonymousClass2OG e) {
                                            throw new AnonymousClass2OE(this, e.toString());
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder("Invalid value: ");
                        sb.append(bArr2);
                        throw new RuntimeException(sb.toString());
                    } catch (BufferUnderflowException unused2) {
                        throw new AnonymousClass2OE(this, "Event buffer does not have a header");
                    }
                }
            }
        } catch (IOException e2) {
            throw new AnonymousClass2OE(this, e2.toString());
        }
    }

    public boolean A03() {
        return this.A01 == this.A05.A01;
    }

    public final boolean A04() {
        return this.A04.A05.position() == 0;
    }

    public byte[] A05(int i) {
        if (i == 1) {
            C05640Pm r1 = this.A05.A05[this.A01];
            int i2 = r1.A00;
            return new byte[]{(byte) r1.A02, (byte) i2, (byte) (i2 >> 8)};
        }
        C05640Pm r2 = this.A05.A05[this.A01];
        int i3 = r2.A00;
        return new byte[]{(byte) r2.A02, (byte) i3, (byte) (i3 >> 8), (byte) r2.A05};
    }
}
