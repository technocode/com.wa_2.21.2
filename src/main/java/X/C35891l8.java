package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1l8  reason: invalid class name and case insensitive filesystem */
public final class C35891l8 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C24391Aj();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public C35891l8() {
    }

    public C35891l8(int i, int i2, int i3, long j, int i4) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A02 = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A03);
        C008805h.A0u(parcel, 3, this.A00);
        C008805h.A0u(parcel, 4, this.A01);
        C008805h.A0w(parcel, 5, this.A04);
        C008805h.A0u(parcel, 6, this.A02);
        C008805h.A0r(parcel, A032);
    }
}
