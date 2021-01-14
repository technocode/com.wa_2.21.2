package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* renamed from: X.0Pn  reason: invalid class name and case insensitive filesystem */
public class C05650Pn {
    public static final long A07 = new Adler32().getValue();
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass03K A03 = AnonymousClass03K.A02();
    public final RandomAccessFile A04;
    public final ByteBuffer A05;
    public final Checksum A06;

    public C05650Pn(RandomAccessFile randomAccessFile, int i, int i2) {
        this.A04 = randomAccessFile;
        this.A02 = i;
        this.A01 = 0;
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        this.A05 = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A06 = new Adler32();
        this.A00 = 0;
    }

    public final long A00() {
        Checksum checksum = this.A06;
        ByteBuffer byteBuffer = this.A05;
        checksum.update(byteBuffer.array(), this.A00, byteBuffer.position() - this.A00);
        this.A00 = byteBuffer.position();
        return checksum.getValue();
    }

    public void A01() {
        ByteBuffer byteBuffer;
        int i;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null && (byteBuffer = this.A05).position() != (i = this.A01)) {
            try {
                randomAccessFile.seek((long) (this.A02 + i));
                try {
                    randomAccessFile.write(byteBuffer.array(), this.A01, byteBuffer.position() - this.A01);
                    this.A01 = byteBuffer.position();
                } catch (IOException e) {
                    AnonymousClass03K r1 = this.A03;
                    r1.A0G = Boolean.TRUE;
                    r1.A07();
                    throw e;
                }
            } catch (IOException e2) {
                AnonymousClass03K r12 = this.A03;
                r12.A09 = Boolean.TRUE;
                r12.A07();
                throw e2;
            }
        }
    }

    public void A02(int i) {
        long j = (long) this.A02;
        try {
            RandomAccessFile randomAccessFile = this.A04;
            randomAccessFile.seek(j);
            try {
                ByteBuffer byteBuffer = this.A05;
                randomAccessFile.readFully(byteBuffer.array(), 0, i);
                byteBuffer.position(i);
                this.A01 = i;
                this.A06.reset();
                this.A00 = 0;
            } catch (EOFException e) {
                AnonymousClass03K r1 = this.A03;
                r1.A04 = Boolean.TRUE;
                r1.A07();
                throw e;
            } catch (IOException e2) {
                AnonymousClass03K r12 = this.A03;
                r12.A0D = Boolean.TRUE;
                r12.A07();
                throw e2;
            }
        } catch (IOException e3) {
            AnonymousClass03K r13 = this.A03;
            r13.A09 = Boolean.TRUE;
            r13.A07();
            throw e3;
        }
    }

    public final void A03(long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("Value is not an unsigned integer");
        }
        this.A05.putInt((int) j);
    }
}
