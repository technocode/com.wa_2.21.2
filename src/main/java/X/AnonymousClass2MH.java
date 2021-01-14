package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2MH  reason: invalid class name */
public final class AnonymousClass2MH implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass2MI(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2MI[i];
    }
}
