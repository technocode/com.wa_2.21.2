package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2e0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC53892e0 implements AbstractC48882Od {
    public AnonymousClass0M3 A00;
    public final long A01;
    public final long A02;
    public final Uri A03;
    public final File A04;

    public AbstractC53892e0(Uri uri, long j) {
        this.A04 = null;
        this.A03 = uri;
        this.A01 = 0;
        this.A02 = j;
    }

    public AbstractC53892e0(File file, long j) {
        this.A04 = file;
        this.A03 = Uri.fromFile(file);
        this.A01 = file.length();
        this.A02 = j;
    }

    @Override // X.AbstractC48882Od
    public final Uri A4W() {
        return this.A03;
    }

    @Override // X.AbstractC48882Od
    public String A5w() {
        File file = this.A04;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @Override // X.AbstractC48882Od
    public final long A5y() {
        return this.A02;
    }

    @Override // X.AbstractC48882Od
    public final long getContentLength() {
        return this.A01;
    }
}
