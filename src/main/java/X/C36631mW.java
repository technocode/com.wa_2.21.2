package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mW  reason: invalid class name and case insensitive filesystem */
public final class C36631mW extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24771Ci();
    public final int A00;
    public final int A01;

    public C36631mW(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0u(parcel, 3, this.A01);
        C008805h.A0r(parcel, A03);
    }
}
