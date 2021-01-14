package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2LT  reason: invalid class name */
public final class AnonymousClass2LT implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2bX(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2bX[i];
    }
}
