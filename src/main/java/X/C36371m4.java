package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1m4  reason: invalid class name and case insensitive filesystem */
public final class C36371m4 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CF();
    public final int A00;

    public C36371m4(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
