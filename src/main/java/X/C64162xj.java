package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2xj  reason: invalid class name and case insensitive filesystem */
public final class C64162xj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C70083Jr(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C70083Jr[i];
    }
}
