package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1AN  reason: invalid class name */
public final class AnonymousClass1AN implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35771ku[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        Status status = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                status = (Status) AnonymousClass05S.A08(parcel, readInt, Status.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35771ku(status);
    }
}
