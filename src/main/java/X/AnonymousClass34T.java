package X;

import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: X.34T  reason: invalid class name */
public class AnonymousClass34T extends OutputStream {
    public final /* synthetic */ RandomAccessFile A00;

    public AnonymousClass34T(RandomAccessFile randomAccessFile) {
        this.A00 = randomAccessFile;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A00.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A00.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
    }
}
