package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.39D  reason: invalid class name */
public class AnonymousClass39D extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass39E A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass39D(AnonymousClass39E r1, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public void A00(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        AnonymousClass39E r1 = this.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else if (r1.A05 != null) {
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            throw null;
        }
    }

    public void A01(ScheduledFuture scheduledFuture, Network network, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass39E r1 = this.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (r1.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            if (r1.A05 != null) {
                Voip.notifyLostOfAlternativeNetwork();
                return;
            }
            throw null;
        } else {
            r1.A02(network, z);
        }
    }

    public void A02(ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass39E r2 = this.A00;
        if (r2.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r2.A00 = null;
        r2.A01 = null;
        if (r2.A05 != null) {
            Voip.notifyFailureToCreateAlternativeSocket(z);
            return;
        }
        throw null;
    }

    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC672337s(this, this.A01, network, this.A02));
        }
    }

    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC672137q(this, this.A01));
        }
    }

    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC672237r(this, this.A01, this.A02));
        }
    }
}
