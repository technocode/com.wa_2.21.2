package X;

import android.content.BroadcastReceiver;

/* renamed from: X.1Ek  reason: invalid class name */
public final class AnonymousClass1Ek extends BroadcastReceiver {
    public RunnableEBaseShape0S0300100_I0 A00;

    public AnonymousClass1Ek(RunnableEBaseShape0S0300100_I0 runnableEBaseShape0S0300100_I0) {
        this.A00 = runnableEBaseShape0S0300100_I0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.RunnableEBaseShape0S0300100_I0 r0 = r3.A00
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r1 = r0.A00()
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x0020
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0020
            boolean r1 = r0.isConnected()
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            return
        L_0x0024:
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Connectivity changed. Starting background sync."
            android.util.Log.d(r1, r0)
        L_0x0031:
            java.lang.RunnableEBaseShape0S0300100_I0 r2 = r3.A00
            r0 = 0
            com.google.firebase.iid.FirebaseInstanceId.A02(r2, r0)
            java.lang.RunnableEBaseShape0S0300100_I0 r0 = r3.A00
            android.content.Context r0 = r0.A00()
            r0.unregisterReceiver(r3)
            r0 = 0
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ek.onReceive(android.content.Context, android.content.Intent):void");
    }
}
