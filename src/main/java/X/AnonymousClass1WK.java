package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1WK  reason: invalid class name */
public final class AnonymousClass1WK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2V2();
    public final AnonymousClass1XQ A00;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1WK(AnonymousClass1XQ r1) {
        this.A00 = r1;
    }

    public AnonymousClass1WK(Parcel parcel) {
        this.A00 = new AnonymousClass1XQ(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass1XQ r1 = this.A00;
        parcel.writeByteArray(r1.A01);
        parcel.writeByteArray(r1.A00);
        parcel.writeByteArray(r1.A02);
    }
}
