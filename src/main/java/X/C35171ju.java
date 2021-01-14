package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public class C35171ju extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18Q();
    public int A00;
    public Account A01;
    public Bundle A02;
    public IBinder A03;
    public String A04;
    public boolean A05;
    public C34671iy[] A06;
    public C34671iy[] A07;
    public Scope[] A08;
    public final int A09;
    public final int A0A;

    public C35171ju(int i) {
        this.A09 = 4;
        this.A00 = 12451000;
        this.A0A = i;
        this.A05 = true;
    }

    public C35171ju(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C34671iy[] r13, C34671iy[] r14, boolean z) {
        IAccountAccessor r1;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A04 = "com.google.android.gms";
        } else {
            this.A04 = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    r1 = (IAccountAccessor) queryLocalInterface;
                } else {
                    r1 = new C35181jv(iBinder);
                }
                if (r1 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = r1.A4d();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                account2 = null;
            }
            this.A01 = account2;
        } else {
            this.A03 = iBinder;
            this.A01 = account;
        }
        this.A08 = scopeArr;
        this.A02 = bundle;
        this.A06 = r13;
        this.A07 = r14;
        this.A05 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A09);
        C008805h.A0u(parcel, 2, this.A0A);
        C008805h.A0u(parcel, 3, this.A00);
        C008805h.A10(parcel, 4, this.A04, false);
        C008805h.A0y(parcel, 5, this.A03);
        C008805h.A15(parcel, 6, this.A08, i);
        C008805h.A0x(parcel, 7, this.A02);
        C008805h.A0z(parcel, 8, this.A01, i, false);
        C008805h.A15(parcel, 10, this.A06, i);
        C008805h.A15(parcel, 11, this.A07, i);
        C008805h.A13(parcel, 12, this.A05);
        C008805h.A0r(parcel, A032);
    }
}
