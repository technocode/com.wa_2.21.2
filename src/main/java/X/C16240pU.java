package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0pU  reason: invalid class name and case insensitive filesystem */
public final class C16240pU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C16250pV(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C16250pV[i];
    }
}
