package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
public class C57332k8 extends FileInputStream {
    public long A00;
    public final /* synthetic */ C56892jM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57332k8(File file, C56892jM r2) {
        super(file);
        this.A01 = r2;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        while (getChannel().size() < this.A00 + ((long) i2) && (!this.A01.A01)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
                return 0;
            }
        }
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.A00 += (long) read;
        }
        return read;
    }
}
