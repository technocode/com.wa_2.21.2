package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: X.0rZ  reason: invalid class name and case insensitive filesystem */
public final class C17460rZ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
