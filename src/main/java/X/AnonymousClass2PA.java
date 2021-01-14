package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: X.2PA  reason: invalid class name */
public class AnonymousClass2PA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2P9();
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2PA() {
    }

    public AnonymousClass2PA(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readInt() != 0;
    }

    public String toString() {
        return String.format(Locale.US, "ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b}", Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03, Boolean.valueOf(this.A04));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
