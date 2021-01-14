package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1m2  reason: invalid class name and case insensitive filesystem */
public final class C36351m2 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CD();
    public final int A00;

    public C36351m2(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
