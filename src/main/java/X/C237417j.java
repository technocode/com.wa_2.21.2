package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.17j  reason: invalid class name and case insensitive filesystem */
public final class C237417j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) AnonymousClass05S.A08(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new Status(i, i2, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
