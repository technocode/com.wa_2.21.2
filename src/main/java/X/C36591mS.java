package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mS  reason: invalid class name and case insensitive filesystem */
public final class C36591mS extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24721Cd();
    public final int A00;
    public final C36341m1 A01;

    public C36591mS(int i, C36341m1 r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0z(parcel, 3, this.A01, i, false);
        C008805h.A0r(parcel, A03);
    }
}
