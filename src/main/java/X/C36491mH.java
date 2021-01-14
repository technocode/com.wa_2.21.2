package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.1mH  reason: invalid class name and case insensitive filesystem */
public final class C36491mH extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CT();
    public final int A00;
    public final List A01;

    public C36491mH(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A12(parcel, 3, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
