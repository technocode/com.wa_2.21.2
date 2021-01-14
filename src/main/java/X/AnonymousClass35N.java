package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.35N  reason: invalid class name */
public final class AnonymousClass35N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C005902w(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C005902w[i];
    }
}
