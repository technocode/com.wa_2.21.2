package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kb  reason: invalid class name and case insensitive filesystem */
public final class C35591kb extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass19T();
    public final int A00;
    public final int A01 = 1;
    public final String A02;

    public C35591kb(int i) {
        C001801b.A1Q("com.whatsapp");
        this.A02 = "com.whatsapp";
        this.A00 = i;
    }

    public C35591kb(String str, int i) {
        C001801b.A1Q(str);
        this.A02 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A01);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A0u(parcel, 3, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
