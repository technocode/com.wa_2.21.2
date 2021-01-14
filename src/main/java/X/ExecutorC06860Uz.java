package X;

import java.util.concurrent.Executor;

/* renamed from: X.0Uz  reason: invalid class name and case insensitive filesystem */
public final class ExecutorC06860Uz implements Executor {
    public void execute(Runnable runnable) {
        AbstractC06850Uy r1 = C06840Ux.A00().A01;
        if (!(r1 instanceof AnonymousClass0V0)) {
            ((C06840Ux) r1).A01.A00(runnable);
        } else {
            ((AnonymousClass0V0) r1).A01.execute(runnable);
        }
    }
}
