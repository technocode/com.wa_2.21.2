package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1im  reason: invalid class name and case insensitive filesystem */
public class C34591im extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass16X();
    public long A00;
    public boolean A01;
    public final int A02;
    public final boolean A03;

    public C34591im(int i, boolean z, long j, boolean z2) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
        this.A03 = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A02);
        C008805h.A13(parcel, 2, this.A01);
        C008805h.A0w(parcel, 3, this.A00);
        C008805h.A13(parcel, 4, this.A03);
        C008805h.A0r(parcel, A032);
    }
}
