package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Th  reason: invalid class name and case insensitive filesystem */
public class C28201Th implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46952Fw();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public C28201Th(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00E.A03(readString);
        this.A00 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00E.A03(readString2);
        this.A01 = readString2;
    }

    public C28201Th(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28201Th)) {
            return false;
        }
        C28201Th r4 = (C28201Th) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("BizCategory:{'id'='");
        A0S.append(this.A00);
        A0S.append("', 'name'='");
        return AnonymousClass008.A0O(A0S, this.A01, "'}");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
