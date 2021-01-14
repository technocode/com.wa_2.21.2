package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18b  reason: invalid class name and case insensitive filesystem */
public final class C239118b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        String str2 = null;
        C35371kE r11 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 3:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 4:
                    i3 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 6:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 7:
                    i4 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 8:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 9:
                    r11 = (C35371kE) AnonymousClass05S.A08(parcel, readInt, C35371kE.CREATOR);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35381kF(i, i2, z, i3, z2, str, i4, str2, r11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35381kF[i];
    }
}
