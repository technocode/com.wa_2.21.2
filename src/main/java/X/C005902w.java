package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.02w  reason: invalid class name and case insensitive filesystem */
public class C005902w implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass35N();
    public int A00;
    public int A01;
    public Intent A02;

    public int describeContents() {
        return 0;
    }

    public C005902w(Intent intent, int i, int i2) {
        this.A02 = intent;
        this.A01 = i;
        this.A00 = i2;
    }

    public C005902w(Parcel parcel) {
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        if (intent != null) {
            this.A02 = intent;
            this.A01 = parcel.readInt();
            this.A00 = parcel.readInt();
            return;
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
