package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;

/* renamed from: X.0if  reason: invalid class name and case insensitive filesystem */
public final class C12690if implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
