package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

/* renamed from: X.0iO  reason: invalid class name and case insensitive filesystem */
public final class C12610iO implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat$MediaItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
