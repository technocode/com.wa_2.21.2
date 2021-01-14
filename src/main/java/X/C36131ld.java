package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1ld  reason: invalid class name and case insensitive filesystem */
public final class C36131ld extends AnonymousClass066 implements AnonymousClass17C {
    public static final Parcelable.Creator CREATOR = new C24511Bg();
    public int A00;
    public Intent A01;
    public final int A02;

    public C36131ld() {
        this.A02 = 2;
        this.A00 = 0;
        this.A01 = null;
    }

    public C36131ld(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    @Override // X.AnonymousClass17C
    public final Status A9C() {
        if (this.A00 == 0) {
            return Status.A07;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A02);
        C008805h.A0u(parcel, 2, this.A00);
        C008805h.A0z(parcel, 3, this.A01, i, false);
        C008805h.A0r(parcel, A03);
    }
}
