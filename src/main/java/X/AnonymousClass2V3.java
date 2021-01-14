package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2V3  reason: invalid class name */
public final class AnonymousClass2V3 extends FilterInputStream {
    public int A00;
    public boolean A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return 0;
    }

    public boolean markSupported() {
        return false;
    }

    public AnonymousClass2V3(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException("in may not be null");
        }
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        byte[] array = allocate.array();
        while (true) {
            int read = super.read();
            if (read == -1) {
                return -1;
            }
            if (this.A01) {
                int i = this.A00;
                if (i > 0) {
                    this.A00 = i - 1;
                    return read;
                } else if (allocate.remaining() != 0) {
                    allocate.put((byte) read);
                    if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                        if (allocate.position() > 2) {
                            String str = new String(array, 0, allocate.position() - 2, "UTF-8");
                            try {
                                int parseInt = Integer.parseInt(str, 16);
                                this.A00 = parseInt;
                                if (parseInt == 0) {
                                    if (super.read() == -1) {
                                        throw new IOException("stream ended early during parse final chunk");
                                    } else if (super.read() != -1) {
                                        return -1;
                                    } else {
                                        throw new IOException("stream ended early during parse final chunk");
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                throw new IOException(AnonymousClass008.A0L("chunk length ", str, " failed to parse"));
                            }
                        }
                        allocate.clear();
                    }
                } else {
                    throw new IOException("corrupt pseudo http input [max chunk header length exceeded]");
                }
            } else if (allocate.remaining() != 0) {
                allocate.put((byte) read);
                if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                    if (allocate.position() == 2) {
                        this.A01 = true;
                    } else {
                        String[] split = new String(array, 0, allocate.position() - 2, "UTF-8").split(":", 2);
                        if (split.length == 2) {
                            String trim = split[0].trim();
                            String trim2 = split[1].trim();
                            if (trim.equalsIgnoreCase("Transfer-Encoding") && !trim2.equalsIgnoreCase("chunked")) {
                                throw new IOException(AnonymousClass008.A0K("Unexpect transfer encoding encountered: ", trim2));
                            }
                        }
                    }
                    allocate.clear();
                }
            } else {
                throw new IOException("corrupt pseudo http input [max http header length exceeded]");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read != -1) {
                bArr[i + i3] = (byte) read;
            } else if (i3 <= 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        for (long j2 = 0; j2 < j; j2++) {
            if (read() == -1) {
                return j2;
            }
        }
        return j;
    }
}
