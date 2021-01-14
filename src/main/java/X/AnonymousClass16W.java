package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.16W  reason: invalid class name */
public final class AnonymousClass16W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        C34591im r9 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = AnonymousClass05S.A0I(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) AnonymousClass05S.A08(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    r9 = (C34591im) AnonymousClass05S.A08(parcel, readInt, C34591im.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == A02) {
            return new AnonymousClass294(hashSet, i, str, i2, bArr, pendingIntent, r9);
        }
        throw new AnonymousClass18H(AnonymousClass008.A08(37, "Overread allowed size end=", A02), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass294[i];
    }
}
