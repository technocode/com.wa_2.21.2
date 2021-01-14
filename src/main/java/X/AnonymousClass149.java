package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.149  reason: invalid class name */
public final class AnonymousClass149 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass14A(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass14A[i];
    }
}
