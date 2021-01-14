package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.25l  reason: invalid class name and case insensitive filesystem */
public final class C455925l extends AbstractC34411iR {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    public C455925l(Context context) {
        super(false);
        this.A05 = context.getResources();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A02;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r8) {
        try {
            Uri uri = r8.A05;
            this.A02 = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    int parseInt = Integer.parseInt(this.A02.getLastPathSegment());
                    A01();
                    AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                    this.A01 = openRawResourceFd;
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    InputStream inputStream = this.A03;
                    long j = r8.A04;
                    if (inputStream.skip(j) >= j) {
                        long j2 = r8.A03;
                        long j3 = -1;
                        if (j2 != -1) {
                            this.A00 = j2;
                        } else {
                            long length = this.A01.getLength();
                            if (length != -1) {
                                j3 = length - j;
                            }
                            this.A00 = j3;
                        }
                        this.A04 = true;
                        A03(r8);
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new AnonymousClass15T("Resource identifier must be an integer.");
                }
            } else {
                throw new AnonymousClass15T("URI must use scheme rawresource");
            }
        } catch (IOException e) {
            throw new AnonymousClass15T(e);
        }
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A02 = null;
        try {
            InputStream inputStream = this.A03;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A03 = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.A01;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    A00();
                }
            } catch (IOException e) {
                throw new AnonymousClass15T(e);
            } catch (Throwable th) {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    A00();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new AnonymousClass15T(e2);
        } catch (Throwable th2) {
            this.A03 = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.A01;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    A00();
                }
                throw th2;
            } catch (IOException e3) {
                throw new AnonymousClass15T(e3);
            } catch (Throwable th3) {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    A00();
                }
                throw th3;
            }
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
                throw new AnonymousClass15T(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
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
            throw new AnonymousClass15T(new EOFException());
        }
    }
}
