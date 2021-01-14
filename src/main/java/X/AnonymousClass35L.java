package X;

import java.io.OutputStream;

/* renamed from: X.35L  reason: invalid class name */
public class AnonymousClass35L extends OutputStream {
    public long A00;
    public final int A01;
    public final OutputStream A02;

    public AnonymousClass35L(OutputStream outputStream, int i) {
        this.A02 = outputStream;
        this.A01 = i;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.A00 < ((long) this.A01)) {
            this.A02.write(i);
            this.A00++;
        }
    }
}
