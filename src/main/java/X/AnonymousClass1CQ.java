package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.1CQ  reason: invalid class name */
public final class AnonymousClass1CQ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) AnonymousClass05S.A08(parcel, readInt, ConnectionConfiguration.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36471mF(i, connectionConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36471mF[i];
    }
}
