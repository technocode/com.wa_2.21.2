package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Fw  reason: invalid class name and case insensitive filesystem */
public final class C46952Fw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C28201Th(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C28201Th[i];
    }
}
