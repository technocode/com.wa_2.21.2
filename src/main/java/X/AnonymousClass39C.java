package X;

import android.net.ConnectivityManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.39C  reason: invalid class name */
public class AnonymousClass39C extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass39E A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass39C(AnonymousClass39E r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void run() {
        AnonymousClass39E r3 = this.A00;
        ConnectivityManager.NetworkCallback networkCallback = r3.A00;
        if (networkCallback == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r3.A04.unregisterNetworkCallback(networkCallback);
        r3.A00 = null;
        r3.A01 = null;
        AnonymousClass39B r1 = r3.A05;
        boolean z = this.A01;
        if (r1 != null) {
            Voip.notifyFailureToCreateAlternativeSocket(z);
            return;
        }
        throw null;
    }
}
