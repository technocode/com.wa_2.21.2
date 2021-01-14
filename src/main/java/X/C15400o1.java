package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0o1  reason: invalid class name and case insensitive filesystem */
public final class C15400o1 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C15410o2(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C15410o2(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C15410o2[i];
    }
}
