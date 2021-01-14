package X;

import android.os.IBinder;
import android.os.Parcel;
import com.whatsapp.instrumentation.CallbackInterface;

/* renamed from: X.2gB  reason: invalid class name and case insensitive filesystem */
public class C55212gB implements CallbackInterface {
    public IBinder A00;

    public C55212gB(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // com.whatsapp.instrumentation.CallbackInterface
    public String A4m() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.whatsapp.instrumentation.CallbackInterface");
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.whatsapp.instrumentation.CallbackInterface
    public void AFl(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.whatsapp.instrumentation.CallbackInterface");
            obtain.writeString(str);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
