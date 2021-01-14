package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1LR  reason: invalid class name */
public final class AnonymousClass1LR implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass1LS(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass1LS[i];
    }
}
