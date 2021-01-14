package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1XR  reason: invalid class name */
public class AnonymousClass1XR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64302xx();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1XR(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public AnonymousClass1XR(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
