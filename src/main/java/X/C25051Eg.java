package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.1Eg  reason: invalid class name and case insensitive filesystem */
public final class C25051Eg {
    public final Messenger A00;
    public final AnonymousClass1Et A01;

    public C25051Eg(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.A01 = new AnonymousClass1Et(iBinder);
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
