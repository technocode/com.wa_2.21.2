package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.10N  reason: invalid class name */
public final class AnonymousClass10N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass10O(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass10O[i];
    }
}
