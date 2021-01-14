package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2P9  reason: invalid class name */
public final class AnonymousClass2P9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2PA(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2PA[i];
    }
}
