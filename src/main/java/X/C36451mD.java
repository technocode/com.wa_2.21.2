package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mD  reason: invalid class name and case insensitive filesystem */
public final class C36451mD extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CO();
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C36451mD(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A13(parcel, 3, this.A01);
        C008805h.A13(parcel, 4, this.A02);
        C008805h.A0r(parcel, A03);
    }
}
