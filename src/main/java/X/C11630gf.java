package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.0gf  reason: invalid class name and case insensitive filesystem */
public class C11630gf extends FilterOutputStream {
    public C11630gf(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i2 < 16777216) {
            ((FilterOutputStream) this).out.write(C05360Of.A05(i2));
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            ((FilterOutputStream) this).out.flush();
            return;
        }
        throw new C64132xg(AnonymousClass008.A0F("data too large to write; length=", i2));
    }
}
