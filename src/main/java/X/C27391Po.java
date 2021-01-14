package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.1Po  reason: invalid class name and case insensitive filesystem */
public class C27391Po extends FutureTask {
    public final /* synthetic */ AbstractRunnableC459527e A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27391Po(AbstractRunnableC459527e r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        AbstractRunnableC459527e r2 = this.A00;
        if (r2.A02.isCancelled()) {
            r2.A00.A04(Boolean.TRUE);
        }
        r2.A01.countDown();
    }
}
