package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
public final class ServiceConnectionC238117r implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ AbstractC238217s A01;

    public ServiceConnectionC238117r(AbstractC238217s r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker r1;
        boolean z = false;
        if (iBinder == null) {
            AbstractC238217s r4 = this.A01;
            synchronized (r4.A0K) {
                if (r4.A02 == 3) {
                    z = true;
                }
            }
            int i = 4;
            if (z) {
                i = 5;
                r4.A0D = true;
            }
            Handler handler = r4.A0G;
            handler.sendMessage(handler.obtainMessage(i, r4.A0C.get(), 16));
            return;
        }
        AbstractC238217s r5 = this.A01;
        synchronized (r5.A0L) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                r1 = new C35191jw(iBinder);
            } else {
                r1 = (IGmsServiceBroker) queryLocalInterface;
            }
            r5.A0A = r1;
        }
        int i2 = this.A00;
        Handler handler2 = r5.A0G;
        handler2.sendMessage(handler2.obtainMessage(7, i2, -1, new AnonymousClass268(r5, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC238217s r2 = this.A01;
        synchronized (r2.A0L) {
            r2.A0A = null;
        }
        Handler handler = r2.A0G;
        handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
    }
}
