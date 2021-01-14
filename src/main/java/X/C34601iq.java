package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1iq  reason: invalid class name and case insensitive filesystem */
public class C34601iq extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C235016b();
    public int A00;
    public Bundle A01;
    public final int A02;

    public C34601iq(int i, int i2, Bundle bundle) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A02);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0x(parcel, 3, this.A01);
        C008805h.A0r(parcel, A03);
    }
}
