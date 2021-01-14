package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2F0  reason: invalid class name */
public final class AnonymousClass2F0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2F1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2F1[i];
    }
}
