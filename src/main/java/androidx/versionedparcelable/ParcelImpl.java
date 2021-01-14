package androidx.versionedparcelable;

import X.AbstractC17480rc;
import X.C17460rZ;
import X.C30931cE;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17460rZ();
    public final AbstractC17480rc A00;

    public int describeContents() {
        return 0;
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new C30931cE(parcel).A03();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C30931cE(parcel).A08(this.A00);
    }
}
