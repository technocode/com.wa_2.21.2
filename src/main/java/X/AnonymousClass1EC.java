package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1EC  reason: invalid class name */
public final class AnonymousClass1EC implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C36951nC(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C36951nC(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C36951nC[i];
    }
}
