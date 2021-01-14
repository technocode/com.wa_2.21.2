package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.MultiNetworkCallback;
import com.whatsapp.voipcalling.Voip;
import java.net.DatagramSocket;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.39E  reason: invalid class name */
public class AnonymousClass39E {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final AnonymousClass39B A05;
    public final ScheduledExecutorService A06;

    public AnonymousClass39E(ConnectivityManager connectivityManager) {
        AnonymousClass39B r1 = new AnonymousClass39B();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A06 = newSingleThreadScheduledExecutor;
    }

    public /* synthetic */ void A00() {
        AnonymousClass00E.A08(this.A03, "provider must not have already shutdown");
        if (!this.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        A03(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        this.A03 = false;
    }

    public /* synthetic */ void A01() {
        AnonymousClass00E.A08(!this.A03, "provider must not have already started");
        if (this.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(this));
        this.A03 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.net.Network r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39E.A02(android.net.Network, boolean):void");
    }

    public final void A03(boolean z) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }

    public /* synthetic */ void A04(boolean z) {
        if (!this.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            A03(z);
        }
    }

    public /* synthetic */ void A05(boolean z, boolean z2) {
        String str;
        String str2;
        if (!this.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (this.A01 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/weak-wifi/re-use-alt-network: ");
            if (z) {
                str = "cellular";
            } else {
                str = "wifi";
            }
            A0S.append(str);
            A0S.append("; test_network_cond=");
            if (z2) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            AnonymousClass008.A1U(A0S, str2);
            if (this.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                if (this.A05 != null) {
                    Voip.notifyFailureToCreateAlternativeSocket(z2);
                    return;
                }
                throw null;
            }
            A02(this.A01, z2);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z) {
                builder.addTransportType(0);
                Log.i("voip/weak-wifi/alt-network: cellular");
            } else {
                builder.addTransportType(1);
                Log.i("voip/weak-wifi/alt-network: wifi");
            }
            builder.addCapability(12);
            this.A00 = new AnonymousClass39D(this, this.A06.schedule(new AnonymousClass39C(this, z2), 5000, TimeUnit.MILLISECONDS), z2);
            if (Build.VERSION.SDK_INT >= 26) {
                this.A04.requestNetwork(builder.build(), this.A00, 5000);
            } else {
                this.A04.requestNetwork(builder.build(), this.A00);
            }
        }
    }
}
