package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Oy  reason: invalid class name and case insensitive filesystem */
public final class C49082Oy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C49092Oz(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C49092Oz[i];
    }
}
