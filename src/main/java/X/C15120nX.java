package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0nX  reason: invalid class name and case insensitive filesystem */
public final class C15120nX implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C15130nY(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C15130nY[i];
    }
}
