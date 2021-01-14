package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bK  reason: invalid class name and case insensitive filesystem */
public final class C08550bK implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass02U(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass02U[i];
    }
}
