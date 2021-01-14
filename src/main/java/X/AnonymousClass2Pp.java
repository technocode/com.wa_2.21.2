package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Pp  reason: invalid class name */
public final class AnonymousClass2Pp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C49262Ps(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C49262Ps[i];
    }
}
