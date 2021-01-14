package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.2V0  reason: invalid class name */
public class AnonymousClass2V0 extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ AnonymousClass0G5 A01;

    public AnonymousClass2V0(AnonymousClass0G5 r1) {
        this.A01 = r1;
    }

    public final void A00(Network network) {
        if (this.A00 == null) {
            return;
        }
        if (network == null || network.equals(this.A00)) {
            this.A00 = null;
            this.A01.A01(false, -1, false, false);
        }
    }

    public void onAvailable(Network network) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onAvailable:");
        sb.append(network);
        sb.append(" handle:");
        sb.append(network.getNetworkHandle());
        Log.i(sb.toString());
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        sb.append(network);
        sb.append(" blocked:");
        sb.append(z);
        sb.append(" handle:");
        sb.append(network.getNetworkHandle());
        Log.i(sb.toString());
        if (z) {
            A00(network);
            return;
        }
        this.A00 = network;
        AnonymousClass0G5 r0 = this.A01;
        r0.A01(true, network.getNetworkHandle(), r0.A02(network), false);
    }

    public void onLost(Network network) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onLost:");
        sb.append(network);
        Log.i(sb.toString());
        A00(network);
    }

    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00(null);
    }
}
