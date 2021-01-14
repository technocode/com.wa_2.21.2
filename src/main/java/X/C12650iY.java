package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public final class C12650iY implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$QueueItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaSessionCompat$QueueItem[i];
    }
}
