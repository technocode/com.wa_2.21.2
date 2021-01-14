package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1CF  reason: invalid class name */
public final class AnonymousClass1CF implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36371m4(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36371m4[i];
    }
}
