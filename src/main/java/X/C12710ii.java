package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: X.0ii  reason: invalid class name and case insensitive filesystem */
public final class C12710ii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
