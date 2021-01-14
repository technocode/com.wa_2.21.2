package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ad  reason: invalid class name and case insensitive filesystem */
public class C24341Ad {
    static {
        C24341Ad.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
