package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ky  reason: invalid class name and case insensitive filesystem */
public final class C35811ky extends AnonymousClass066 {
    public static final List A07 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new AnonymousClass1AS();
    public LocationRequest A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public C35811ky(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.A00 = locationRequest;
        this.A03 = list;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C35811ky)) {
            return false;
        }
        C35811ky r4 = (C35811ky) obj;
        return AnonymousClass05S.A0H(this.A00, r4.A00) && AnonymousClass05S.A0H(this.A03, r4.A03) && AnonymousClass05S.A0H(this.A02, r4.A02) && this.A04 == r4.A04 && this.A05 == r4.A05 && this.A06 == r4.A06 && AnonymousClass05S.A0H(this.A01, r4.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        String str = this.A02;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            sb.append(" moduleId=");
            sb.append(str2);
        }
        sb.append(" hideAppOps=");
        sb.append(this.A04);
        sb.append(" clients=");
        sb.append(this.A03);
        sb.append(" forceCoarseLocation=");
        sb.append(this.A05);
        if (this.A06) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 1, this.A00, i, false);
        C008805h.A12(parcel, 5, this.A03, false);
        C008805h.A10(parcel, 6, this.A02, false);
        C008805h.A13(parcel, 7, this.A04);
        C008805h.A13(parcel, 8, this.A05);
        C008805h.A13(parcel, 9, this.A06);
        C008805h.A10(parcel, 10, this.A01, false);
        C008805h.A0r(parcel, A032);
    }
}
