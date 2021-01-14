package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.0up  reason: invalid class name and case insensitive filesystem */
public class C19320up extends FilterOutputStream {
    public final /* synthetic */ C19330uq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19320up(C19330uq r1, OutputStream outputStream) {
        super(outputStream);
        this.A00 = r1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }
}
