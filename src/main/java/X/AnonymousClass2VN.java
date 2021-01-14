package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2VN  reason: invalid class name */
public class AnonymousClass2VN extends InputStream {
    public C58142lR A00 = new C58142lR();
    public AnonymousClass2VQ A01;

    public AnonymousClass2VN(AnonymousClass2VQ r2) {
        this.A01 = r2;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A00.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.A00.close();
    }

    public synchronized void mark(int i) {
        C58142lR r1 = this.A00;
        synchronized (r1) {
            r1.A00();
        }
    }

    public boolean markSupported() {
        if (this.A00 != null) {
            return true;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw new IOException("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) (((short) (bArr[0] & 255)) | 0);
        } else {
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw new IOException("Buffer is null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x015d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0159 A[EDGE_INSN: B:104:0x0159->B:81:0x0159 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0162 A[ADDED_TO_REGION, EDGE_INSN: B:98:0x0162->B:85:0x0162 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2VN.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.A00.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.A00.skip(j);
    }
}
