package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;

/* renamed from: X.1CG  reason: invalid class name */
public final class AnonymousClass1CG implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str2 = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new DataItemAssetParcelable(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataItemAssetParcelable[i];
    }
}
