package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1W1  reason: invalid class name */
public final class AnonymousClass1W1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2A1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2A1[i];
    }
}
