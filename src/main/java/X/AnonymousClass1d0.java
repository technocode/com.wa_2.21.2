package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: X.1d0  reason: invalid class name */
public class AnonymousClass1d0 extends AbstractC17850sN {
    public static final String A03 = AbstractC17610rq.A01("NetworkStateTracker");
    public C17860sO A00;
    public C17870sP A01;
    public final ConnectivityManager A02 = ((ConnectivityManager) super.A01.getSystemService("connectivity"));

    public AnonymousClass1d0(Context context, AnonymousClass0t5 r4) {
        super(context, r4);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A01 = new C17870sP(this);
        } else {
            this.A00 = new C17860sO(this);
        }
    }

    @Override // X.AbstractC17850sN
    public void A01() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        }
        if (z) {
            try {
                AbstractC17610rq.A00().A02(A03, "Registering network callback", new Throwable[0]);
                this.A02.registerDefaultNetworkCallback(this.A01);
            } catch (IllegalArgumentException e) {
                AbstractC17610rq.A00().A03(A03, "Received exception while unregistering network callback", e);
            }
        } else {
            AbstractC17610rq.A00().A02(A03, "Registering broadcast receiver", new Throwable[0]);
            super.A01.registerReceiver(this.A00, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // X.AbstractC17850sN
    public void A02() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        }
        if (z) {
            try {
                AbstractC17610rq.A00().A02(A03, "Unregistering network callback", new Throwable[0]);
                this.A02.unregisterNetworkCallback(this.A01);
            } catch (IllegalArgumentException e) {
                AbstractC17610rq.A00().A03(A03, "Received exception while unregistering network callback", e);
            }
        } else {
            AbstractC17610rq.A00().A02(A03, "Unregistering broadcast receiver", new Throwable[0]);
            super.A01.unregisterReceiver(this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1.hasCapability(16) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.isConnected() == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C17810sJ A05() {
        /*
            r7 = this;
            android.net.ConnectivityManager r6 = r7.A02
            android.net.NetworkInfo r5 = r6.getActiveNetworkInfo()
            r4 = 1
            if (r5 == 0) goto L_0x0010
            boolean r0 = r5.isConnected()
            r3 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002a
            android.net.Network r0 = r6.getActiveNetwork()
            android.net.NetworkCapabilities r1 = r6.getNetworkCapabilities(r0)
            if (r1 == 0) goto L_0x002a
            r0 = 16
            boolean r0 = r1.hasCapability(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            boolean r1 = r6.isActiveNetworkMetered()
            if (r5 == 0) goto L_0x003d
            boolean r0 = r5.isRoaming()
            if (r0 != 0) goto L_0x003d
        L_0x0037:
            X.0sJ r0 = new X.0sJ
            r0.<init>(r3, r2, r1, r4)
            return r0
        L_0x003d:
            r4 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1d0.A05():X.0sJ");
    }
}
