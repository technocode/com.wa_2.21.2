package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2tm  reason: invalid class name and case insensitive filesystem */
public class C61812tm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C61802tl();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public C61812tm(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C61812tm(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
