package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0oA  reason: invalid class name and case insensitive filesystem */
public final class C15490oA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C15500oB(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C15500oB[i];
    }
}
