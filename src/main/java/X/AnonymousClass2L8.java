package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2L8  reason: invalid class name */
public final class AnonymousClass2L8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1VD(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1VD[i];
    }
}
