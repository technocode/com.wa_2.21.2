package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1la  reason: invalid class name and case insensitive filesystem */
public final class C36101la extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Bd();
    public final String A00;

    public C36101la(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A00, false);
        C008805h.A0r(parcel, A03);
    }
}
