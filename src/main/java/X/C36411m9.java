package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1m9  reason: invalid class name and case insensitive filesystem */
public final class C36411m9 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CK();
    public final int A00;
    public final C36331lz A01;

    public C36411m9(int i, C36331lz r2) {
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
