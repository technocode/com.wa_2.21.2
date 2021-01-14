package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.125  reason: invalid class name */
public final class AnonymousClass125 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass126(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass126[i];
    }
}
