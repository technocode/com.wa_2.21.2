package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0ju  reason: invalid class name and case insensitive filesystem */
public class C13260ju extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C13250jt();
    public boolean A00;

    public C13260ju(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readByte() != 0;
    }

    public C13260ju(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
