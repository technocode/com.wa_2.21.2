package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.132  reason: invalid class name */
public final class AnonymousClass132 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass135(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass135[i];
    }
}
