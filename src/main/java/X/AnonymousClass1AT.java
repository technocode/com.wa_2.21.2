package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1AT  reason: invalid class name */
public final class AnonymousClass1AT implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35821kz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        C35811ky r4 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    r4 = (C35811ky) AnonymousClass05S.A08(parcel, readInt, C35811ky.CREATOR);
                    break;
                case 3:
                    iBinder = AnonymousClass05S.A07(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) AnonymousClass05S.A08(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = AnonymousClass05S.A07(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = AnonymousClass05S.A07(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35821kz(i, r4, iBinder, pendingIntent, iBinder2, iBinder3);
    }
}
