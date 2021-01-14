package android.support.v4.media;

import X.AnonymousClass05V;
import X.C12630iS;
import X.C12680ie;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final AnonymousClass05V A01;
    public static final Parcelable.Creator CREATOR = new C12630iS();
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    static {
        AnonymousClass05V r1 = new AnonymousClass05V();
        A01 = r1;
        r1.put("android.media.metadata.TITLE", 1);
        AnonymousClass05V r3 = A01;
        r3.put("android.media.metadata.ARTIST", 1);
        r3.put("android.media.metadata.DURATION", 0);
        r3.put("android.media.metadata.ALBUM", 1);
        r3.put("android.media.metadata.AUTHOR", 1);
        r3.put("android.media.metadata.WRITER", 1);
        r3.put("android.media.metadata.COMPOSER", 1);
        r3.put("android.media.metadata.COMPILATION", 1);
        r3.put("android.media.metadata.DATE", 1);
        r3.put("android.media.metadata.YEAR", 0);
        r3.put("android.media.metadata.GENRE", 1);
        r3.put("android.media.metadata.TRACK_NUMBER", 0);
        r3.put("android.media.metadata.NUM_TRACKS", 0);
        r3.put("android.media.metadata.DISC_NUMBER", 0);
        r3.put("android.media.metadata.ALBUM_ARTIST", 1);
        r3.put("android.media.metadata.ART", 2);
        r3.put("android.media.metadata.ART_URI", 1);
        r3.put("android.media.metadata.ALBUM_ART", 2);
        r3.put("android.media.metadata.ALBUM_ART_URI", 1);
        r3.put("android.media.metadata.USER_RATING", 3);
        r3.put("android.media.metadata.RATING", 3);
        r3.put("android.media.metadata.DISPLAY_TITLE", 1);
        r3.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r3.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r3.put("android.media.metadata.DISPLAY_ICON", 2);
        r3.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r3.put("android.media.metadata.MEDIA_ID", 1);
        r3.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r3.put("android.media.metadata.MEDIA_URI", 1);
        r3.put("android.media.metadata.ADVERTISEMENT", 0);
        r3.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(C12680ie.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
