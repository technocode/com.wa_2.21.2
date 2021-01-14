package android.support.v4.media;

import X.C12610iO;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12610iO();
    public final int A00;
    public final MediaDescriptionCompat A01;

    public int describeContents() {
        return 0;
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.A00);
        sb.append(", mDescription=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }
}
