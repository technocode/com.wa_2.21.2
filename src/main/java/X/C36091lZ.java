package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lZ  reason: invalid class name and case insensitive filesystem */
public final class C36091lZ extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Bc();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final C36031lT[] A03;

    public C36091lZ(long j, C36031lT[] r4, int i, boolean z) {
        this.A01 = j;
        this.A03 = r4;
        this.A02 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0w(parcel, 2, this.A01);
        C008805h.A15(parcel, 3, this.A03, i);
        C008805h.A0u(parcel, 4, this.A00);
        C008805h.A13(parcel, 5, this.A02);
        C008805h.A0r(parcel, A032);
    }
}
