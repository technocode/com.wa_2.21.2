package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Kt  reason: invalid class name and case insensitive filesystem */
public final class C48062Kt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C48072Ku(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C48072Ku[i];
    }
}
