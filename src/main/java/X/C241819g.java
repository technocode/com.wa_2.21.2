package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.19g  reason: invalid class name and case insensitive filesystem */
public class C241819g {
    static {
        C241819g.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
