package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.2Dg  reason: invalid class name */
public class AnonymousClass2Dg extends FilterOutputStream {
    public final /* synthetic */ C46562Dh A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Dg(C46562Dh r1, OutputStream outputStream) {
        super(outputStream);
        this.A00 = r1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.A00.A00 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.A00.A00 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.A00.A00 = true;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A00.A00 = true;
        }
    }
}
