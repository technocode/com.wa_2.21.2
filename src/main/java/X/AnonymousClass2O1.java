package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2O1  reason: invalid class name */
public final class AnonymousClass2O1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2O2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2O2[i];
    }
}
