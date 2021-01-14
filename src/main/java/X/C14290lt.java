package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0lt  reason: invalid class name and case insensitive filesystem */
public final class C14290lt implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C29881aM(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C29881aM(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C29881aM[i];
    }
}
