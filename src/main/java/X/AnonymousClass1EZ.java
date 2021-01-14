package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1EZ  reason: invalid class name */
public class AnonymousClass1EZ extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public AnonymousClass1EZ(Context context) {
        this.A00 = context;
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (AnonymousClass05T.A09) {
            for (AnonymousClass05T r0 : AnonymousClass05T.A0E.values()) {
                r0.A04();
            }
        }
        this.A00.unregisterReceiver(this);
    }
}
