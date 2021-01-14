package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1lR  reason: invalid class name and case insensitive filesystem */
public final class C36011lR extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BW();
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 0.5f;
    public float A03 = 1.0f;
    public float A04 = 0.0f;
    public float A05 = 0.5f;
    public float A06 = 0.0f;
    public AnonymousClass06F A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B = true;
    public boolean A0C;
    public boolean A0D = false;

    public C36011lR() {
    }

    public C36011lR(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.A08 = latLng;
        this.A09 = str;
        this.A0A = str2;
        if (iBinder == null) {
            this.A07 = null;
        } else {
            this.A07 = new AnonymousClass06F(BinderC04810Lw.A01(iBinder));
        }
        this.A02 = f;
        this.A03 = f2;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A04 = f3;
        this.A05 = f4;
        this.A06 = f5;
        this.A00 = f6;
        this.A01 = f7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 2, this.A08, i, false);
        C008805h.A10(parcel, 3, this.A09, false);
        C008805h.A10(parcel, 4, this.A0A, false);
        AnonymousClass06F r0 = this.A07;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.A00.asBinder();
        }
        C008805h.A0y(parcel, 5, asBinder);
        C008805h.A0t(parcel, 6, this.A02);
        C008805h.A0t(parcel, 7, this.A03);
        C008805h.A13(parcel, 8, this.A0C);
        C008805h.A13(parcel, 9, this.A0B);
        C008805h.A13(parcel, 10, this.A0D);
        C008805h.A0t(parcel, 11, this.A04);
        C008805h.A0t(parcel, 12, this.A05);
        C008805h.A0t(parcel, 13, this.A06);
        C008805h.A0t(parcel, 14, this.A00);
        C008805h.A0t(parcel, 15, this.A01);
        C008805h.A0r(parcel, A032);
    }
}
