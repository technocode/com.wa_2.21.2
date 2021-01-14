package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lq  reason: invalid class name and case insensitive filesystem */
public class C36261lq extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1C1();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final C36271lr[] A0B;

    public C36261lq(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, C36271lr[] r9, float f7, float f8, float f9) {
        this.A0A = i;
        this.A09 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = f5;
        this.A08 = f6;
        this.A0B = r9;
        this.A04 = f7;
        this.A05 = f8;
        this.A06 = f9;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A0A);
        C008805h.A0u(parcel, 2, this.A09);
        C008805h.A0t(parcel, 3, this.A00);
        C008805h.A0t(parcel, 4, this.A01);
        C008805h.A0t(parcel, 5, this.A03);
        C008805h.A0t(parcel, 6, this.A02);
        C008805h.A0t(parcel, 7, this.A07);
        C008805h.A0t(parcel, 8, this.A08);
        C008805h.A15(parcel, 9, this.A0B, i);
        C008805h.A0t(parcel, 10, this.A04);
        C008805h.A0t(parcel, 11, this.A05);
        C008805h.A0t(parcel, 12, this.A06);
        C008805h.A0r(parcel, A032);
    }
}
