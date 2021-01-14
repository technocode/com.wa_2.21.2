package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1m5  reason: invalid class name and case insensitive filesystem */
public final class C36381m5 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CS();
    public final AnonymousClass1CY A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    public C36381m5() {
        this.A00 = null;
        throw null;
    }

    public C36381m5(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        AnonymousClass1CY r1;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof AnonymousClass1CY) {
                r1 = (AnonymousClass1CY) queryLocalInterface;
            } else {
                r1 = new C36541mM(iBinder);
            }
            this.A00 = r1;
        } else {
            this.A00 = null;
        }
        this.A03 = intentFilterArr;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A032 = C008805h.A03(parcel, 20293);
        AnonymousClass1CY r0 = this.A00;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.asBinder();
        }
        C008805h.A0y(parcel, 2, asBinder);
        C008805h.A15(parcel, 3, this.A03, i);
        C008805h.A10(parcel, 4, this.A01, false);
        C008805h.A10(parcel, 5, this.A02, false);
        C008805h.A0r(parcel, A032);
    }
}
