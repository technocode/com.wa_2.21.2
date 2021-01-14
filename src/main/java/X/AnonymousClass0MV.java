package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.0MV  reason: invalid class name */
public final class AnonymousClass0MV extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;

    public AnonymousClass0MV(int i) {
        this.A00 = i;
    }

    public void run() {
        Execution.nativeStartExecutor(this.A00);
    }
}
