package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0im  reason: invalid class name and case insensitive filesystem */
public final class C12720im implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C12730in(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C12730in[i];
    }
}
