package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.16U  reason: invalid class name */
public final class AnonymousClass16U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new AnonymousClass292(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass292[i];
    }
}
