package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1k9  reason: invalid class name and case insensitive filesystem */
public final class C35321k9 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18P();
    public Bundle A00;
    public C34671iy[] A01;

    public C35321k9(Bundle bundle, C34671iy[] r2) {
        this.A00 = bundle;
        this.A01 = r2;
    }

    public C35321k9() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0x(parcel, 1, this.A00);
        C008805h.A15(parcel, 2, this.A01, i);
        C008805h.A0r(parcel, A03);
    }
}
