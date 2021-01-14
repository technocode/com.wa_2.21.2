package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0pV  reason: invalid class name and case insensitive filesystem */
public class C16250pV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16240pU();
    public int A00;
    public int A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public C16250pV() {
    }

    public C16250pV(C16250pV r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public C16250pV(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
