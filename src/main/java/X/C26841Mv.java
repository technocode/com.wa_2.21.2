package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Mv  reason: invalid class name and case insensitive filesystem */
public final class C26841Mv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C26851Mw(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C26851Mw[i];
    }
}
