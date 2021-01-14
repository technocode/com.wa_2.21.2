package X;

import java.util.concurrent.Executor;

/* renamed from: X.093  reason: invalid class name */
public final /* synthetic */ class AnonymousClass093 implements Executor {
    public final /* synthetic */ AnonymousClass02M A00;

    public /* synthetic */ AnonymousClass093(AnonymousClass02M r1) {
        this.A00 = r1;
    }

    public final void execute(Runnable runnable) {
        this.A00.A02.post(runnable);
    }
}
