package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.147  reason: invalid class name */
public final class AnonymousClass147 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass148(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass148[i];
    }
}
