package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kc  reason: invalid class name and case insensitive filesystem */
public final class C35601kc extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass19U();
    public final int A00 = 1;
    public final String A01;

    public C35601kc() {
        C001801b.A1Q("com.whatsapp");
        this.A01 = "com.whatsapp";
    }

    public C35601kc(String str) {
        C001801b.A1Q(str);
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
