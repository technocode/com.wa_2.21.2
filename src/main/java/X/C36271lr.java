package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1lr  reason: invalid class name and case insensitive filesystem */
public final class C36271lr extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1C5();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C36271lr(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A03);
        C008805h.A0t(parcel, 2, this.A00);
        C008805h.A0t(parcel, 3, this.A01);
        C008805h.A0u(parcel, 4, this.A02);
        C008805h.A0r(parcel, A032);
    }
}
