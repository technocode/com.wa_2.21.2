package android.support.v4.media.session;

import X.C12660ia;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12660ia();
    public ResultReceiver A00;

    public int describeContents() {
        return 0;
    }

    public MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        this.A00 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
    }
}
