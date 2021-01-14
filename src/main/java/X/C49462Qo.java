package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2Qo  reason: invalid class name and case insensitive filesystem */
public class C49462Qo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49452Qn();
    public final ArrayList A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public C49462Qo(Parcel parcel) {
        this.A01 = parcel.readByte() != 0;
        this.A00 = parcel.createStringArrayList();
    }

    public C49462Qo(boolean z, ArrayList arrayList) {
        this.A01 = z;
        this.A00 = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringList(this.A00);
    }
}
