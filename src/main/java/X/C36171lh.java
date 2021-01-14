package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public final class C36171lh extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24551Bk();
    public final int A00;
    public final C34661ix A01;
    public final C35211jy A02;

    public C36171lh(int i, C34661ix r2, C35211jy r3) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C36171lh() {
        C34661ix r1 = new C34661ix(8, null);
        this.A00 = 1;
        this.A01 = r1;
        this.A02 = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A0z(parcel, 2, this.A01, i, false);
        C008805h.A0z(parcel, 3, this.A02, i, false);
        C008805h.A0r(parcel, A03);
    }
}
