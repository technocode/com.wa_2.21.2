package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.2Oz  reason: invalid class name and case insensitive filesystem */
public class C49092Oz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49082Oy();
    public final byte A00;
    public final int A01;
    public final File A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public C49092Oz(AbstractC53972e9 r2) {
        this.A00 = r2.A9q();
        this.A02 = r2.A6P();
        this.A03 = r2.AB4();
        this.A01 = r2.A8q();
    }

    public C49092Oz(Parcel parcel) {
        this.A00 = parcel.readByte();
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = new File(readString);
            this.A03 = parcel.readByte() != 1 ? false : true;
            this.A01 = parcel.readInt();
            return;
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00);
        parcel.writeString(this.A02.getAbsolutePath());
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
    }
}
