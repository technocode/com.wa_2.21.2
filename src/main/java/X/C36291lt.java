package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lt  reason: invalid class name and case insensitive filesystem */
public final class C36291lt extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1C2();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C36291lt() {
    }

    public C36291lt(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A01);
        C008805h.A0u(parcel, 3, this.A02);
        C008805h.A0u(parcel, 4, this.A03);
        C008805h.A13(parcel, 5, this.A04);
        C008805h.A13(parcel, 6, this.A05);
        C008805h.A0t(parcel, 7, this.A00);
        C008805h.A0r(parcel, A032);
    }
}
