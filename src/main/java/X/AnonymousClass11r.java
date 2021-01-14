package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.11r  reason: invalid class name */
public abstract class AnonymousClass11r extends Binder implements IInterface {
    public static AbstractC224611t globalInterceptor;

    public IBinder asBinder() {
        return this;
    }

    public abstract boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2);

    public AnonymousClass11r(String str) {
        attachInterface(this, str);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(AbstractC224611t r3) {
        synchronized (AnonymousClass11r.class) {
            if (r3 != null) {
                globalInterceptor = r3;
            } else {
                throw new IllegalArgumentException("null interceptor");
            }
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }

    public boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
