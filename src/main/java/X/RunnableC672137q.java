package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.37q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC672137q extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass39D A00;
    public final /* synthetic */ ScheduledFuture A01;

    public /* synthetic */ RunnableC672137q(AnonymousClass39D r1, ScheduledFuture scheduledFuture) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
    }

    public final void run() {
        this.A00.A00(this.A01);
    }
}
