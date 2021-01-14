package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0pu  reason: invalid class name and case insensitive filesystem */
public final class C16500pu implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C30621be(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C30621be(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C30621be[i];
    }
}
