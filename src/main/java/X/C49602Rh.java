package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Rh  reason: invalid class name and case insensitive filesystem */
public final class C49602Rh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C448021n(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C448021n[i];
    }
}
