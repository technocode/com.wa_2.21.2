package X;

import android.media.MediaDescription;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* renamed from: X.0iQ  reason: invalid class name and case insensitive filesystem */
public final class C12620iQ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 21) {
            return new MediaDescriptionCompat(parcel);
        }
        return MediaDescriptionCompat.A00(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
