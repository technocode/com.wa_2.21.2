package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2G0  reason: invalid class name */
public final class AnonymousClass2G0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C28251Tm(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C28251Tm[i];
    }
}
