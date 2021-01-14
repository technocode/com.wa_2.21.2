package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Qp  reason: invalid class name and case insensitive filesystem */
public final class C49472Qp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C49482Qq(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C49482Qq[i];
    }
}
