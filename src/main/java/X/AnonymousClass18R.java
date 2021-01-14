package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.18R  reason: invalid class name */
public final class AnonymousClass18R implements ServiceConnection {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final C238717x A04;
    public final Set A05 = new HashSet();
    public final /* synthetic */ C35331kA A06;

    public AnonymousClass18R(C35331kA r2, C238717x r3) {
        this.A06 = r2;
        this.A04 = r3;
    }

    public final void A00() {
        this.A00 = 3;
        C35331kA r4 = this.A06;
        Context context = r4.A02;
        C238717x r2 = this.A04;
        boolean A012 = C239618g.A01(context, r2.A00(), this, r2.A00);
        this.A03 = A012;
        if (A012) {
            Handler handler = r4.A03;
            handler.sendMessageDelayed(handler.obtainMessage(1, r2), 300000);
            return;
        }
        this.A00 = 2;
        try {
            if (r4.A04 != null) {
                context.unbindService(this);
                return;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C35331kA r0 = this.A06;
        synchronized (r0.A05) {
            r0.A03.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            for (ServiceConnection serviceConnection : this.A05) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C35331kA r0 = this.A06;
        synchronized (r0.A05) {
            r0.A03.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            for (ServiceConnection serviceConnection : this.A05) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
