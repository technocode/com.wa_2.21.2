package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1SL  reason: invalid class name */
public class AnonymousClass1SL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1SK();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1SL(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public AnonymousClass1SL(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
