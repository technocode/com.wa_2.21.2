package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1SK  reason: invalid class name */
public final class AnonymousClass1SK implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1SL(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1SL[i];
    }
}
