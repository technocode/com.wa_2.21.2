package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.25g  reason: invalid class name and case insensitive filesystem */
public final class C455425g extends AbstractC34411iR {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C455425g(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A02;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r10) {
        try {
            Uri uri = r10.A05;
            this.A02 = uri;
            A01();
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, "r");
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.A03 = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                FileInputStream fileInputStream = this.A03;
                long j = r10.A04;
                long skip = fileInputStream.skip(j + startOffset) - startOffset;
                if (skip == j) {
                    long j2 = r10.A03;
                    long j3 = -1;
                    if (j2 != -1) {
                        this.A00 = j2;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j3 = size - channel.position();
                            }
                            this.A00 = j3;
                        } else {
                            this.A00 = length - skip;
                        }
                    }
                    this.A04 = true;
                    A03(r10);
                    return this.A00;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open file descriptor for: ");
            sb.append(this.A02);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new AnonymousClass15C(e);
        }
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A02 = null;
        try {
            FileInputStream fileInputStream = this.A03;
            if (fileInputStream != null) {
                fileInputStream.close();
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
                throw new AnonymousClass15C(e);
            } catch (Throwable th) {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    A00();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new AnonymousClass15C(e2);
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
                throw new AnonymousClass15C(e3);
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
                throw new AnonymousClass15C(e);
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
            throw new AnonymousClass15C(new EOFException());
        }
    }
}
