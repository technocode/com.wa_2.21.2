package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.36Y  reason: invalid class name */
public final class AnonymousClass36Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1YI(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1YI[i];
    }
}
