package android.support.v4.media;

import X.AnonymousClass008;
import X.C12640iU;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12640iU();
    public final float A00;
    public final int A01;

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public int describeContents() {
        return this.A01;
    }

    public String toString() {
        String valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("Rating:style=");
        A0S.append(this.A01);
        A0S.append(" rating=");
        float f = this.A00;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        A0S.append(valueOf);
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
