package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08a  reason: invalid class name */
public final class AnonymousClass08a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass08T(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass08T[i];
    }
}
