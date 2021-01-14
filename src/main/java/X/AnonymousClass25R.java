package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.25R  reason: invalid class name */
public final class AnonymousClass25R extends AbstractC34101hu {
    public static final Parcelable.Creator CREATOR = new C228513k();
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass25R(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public AnonymousClass25R(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass25R.class != obj.getClass()) {
            return false;
        }
        AnonymousClass25R r5 = (AnonymousClass25R) obj;
        if (!AnonymousClass0W2.A08(this.A00, r5.A00) || !AnonymousClass0W2.A08(this.A01, r5.A01) || !AnonymousClass0W2.A08(this.A02, r5.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": domain=");
        sb.append(this.A01);
        sb.append(", description=");
        sb.append(this.A00);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
