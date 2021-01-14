package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kz  reason: invalid class name and case insensitive filesystem */
public final class C35821kz extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1AT();
    public int A00;
    public PendingIntent A01;
    public AnonymousClass1AO A02;
    public C35811ky A03;
    public AnonymousClass1Aw A04;
    public AnonymousClass1Ax A05;

    public C35821kz(int i, C35811ky r5, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        AnonymousClass1Ax r1;
        AnonymousClass1Aw r12;
        this.A00 = i;
        this.A03 = r5;
        AnonymousClass1AO r2 = null;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            r1 = queryLocalInterface instanceof AnonymousClass1Ax ? (AnonymousClass1Ax) queryLocalInterface : new C35911lG(iBinder);
        }
        this.A05 = r1;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            r12 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            r12 = queryLocalInterface2 instanceof AnonymousClass1Aw ? (AnonymousClass1Aw) queryLocalInterface2 : new C35901lF(iBinder2);
        }
        this.A04 = r12;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            r2 = queryLocalInterface3 instanceof AnonymousClass1AO ? (AnonymousClass1AO) queryLocalInterface3 : new C35781kv(iBinder3);
        }
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A0z(parcel, 2, this.A03, i, false);
        AnonymousClass1Ax r0 = this.A05;
        IBinder iBinder = null;
        if (r0 == null) {
            asBinder = null;
        } else {
            asBinder = r0.asBinder();
        }
        C008805h.A0y(parcel, 3, asBinder);
        C008805h.A0z(parcel, 4, this.A01, i, false);
        AnonymousClass1Aw r02 = this.A04;
        if (r02 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = r02.asBinder();
        }
        C008805h.A0y(parcel, 5, asBinder2);
        AnonymousClass1AO r03 = this.A02;
        if (r03 != null) {
            iBinder = r03.asBinder();
        }
        C008805h.A0y(parcel, 6, iBinder);
        C008805h.A0r(parcel, A032);
    }
}
