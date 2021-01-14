package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: X.17i  reason: invalid class name and case insensitive filesystem */
public final class C237317i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new Scope(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
