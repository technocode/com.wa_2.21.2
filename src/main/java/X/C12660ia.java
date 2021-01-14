package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;

/* renamed from: X.0ia  reason: invalid class name and case insensitive filesystem */
public final class C12660ia implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$ResultReceiverWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}
