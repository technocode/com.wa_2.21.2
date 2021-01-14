package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.25i  reason: invalid class name and case insensitive filesystem */
public class C455625i extends AbstractC34411iR implements AbstractC34481iY {
    public static final AtomicReference A0D = new AtomicReference();
    public static final Pattern A0E = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public AnonymousClass15G A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass15K A0A;
    public final AnonymousClass15K A0B;
    public final String A0C;

    public C455625i(String str, AnonymousClass15K r4) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.A0C = str;
            this.A0B = new AnonymousClass15K();
            this.A08 = 8000;
            this.A09 = 8000;
            this.A0A = r4;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A04() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A06 = null;
        }
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ec  */
    @Override // X.AnonymousClass15E
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long ALs(X.AnonymousClass15G r24) {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455625i.ALs(X.15G):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)|7|(5:12|13|(2:15|(1:17))(2:18|(1:20))|21|(1:25))(1:11)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        throw new X.AnonymousClass15J(r3, r9.A04, 3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0065 */
    @Override // X.AnonymousClass15E
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455625i.close():void");
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        try {
            if (this.A01 != this.A03) {
                AtomicReference atomicReference = A0D;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.A01;
                    long j2 = this.A03;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.A05.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.A01 += (long) read;
                        A02(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.A02;
            if (j3 != -1) {
                long j4 = j3 - this.A00;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j4);
            }
            int read2 = this.A05.read(bArr, i, i2);
            if (read2 != -1) {
                this.A00 += (long) read2;
                A02(read2);
                return read2;
            } else if (this.A02 == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new AnonymousClass15J(e, this.A04, 2);
        }
    }
}
