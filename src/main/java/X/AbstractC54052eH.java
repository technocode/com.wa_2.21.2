package X;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: X.2eH  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC54052eH implements AbstractC48882Od {
    public final long A00;
    public final long A01;
    public final long A02;
    public final ContentResolver A03;
    public final Uri A04;
    public final String A05;
    public final String A06;

    @Override // X.AbstractC48882Od
    public long A67() {
        return 0;
    }

    public AbstractC54052eH(AnonymousClass00G r2, long j, Uri uri, String str, String str2, long j2, long j3) {
        this.A03 = r2.A00.getContentResolver();
        this.A02 = j;
        this.A04 = uri;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // X.AbstractC48882Od
    public Uri A4W() {
        return this.A04;
    }

    @Override // X.AbstractC48882Od
    public String A5w() {
        return this.A05;
    }

    @Override // X.AbstractC48882Od
    public long A5y() {
        return this.A01;
    }

    @Override // X.AbstractC48882Od
    public String A7T() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AbstractC54052eH)) {
            return false;
        }
        return this.A04.equals(((AbstractC54052eH) obj).A04);
    }

    @Override // X.AbstractC48882Od
    public long getContentLength() {
        return this.A00;
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        return this.A04.toString();
    }
}
