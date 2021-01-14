package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public final class C36111lb extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Be();
    public final int A00;
    public final boolean A01;

    public C36111lb(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A13(parcel, 3, this.A01);
        C008805h.A0r(parcel, A03);
    }
}
