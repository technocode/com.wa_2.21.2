package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lT  reason: invalid class name and case insensitive filesystem */
public class C36031lT extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Bb();
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public C36031lT(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A14(parcel, 3, this.A02, false);
        C008805h.A0u(parcel, 4, this.A00);
        C008805h.A0r(parcel, A03);
    }
}
