package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: X.2V4  reason: invalid class name */
public final class AnonymousClass2V4 extends FilterOutputStream {
    public boolean A00;
    public final ByteBuffer A01;

    public AnonymousClass2V4(OutputStream outputStream) {
        super(outputStream);
        if (outputStream != null) {
            this.A01 = ByteBuffer.allocate(8192);
            return;
        }
        throw new NullPointerException("out may not be null");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public synchronized void close() {
        Throwable th;
        try {
            flush();
            ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes("UTF-8"));
            th = null;
        } catch (UnsupportedCharsetException e) {
            throw new Error(e);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            super.close();
            if (th != null) {
                Thread.currentThread().stop(th);
            }
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public synchronized void flush() {
        if (!this.A00) {
            ((FilterOutputStream) this).out.write("POST /chat HTTP/1.1\r\nHost: c.whatsapp.net\r\nUser-Agent: Mozilla/5.0 (compatible; WAChat/1.2; +http://www.whatsapp.com/contact)\r\nTransfer-Encoding: chunked\r\n\r\n".getBytes("UTF-8"));
            this.A00 = true;
        }
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer.position() > 0) {
            ((FilterOutputStream) this).out.write(Integer.toHexString(byteBuffer.position()).getBytes("UTF-8"));
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, byteBuffer.position());
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            byteBuffer.clear();
        }
        super.flush();
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public synchronized void write(int i) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            flush();
        }
        byteBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            ByteBuffer byteBuffer = this.A01;
            if (i2 > byteBuffer.remaining()) {
                int remaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, remaining);
                flush();
                i += remaining;
                i2 -= remaining;
            } else {
                byteBuffer.put(bArr, i, i2);
            }
        }
    }
}
