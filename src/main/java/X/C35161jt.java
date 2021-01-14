package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1jt  reason: invalid class name and case insensitive filesystem */
public class C35161jt extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18M();
    public final int A00;
    public final String A01;

    public C35161jt(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C35161jt)) {
            C35161jt r5 = (C35161jt) obj;
            return r5.A00 == this.A00 && AnonymousClass05S.A0H(r5.A01, this.A01);
        }
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
