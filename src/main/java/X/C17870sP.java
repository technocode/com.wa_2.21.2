package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.0sP  reason: invalid class name and case insensitive filesystem */
public class C17870sP extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass1d0 A00;

    public C17870sP(AnonymousClass1d0 r1) {
        this.A00 = r1;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC17610rq.A00().A02(AnonymousClass1d0.A03, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
        AnonymousClass1d0 r1 = this.A00;
        r1.A04(r1.A05());
    }

    public void onLost(Network network) {
        AbstractC17610rq.A00().A02(AnonymousClass1d0.A03, "Network connection lost", new Throwable[0]);
        AnonymousClass1d0 r1 = this.A00;
        r1.A04(r1.A05());
    }
}
