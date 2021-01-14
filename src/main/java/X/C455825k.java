package X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.25k  reason: invalid class name and case insensitive filesystem */
public final class C455825k extends AbstractC34411iR {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C455825k() {
        super(false);
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A01;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r8) {
        try {
            Uri uri = r8.A05;
            this.A01 = uri;
            A01();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j = r8.A04;
            randomAccessFile.seek(j);
            long j2 = r8.A03;
            if (j2 == -1) {
                j2 = this.A02.length() - j;
            }
            this.A00 = j2;
            if (j2 >= 0) {
                this.A03 = true;
                A03(r8);
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new AnonymousClass15I(e);
        }
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e) {
            throw new AnonymousClass15I(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
            throw th;
        }
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.A00 -= (long) read;
                A02(read);
            }
            return read;
        } catch (IOException e) {
            throw new AnonymousClass15I(e);
        }
    }
}
