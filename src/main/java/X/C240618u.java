package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public final class C240618u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) AnonymousClass05S.A08(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C34661ix(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C34661ix[i];
    }
}
