package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2LR  reason: invalid class name */
public final class AnonymousClass2LR implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1VL(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1VL[i];
    }
}
