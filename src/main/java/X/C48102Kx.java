package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Kx  reason: invalid class name and case insensitive filesystem */
public final class C48102Kx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C48112Ky(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C48112Ky[i];
    }
}
