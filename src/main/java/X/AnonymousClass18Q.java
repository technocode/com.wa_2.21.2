package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: X.18Q  reason: invalid class name */
public final class AnonymousClass18Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C34671iy[] r11 = null;
        C34671iy[] r12 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
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
                    i3 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 4:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 5:
                    iBinder = AnonymousClass05S.A07(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) AnonymousClass05S.A0J(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AnonymousClass05S.A06(parcel, readInt);
                    break;
                case 8:
                    account = (Account) AnonymousClass05S.A08(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
                case 10:
                    r11 = (C34671iy[]) AnonymousClass05S.A0J(parcel, readInt, C34671iy.CREATOR);
                    break;
                case 11:
                    r12 = (C34671iy[]) AnonymousClass05S.A0J(parcel, readInt, C34671iy.CREATOR);
                    break;
                case 12:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35171ju(i, i2, i3, str, iBinder, scopeArr, bundle, account, r11, r12, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35171ju[i];
    }
}
