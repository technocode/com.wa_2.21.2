package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0vI  reason: invalid class name and case insensitive filesystem */
public final class C19600vI implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C07020Vp(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C07020Vp[i];
    }
}
