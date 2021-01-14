package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0o9  reason: invalid class name and case insensitive filesystem */
public final class C15480o9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15470o8();
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public C15350nw[] A04;

    public int describeContents() {
        return 0;
    }

    public C15480o9() {
    }

    public C15480o9(Parcel parcel) {
        this.A02 = parcel.createTypedArrayList(C15500oB.CREATOR);
        this.A03 = parcel.createStringArrayList();
        this.A04 = (C15350nw[]) parcel.createTypedArray(C15350nw.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A04, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
