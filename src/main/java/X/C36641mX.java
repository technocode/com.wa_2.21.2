package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.1mX  reason: invalid class name and case insensitive filesystem */
public final class C36641mX extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24781Cj();
    public final int A00;
    public final long A01;
    public final List A02;

    public C36641mX(int i, long j, List list) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0w(parcel, 3, this.A01);
        C008805h.A12(parcel, 4, this.A02, false);
        C008805h.A0r(parcel, A03);
    }
}
