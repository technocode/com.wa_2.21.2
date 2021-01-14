package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.37r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC672237r extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass39D A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ RunnableC672237r(AnonymousClass39D r1, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public final void run() {
        this.A00.A02(this.A01, this.A02);
    }
}
