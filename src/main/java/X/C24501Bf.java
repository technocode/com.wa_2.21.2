package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.1Bf  reason: invalid class name and case insensitive filesystem */
public final class C24501Bf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36041lU[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i == 3) {
                dataHolder = (DataHolder) AnonymousClass05S.A08(parcel, readInt, DataHolder.CREATOR);
            } else if (i == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) AnonymousClass05S.A08(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (i == 5) {
                j = AnonymousClass05S.A05(parcel, readInt);
            } else if (i != 6) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass05S.A0I(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36041lU(str, dataHolder, parcelFileDescriptor, j, bArr);
    }
}
