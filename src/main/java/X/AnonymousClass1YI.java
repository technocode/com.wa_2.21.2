package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1YI  reason: invalid class name */
public class AnonymousClass1YI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass36Y();
    public final long A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1YI(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A02 = readString2;
                this.A00 = parcel.readLong();
                return;
            }
            throw null;
        }
        throw null;
    }

    public AnonymousClass1YI(String str, String str2, long j) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }
}
