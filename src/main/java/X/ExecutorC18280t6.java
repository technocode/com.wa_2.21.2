package X;

import java.util.concurrent.Executor;

/* renamed from: X.0t6  reason: invalid class name and case insensitive filesystem */
public class ExecutorC18280t6 implements Executor {
    public final /* synthetic */ C31581dS A00;

    public ExecutorC18280t6(C31581dS r1) {
        this.A00 = r1;
    }

    public void execute(Runnable runnable) {
        this.A00.A00.post(runnable);
    }
}
