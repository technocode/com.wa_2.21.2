package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Fx  reason: invalid class name and case insensitive filesystem */
public final class C46962Fx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C28211Ti(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C28211Ti[i];
    }
}
