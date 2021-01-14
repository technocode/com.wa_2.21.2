package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38n  reason: invalid class name and case insensitive filesystem */
public final class C674238n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C09260ca(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C09260ca[i];
    }
}
