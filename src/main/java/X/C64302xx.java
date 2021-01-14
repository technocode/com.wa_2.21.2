package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2xx  reason: invalid class name and case insensitive filesystem */
public final class C64302xx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1XR(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1XR[i];
    }
}
