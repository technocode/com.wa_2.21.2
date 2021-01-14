package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1MY  reason: invalid class name */
public final class AnonymousClass1MY implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1MZ(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1MZ[i];
    }
}
