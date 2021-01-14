package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ne  reason: invalid class name and case insensitive filesystem */
public final class C15190ne implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        if (parcel.readParcelable(null) == null) {
            return AbstractC15200nf.A01;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbstractC15200nf.A01;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AbstractC15200nf[i];
    }
}
