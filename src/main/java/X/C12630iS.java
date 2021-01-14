package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* renamed from: X.0iS  reason: invalid class name and case insensitive filesystem */
public final class C12630iS implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
