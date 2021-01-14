package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1jy  reason: invalid class name and case insensitive filesystem */
public class C35211jy extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18O();
    public IBinder A00;
    public C34661ix A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public C35211jy(int i, IBinder iBinder, C34661ix r3, boolean z, boolean z2) {
        this.A04 = i;
        this.A00 = iBinder;
        this.A01 = r3;
        this.A02 = z;
        this.A03 = z2;
    }

    public IAccountAccessor A00() {
        IBinder iBinder = this.A00;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new C35181jv(iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35211jy)) {
            return false;
        }
        C35211jy r5 = (C35211jy) obj;
        return this.A01.equals(r5.A01) && A00().equals(r5.A00());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A04);
        C008805h.A0y(parcel, 2, this.A00);
        C008805h.A0z(parcel, 3, this.A01, i, false);
        C008805h.A13(parcel, 4, this.A02);
        C008805h.A13(parcel, 5, this.A03);
        C008805h.A0r(parcel, A032);
    }
}
