package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.0G5  reason: invalid class name */
public class AnonymousClass0G5 implements AnonymousClass0G6 {
    public Handler A00;
    public AnonymousClass2V0 A01;
    public final AnonymousClass03P A02;
    public final C03270Fn A03;
    public final C03160Fa A04;

    public AnonymousClass0G5(AnonymousClass03P r1, C03160Fa r2, C03270Fn r3) {
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
    }

    public /* synthetic */ void A00() {
        boolean z;
        long j;
        AnonymousClass2V0 r0 = this.A01;
        if (r0 != null) {
            Network network = r0.A00;
            if (network != null) {
                z = true;
                j = network.getNetworkHandle();
            } else {
                z = false;
                j = -1;
            }
            A01(z, j, A02(network), true);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r9 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(boolean r6, long r7, boolean r9, boolean r10) {
        /*
            r5 = this;
            X.0Fn r0 = r5.A03
            r0.A01()
            X.0Fa r4 = r5.A04
            if (r6 == 0) goto L_0x000c
            r1 = 1
            if (r9 == 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            android.os.Handler r3 = r4.A0I
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r3, r0, r1, r0)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "networkId"
            r1.putLong(r0, r7)
            r3.sendMessage(r2)
            r4.A0C(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0G5.A01(boolean, long, boolean, boolean):void");
    }

    public final boolean A02(Network network) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager A0A = this.A02.A0A();
        if (A0A == null || network == null || (networkCapabilities = A0A.getNetworkCapabilities(network)) == null || !networkCapabilities.hasTransport(1) || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0G6
    public long A5m() {
        Network activeNetwork;
        ConnectivityManager A0A = this.A02.A0A();
        if (A0A == null || (activeNetwork = A0A.getActiveNetwork()) == null) {
            return -1;
        }
        return activeNetwork.getNetworkHandle();
    }

    @Override // X.AnonymousClass0G6
    public void AMr() {
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new RunnableEBaseShape3S0100000_I0_3(this, 21));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0G6
    public void AQ5(Handler handler) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A00 = handler;
        this.A01 = new AnonymousClass2V0(this);
        ConnectivityManager A0A = this.A02.A0A();
        if (A0A != null) {
            A0A.registerDefaultNetworkCallback(this.A01, handler);
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    @Override // X.AnonymousClass0G6
    public void AQG() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        ConnectivityManager A0A = this.A02.A0A();
        if (A0A != null) {
            A0A.unregisterNetworkCallback(this.A01);
        }
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.AnonymousClass0G6
    public boolean isConnected() {
        AnonymousClass2V0 r0 = this.A01;
        return (r0 == null || r0.A00 == null) ? false : true;
    }
}
