package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: X.0ih  reason: invalid class name and case insensitive filesystem */
public final class C12700ih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
