package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1CS  reason: invalid class name */
public final class AnonymousClass1CS implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                iBinder = AnonymousClass05S.A07(parcel, readInt);
            } else if (i == 3) {
                intentFilterArr = (IntentFilter[]) AnonymousClass05S.A0J(parcel, readInt, IntentFilter.CREATOR);
            } else if (i == 4) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str2 = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36381m5(iBinder, intentFilterArr, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36381m5[i];
    }
}
