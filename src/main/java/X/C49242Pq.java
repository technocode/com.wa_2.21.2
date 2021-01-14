package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Pq  reason: invalid class name and case insensitive filesystem */
public final class C49242Pq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C49252Pr(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C49252Pr[i];
    }
}
