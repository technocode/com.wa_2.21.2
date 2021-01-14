package X;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0Po  reason: invalid class name and case insensitive filesystem */
public final class C05660Po {
    public int A00;
    public int A01 = 65536;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C05650Pn A07;
    public final C05630Pl A08;
    public final AnonymousClass03K A09;

    public C05660Po(RandomAccessFile randomAccessFile, C05630Pl r5, int i, int i2, int i3, AnonymousClass03K r9) {
        int i4 = 65536;
        this.A08 = r5;
        this.A06 = i;
        this.A05 = i2;
        this.A03 = C05620Pk.A00(i);
        this.A04 = i3;
        this.A09 = r9;
        this.A07 = new C05650Pn(randomAccessFile, 0, 65536);
        if (i3 != 0) {
            i4 = 32768;
            if (i3 == 1) {
                i4 = 16384;
            }
        }
        this.A00 = i4;
    }

    public static int A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer.getInt();
    }

    public static long A01(ByteBuffer byteBuffer) {
        long A002 = (long) A00(byteBuffer);
        return 0 > A002 ? A002 + 4294967296L : A002;
    }

    public final void A02(int i, int i2) {
        C05640Pm r7;
        C05650Pn r3 = this.A07;
        ByteBuffer byteBuffer = r3.A05;
        byteBuffer.clear();
        r3.A01 = 0;
        r3.A06.reset();
        r3.A00 = 0;
        byteBuffer.put(C05620Pk.A00(i));
        if (i != 0) {
            byteBuffer.putInt(i2);
        }
        byteBuffer.putInt(this.A01);
        byteBuffer.putInt(this.A00);
        C05630Pl r4 = this.A08;
        byteBuffer.putInt(r4.A01);
        if (i >= 2) {
            byteBuffer.putInt(r4.A00);
            byteBuffer.put(r4.A04 ? (byte) 1 : 0);
            r3.A03(r4.A03);
            byteBuffer.putInt(r4.A02);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C05640Pm[] r1 = r4.A05;
            if (i3 < r1.length) {
                r7 = r1[i3];
            } else {
                r7 = new C05640Pm(this.A04);
            }
            byteBuffer.putInt(r7.A01);
            r3.A03(r7.A04);
            if (i >= 2) {
                byteBuffer.putInt(r7.A02);
                byteBuffer.putInt(r7.A00);
            }
            r3.A03(r7.A03);
        }
        long A002 = r3.A00();
        this.A02 = A002;
        r3.A03(A002);
    }
}
