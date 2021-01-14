package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: X.1nV  reason: invalid class name and case insensitive filesystem */
public final class C37071nV extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1F2();
    public Bundle A00;
    public Map A01;

    public C37071nV(Bundle bundle) {
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0x(parcel, 2, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
