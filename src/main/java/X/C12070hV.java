package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0hV  reason: invalid class name and case insensitive filesystem */
public final class C12070hV implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C12060hU(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C12060hU[i];
    }
}
