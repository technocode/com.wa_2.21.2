package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1iy  reason: invalid class name and case insensitive filesystem */
public class C34671iy extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C240718v();
    public final int A00;
    public final long A01;
    public final String A02;

    public C34671iy(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public long A00() {
        long j = this.A01;
        return j == -1 ? (long) this.A00 : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C34671iy) {
            C34671iy r7 = (C34671iy) obj;
            String str = this.A02;
            if (((str == null || !str.equals(r7.A02)) && (str != null || r7.A02 != null)) || A00() != r7.A00()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Long.valueOf(A00())});
    }

    public String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("name", this.A02);
        r2.A00("version", Long.valueOf(A00()));
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 1, this.A02, false);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0w(parcel, 3, A00());
        C008805h.A0r(parcel, A03);
    }
}
