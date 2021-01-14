package android.support.v4.media.session;

import X.AnonymousClass008;
import X.C12650iY;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12650iY();
    public final long A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("MediaSession.QueueItem {Description=");
        A0S.append(this.A01);
        A0S.append(", Id=");
        A0S.append(this.A00);
        A0S.append(" }");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }
}
