package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.1iu  reason: invalid class name and case insensitive filesystem */
public final class C34631iu extends AnonymousClass19O implements AbstractC235316f {
    public C34631iu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // X.AbstractC235316f
    public final void ASG(AbstractC235216e r6, GoogleSignInOptions googleSignInOptions) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r6 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r6.asBinder());
        }
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(103, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
