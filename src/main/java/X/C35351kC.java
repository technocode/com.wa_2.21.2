package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kC  reason: invalid class name and case insensitive filesystem */
public final class C35351kC extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18Y();
    public final int A00;
    public final int A01;
    public final String A02;

    public C35351kC(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public C35351kC(String str, int i) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A0u(parcel, 3, this.A01);
        C008805h.A0r(parcel, A03);
    }
}
