package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kJ  reason: invalid class name and case insensitive filesystem */
public final class C35421kJ extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C239218c();
    public final int A00;
    public final C35381kF A01;
    public final String A02;

    public C35421kJ(int i, String str, C35381kF r3) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = r3;
    }

    public C35421kJ(String str, C35381kF r3) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = r3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A0z(parcel, 3, this.A01, i, false);
        C008805h.A0r(parcel, A03);
    }
}
