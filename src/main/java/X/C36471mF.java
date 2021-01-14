package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.1mF  reason: invalid class name and case insensitive filesystem */
public final class C36471mF extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CQ();
    public final int A00;
    public final ConnectionConfiguration A01;

    public C36471mF(int i, ConnectionConfiguration connectionConfiguration) {
        this.A00 = i;
        this.A01 = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0z(parcel, 3, this.A01, i, false);
        C008805h.A0r(parcel, A03);
    }
}
