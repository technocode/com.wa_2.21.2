package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ca  reason: invalid class name and case insensitive filesystem */
public final class C24701Ca {
    public final Map A00 = new HashMap();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                if (!(iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService") instanceof AnonymousClass1CZ)) {
                    new C36551mN(iBinder);
                }
            }
            new AnonymousClass29L();
            for (Map.Entry entry : map.entrySet()) {
                entry.getValue();
                try {
                    new C36381m5();
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(entry.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32 + valueOf2.length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(valueOf);
                    sb.append("/");
                    sb.append(valueOf2);
                    Log.w("WearableClient", sb.toString());
                }
            }
        }
    }
}
