package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.14p  reason: invalid class name and case insensitive filesystem */
public final class C231514p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C231614q(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C231614q[i];
    }
}
