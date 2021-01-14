package X;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.19i  reason: invalid class name */
public class AnonymousClass19i {
    static {
        AnonymousClass19i.class.getClassLoader();
    }

    public static void A00(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
