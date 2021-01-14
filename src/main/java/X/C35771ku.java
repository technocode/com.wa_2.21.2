package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1ku  reason: invalid class name and case insensitive filesystem */
public final class C35771ku extends AnonymousClass066 implements AnonymousClass17C {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1AN();
    public final Status A00;

    public C35771ku(Status status) {
        this.A00 = status;
    }

    @Override // X.AnonymousClass17C
    public final Status A9C() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 1, this.A00, i, false);
        C008805h.A0r(parcel, A03);
    }
}
