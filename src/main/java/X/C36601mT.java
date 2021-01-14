package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mT  reason: invalid class name and case insensitive filesystem */
public final class C36601mT extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24731Ce();
    public final long A00;
    public final String A01;
    public final String A02;

    public C36601mT(String str, String str2, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A10(parcel, 3, this.A01, false);
        C008805h.A0w(parcel, 4, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
