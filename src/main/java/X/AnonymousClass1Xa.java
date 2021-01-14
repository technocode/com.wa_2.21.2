package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Xa  reason: invalid class name */
public final class AnonymousClass1Xa implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64402y8();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1Xa(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public AnonymousClass1Xa(String str) {
        if (str != null) {
            this.A01 = str;
            this.A00 = "set";
            return;
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
