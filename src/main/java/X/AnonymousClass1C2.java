package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1C2  reason: invalid class name */
public final class AnonymousClass1C2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36291lt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 3:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 4:
                    i3 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 5:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 6:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 7:
                    f = AnonymousClass05S.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36291lt(i, i2, i3, z, z2, f);
    }
}
