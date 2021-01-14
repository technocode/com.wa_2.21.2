package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2MB  reason: invalid class name */
public final class AnonymousClass2MB implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2MC(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2MC[i];
    }
}
