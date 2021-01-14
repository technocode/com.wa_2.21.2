package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Fl  reason: invalid class name and case insensitive filesystem */
public final class C46892Fl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C46902Fm(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C46902Fm[i];
    }
}
