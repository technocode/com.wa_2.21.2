package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1C5  reason: invalid class name */
public final class AnonymousClass1C5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36271lr[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                f = AnonymousClass05S.A01(parcel, readInt);
            } else if (i3 == 3) {
                f2 = AnonymousClass05S.A01(parcel, readInt);
            } else if (i3 != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36271lr(i, f, f2, i2);
    }
}
