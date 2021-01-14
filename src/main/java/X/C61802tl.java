package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
public final class C61802tl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C61812tm(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C61812tm[i];
    }
}
