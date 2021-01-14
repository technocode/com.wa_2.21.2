package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.25f  reason: invalid class name and case insensitive filesystem */
public final class C455325f extends AbstractC34411iR {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public C455325f(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A01;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r9) {
        try {
            Uri uri = r9.A05;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A01();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = r9.A04;
            if (open.skip(j) >= j) {
                long j2 = r9.A03;
                if (j2 != -1) {
                    this.A00 = j2;
                } else {
                    long available = (long) this.A02.available();
                    this.A00 = available;
                    if (available == 2147483647L) {
                        this.A00 = -1;
                    }
                }
                this.A03 = true;
                A03(r9);
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new AnonymousClass159(e);
        }
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A01 = null;
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e) {
            throw new AnonymousClass159(e);
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
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AnonymousClass159(e);
            }
        }
        int read = this.A02.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.A00;
            if (j2 != -1) {
                this.A00 = j2 - ((long) read);
            }
            A02(read);
            return read;
        } else if (this.A00 == -1) {
            return -1;
        } else {
            throw new AnonymousClass159(new EOFException());
        }
    }
}
