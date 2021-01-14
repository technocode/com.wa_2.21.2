package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;

/* renamed from: X.0iU  reason: invalid class name and case insensitive filesystem */
public final class C12640iU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}
