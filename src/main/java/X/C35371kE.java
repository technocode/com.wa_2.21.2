package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kE  reason: invalid class name and case insensitive filesystem */
public final class C35371kE extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18W();
    public final int A00;
    public final C35361kD A01;

    public C35371kE(int i, C35361kD r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public C35371kE(C35361kD r2) {
        this.A00 = 1;
        this.A01 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A0z(parcel, 2, this.A01, i, false);
        C008805h.A0r(parcel, A03);
    }
}
