package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1AM  reason: invalid class name */
public class AnonymousClass1AM implements IInterface {
    public final IBinder A00;
    public final String A01;

    public AnonymousClass1AM(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
