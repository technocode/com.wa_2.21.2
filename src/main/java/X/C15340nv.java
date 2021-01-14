package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0nv  reason: invalid class name and case insensitive filesystem */
public final class C15340nv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C15350nw(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C15350nw[i];
    }
}
