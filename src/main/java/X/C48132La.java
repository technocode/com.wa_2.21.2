package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2La  reason: invalid class name and case insensitive filesystem */
public final class C48132La implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C43801yy(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C43801yy[i];
    }
}
