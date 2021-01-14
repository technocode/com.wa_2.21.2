package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1ff  reason: invalid class name and case insensitive filesystem */
public class C32821ff implements AbstractC20520wq {
    public final Executor A00;
    public final Executor A01 = Executors.newFixedThreadPool(1, new ThreadFactoryC20590wx("FrescoLightWeightBackgroundExecutor"));

    public C32821ff(int i) {
        Executors.newFixedThreadPool(2, new ThreadFactoryC20590wx("FrescoIoBoundExecutor"));
        this.A00 = Executors.newFixedThreadPool(i, new ThreadFactoryC20590wx("FrescoDecodeExecutor"));
        Executors.newFixedThreadPool(i, new ThreadFactoryC20590wx("FrescoBackgroundExecutor"));
    }

    @Override // X.AbstractC20520wq
    public Executor A4M() {
        return this.A00;
    }

    @Override // X.AbstractC20520wq
    public Executor A4N() {
        return this.A01;
    }
}
