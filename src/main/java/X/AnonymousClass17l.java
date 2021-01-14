package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.17l  reason: invalid class name */
public final class AnonymousClass17l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                int A04 = AnonymousClass05S.A04(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A04 == 0) {
                    strArr = null;
                } else {
                    strArr = parcel.createStringArray();
                    parcel.setDataPosition(dataPosition + A04);
                }
            } else if (i3 == 2) {
                cursorWindowArr = (CursorWindow[]) AnonymousClass05S.A0J(parcel, readInt, CursorWindow.CREATOR);
            } else if (i3 == 3) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 4) {
                bundle = AnonymousClass05S.A06(parcel, readInt);
            } else if (i3 != 1000) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.A01 = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.A09;
            if (i4 >= strArr2.length) {
                break;
            }
            dataHolder.A01.putInt(strArr2[i4], i4);
            i4++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.A08;
        int length = cursorWindowArr2.length;
        dataHolder.A04 = new int[length];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            dataHolder.A04[i6] = i5;
            i5 += cursorWindowArr2[i6].getNumRows() - (i5 - cursorWindowArr2[i6].getStartPosition());
        }
        dataHolder.A00 = i5;
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
