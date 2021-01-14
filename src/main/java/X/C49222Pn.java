package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Pn  reason: invalid class name and case insensitive filesystem */
public final class C49222Pn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C49232Po(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C49232Po[i];
    }
}
