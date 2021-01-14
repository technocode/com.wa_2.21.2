package X;

import android.net.Network;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.37s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC672337s extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Network A00;
    public final /* synthetic */ AnonymousClass39D A01;
    public final /* synthetic */ ScheduledFuture A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ RunnableC672337s(AnonymousClass39D r1, ScheduledFuture scheduledFuture, Network network, boolean z) {
        this.A01 = r1;
        this.A02 = scheduledFuture;
        this.A00 = network;
        this.A03 = z;
    }

    public final void run() {
        this.A01.A01(this.A02, this.A00, this.A03);
    }
}
