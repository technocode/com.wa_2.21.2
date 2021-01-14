package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1k3  reason: invalid class name and case insensitive filesystem */
public final class C35261k3 extends C241619e implements AnonymousClass18L {
    public C35261k3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // X.AnonymousClass18L
    public final void ART(AnonymousClass18K r5) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r5 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r5.asBinder());
        }
        try {
            this.A00.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
