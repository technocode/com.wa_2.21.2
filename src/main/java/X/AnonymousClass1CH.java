package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1CH  reason: invalid class name */
public final class AnonymousClass1CH implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                uri = (Uri) AnonymousClass05S.A08(parcel, readInt, Uri.CREATOR);
            } else if (i == 4) {
                bundle = AnonymousClass05S.A06(parcel, readInt);
            } else if (i != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass05S.A0I(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36391m6(uri, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36391m6[i];
    }
}
