package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2xp  reason: invalid class name and case insensitive filesystem */
public final class C64222xp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass0OS(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass0OS[i];
    }
}
