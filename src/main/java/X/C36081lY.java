package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lY  reason: invalid class name and case insensitive filesystem */
public final class C36081lY extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24491Ba();
    public final String A00;

    public C36081lY(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A00, false);
        C008805h.A0r(parcel, A03);
    }
}
