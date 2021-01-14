package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* renamed from: X.0ic  reason: invalid class name and case insensitive filesystem */
public final class C12670ic implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        Object readStrongBinder;
        if (Build.VERSION.SDK_INT >= 21) {
            readStrongBinder = parcel.readParcelable(null);
        } else {
            readStrongBinder = parcel.readStrongBinder();
        }
        return new MediaSessionCompat$Token(readStrongBinder);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}
