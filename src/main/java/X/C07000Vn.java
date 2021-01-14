package X;

import android.net.Uri;

/* renamed from: X.0Vn  reason: invalid class name and case insensitive filesystem */
public final class C07000Vn {
    public final Uri A00;
    public final boolean A01;

    public C07000Vn(Uri uri, boolean z) {
        this.A00 = uri;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C07000Vn.class != obj.getClass()) {
            return false;
        }
        C07000Vn r5 = (C07000Vn) obj;
        if (this.A01 != r5.A01 || !this.A00.equals(r5.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + (this.A01 ? 1 : 0);
    }
}
