package X;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.0nm  reason: invalid class name and case insensitive filesystem */
public class C15270nm extends InputStream implements DataInput {
    public static final ByteOrder A04 = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder A05 = ByteOrder.LITTLE_ENDIAN;
    public int A00;
    public DataInputStream A01;
    public ByteOrder A02 = ByteOrder.BIG_ENDIAN;
    public final int A03;

    public C15270nm(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A01 = dataInputStream;
        int available = dataInputStream.available();
        this.A03 = available;
        this.A00 = 0;
        this.A01.mark(available);
    }

    public void A00(long j) {
        long j2 = (long) this.A00;
        if (j2 > j) {
            this.A00 = 0;
            this.A01.reset();
            this.A01.mark(this.A03);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A01.available();
    }

    @Override // java.io.InputStream
    public int read() {
        this.A00++;
        return this.A01.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        this.A00 += read;
        return read;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.A00++;
        return this.A01.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.A00 += 2;
        return this.A01.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        int i = this.A00;
        int length = bArr.length;
        int i2 = i + length;
        this.A00 = i2;
        if (i2 > this.A03) {
            throw new EOFException();
        } else if (this.A01.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.A00 + i2;
        this.A00 = i3;
        if (i3 > this.A03) {
            throw new EOFException();
        } else if (this.A01.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() {
        int i = this.A00 + 4;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            int read2 = this.A01.read();
            int read3 = this.A01.read();
            int read4 = this.A01.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == A04) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder A0S = AnonymousClass008.A0S("Invalid byte order: ");
                A0S.append(byteOrder);
                throw new IOException(A0S.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public long readLong() {
        int i = this.A00 + 8;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            int read2 = this.A01.read();
            int read3 = this.A01.read();
            int read4 = this.A01.read();
            int read5 = this.A01.read();
            int read6 = this.A01.read();
            int read7 = this.A01.read();
            int read8 = this.A01.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                if (byteOrder == A04) {
                    return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                StringBuilder A0S = AnonymousClass008.A0S("Invalid byte order: ");
                A0S.append(byteOrder);
                throw new IOException(A0S.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() {
        int i = this.A00 + 2;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            int read2 = this.A01.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == A04) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder A0S = AnonymousClass008.A0S("Invalid byte order: ");
                A0S.append(byteOrder);
                throw new IOException(A0S.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.A00 += 2;
        return this.A01.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.A00++;
        return this.A01.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        int i = this.A00 + 2;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            int read2 = this.A01.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == A04) {
                    return (read << 8) + read2;
                }
                StringBuilder A0S = AnonymousClass008.A0S("Invalid byte order: ");
                A0S.append(byteOrder);
                throw new IOException(A0S.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        int min = Math.min(i, this.A03 - this.A00);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.A01.skipBytes(min - i2);
        }
        this.A00 += i2;
        return i2;
    }
}
