package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0kL  reason: invalid class name and case insensitive filesystem */
public final class C13500kL implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C29661Zx(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C29661Zx(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C29661Zx[i];
    }
}
