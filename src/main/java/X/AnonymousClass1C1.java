package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1C1  reason: invalid class name */
public final class AnonymousClass1C1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36261lq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        C36271lr[] r12 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
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
                    f = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 4:
                    f2 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 5:
                    f3 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 6:
                    f4 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 7:
                    f5 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 8:
                    f6 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 9:
                    r12 = (C36271lr[]) AnonymousClass05S.A0J(parcel, readInt, C36271lr.CREATOR);
                    break;
                case 10:
                    f7 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 11:
                    f8 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 12:
                    f9 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36261lq(i, i2, f, f2, f3, f4, f5, f6, r12, f7, f8, f9);
    }
}
