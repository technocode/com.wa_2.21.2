package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.1Mw  reason: invalid class name and case insensitive filesystem */
public class C26851Mw extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C26841Mv();
    public int A00;

    public C26851Mw(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C26851Mw(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
