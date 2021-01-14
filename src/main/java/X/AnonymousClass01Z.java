package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.01Z  reason: invalid class name */
public final class AnonymousClass01Z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C30951cH A04 = new C30951cH();
    public final AnonymousClass0s1 A05 = new C31071cV();
    public final Executor A06 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    public final Executor A07 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    public AnonymousClass01Z(AnonymousClass01Y r3) {
        this.A00 = r3.A00;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A02 = 20;
    }
}
