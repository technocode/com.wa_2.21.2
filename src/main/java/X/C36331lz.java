package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.1lz  reason: invalid class name and case insensitive filesystem */
public final class C36331lz extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CA();
    public final String A00;
    public final List A01;

    public C36331lz(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        C001801b.A1Q(str);
        C001801b.A1Q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36331lz.class != obj.getClass()) {
            return false;
        }
        C36331lz r5 = (C36331lz) obj;
        String str = this.A00;
        if (str != null) {
            if (!str.equals(r5.A00)) {
                return false;
            }
        } else if (r5.A00 != null) {
            return false;
        }
        List list = this.A01;
        List list2 = r5.A01;
        if (list != null) {
            if (!list.equals(list2)) {
                return false;
            }
        } else if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        List list = this.A01;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 18);
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A00, false);
        C008805h.A12(parcel, 3, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
