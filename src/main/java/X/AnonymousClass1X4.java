package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1X4  reason: invalid class name */
public class AnonymousClass1X4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C62032u8();
    public final String A00;
    public final String[] A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1X4(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A00 = readString;
            String[] createStringArray = parcel.createStringArray();
            if (createStringArray != null) {
                this.A01 = createStringArray;
                return;
            }
            throw null;
        }
        throw null;
    }

    public AnonymousClass1X4(String str, String[] strArr) {
        this.A00 = str;
        this.A01 = strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }
}
