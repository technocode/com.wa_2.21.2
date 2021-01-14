package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0jt  reason: invalid class name and case insensitive filesystem */
public final class C13250jt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C13260ju(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C13260ju[i];
    }
}
