package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Kr  reason: invalid class name and case insensitive filesystem */
public final class C48042Kr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C48052Ks(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C48052Ks[i];
    }
}
