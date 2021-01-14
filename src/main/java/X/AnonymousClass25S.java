package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.25S  reason: invalid class name */
public final class AnonymousClass25S extends AbstractC34101hu {
    public static final Parcelable.Creator CREATOR = new C228613l();
    public final String A00;
    public final String A01;

    public AnonymousClass25S(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public AnonymousClass25S(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass25S.class != obj.getClass()) {
            return false;
        }
        AnonymousClass25S r5 = (AnonymousClass25S) obj;
        if (!super.A00.equals(((AbstractC34101hu) r5).A00) || !AnonymousClass0W2.A08(this.A00, r5.A00) || !AnonymousClass0W2.A08(this.A01, r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (super.A00.hashCode() + 527) * 31;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": value=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
