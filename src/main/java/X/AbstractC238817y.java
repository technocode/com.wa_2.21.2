package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.17y  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC238817y {
    public static AbstractC238817y A00;
    public static final Object A01 = new Object();

    public static AbstractC238817y A00(Context context) {
        synchronized (A01) {
            if (A00 == null) {
                A00 = new C35331kA(context.getApplicationContext());
            }
        }
        return A00;
    }

    public void A01(C238717x r6, ServiceConnection serviceConnection, String str) {
        C35331kA r2 = (C35331kA) this;
        C001801b.A1R(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = r2.A05;
        synchronized (hashMap) {
            AnonymousClass18R r0 = (AnonymousClass18R) hashMap.get(r6);
            if (r0 != null) {
                Set set = r0.A05;
                if (set.contains(serviceConnection)) {
                    set.remove(serviceConnection);
                    if (set.isEmpty()) {
                        Handler handler = r2.A03;
                        handler.sendMessageDelayed(handler.obtainMessage(0, r6), 5000);
                    }
                } else {
                    String valueOf = String.valueOf(r6);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String valueOf2 = String.valueOf(r6);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public boolean A02(C238717x r5, ServiceConnection serviceConnection, String str) {
        boolean z;
        C35331kA r1 = (C35331kA) this;
        C001801b.A1R(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = r1.A05;
        synchronized (hashMap) {
            AnonymousClass18R r2 = (AnonymousClass18R) hashMap.get(r5);
            if (r2 == null) {
                r2 = new AnonymousClass18R(r1, r5);
                r2.A04.A00();
                r2.A05.add(serviceConnection);
                r2.A00();
                hashMap.put(r5, r2);
            } else {
                r1.A03.removeMessages(0, r5);
                Set set = r2.A05;
                if (!set.contains(serviceConnection)) {
                    r2.A04.A00();
                    set.add(serviceConnection);
                    int i = r2.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(r2.A01, r2.A02);
                    } else if (i == 2) {
                        r2.A00();
                    }
                } else {
                    String valueOf = String.valueOf(r5);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = r2.A03;
        }
        return z;
    }
}
