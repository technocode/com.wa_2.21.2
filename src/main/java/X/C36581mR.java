package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mR  reason: invalid class name and case insensitive filesystem */
public final class C36581mR extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24711Cc();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C36581mR(String str, String str2, int i, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36581mR)) {
            return false;
        }
        return ((C36581mR) obj).A02.equals(this.A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A02;
        int i = this.A00;
        boolean z = this.A03;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 45);
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A10(parcel, 3, this.A01, false);
        C008805h.A0u(parcel, 4, this.A00);
        C008805h.A13(parcel, 5, this.A03);
        C008805h.A0r(parcel, A032);
    }
}
