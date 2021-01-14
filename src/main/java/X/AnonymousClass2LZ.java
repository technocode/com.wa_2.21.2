package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2LZ  reason: invalid class name */
public class AnonymousClass2LZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LY();
    public String A00;
    public boolean A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2LZ() {
        this.A00 = "";
        this.A01 = true;
    }

    public AnonymousClass2LZ(Parcel parcel) {
        this.A00 = "";
        boolean z = true;
        this.A01 = true;
        this.A00 = parcel.readString();
        this.A01 = parcel.readByte() == 0 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }
}
