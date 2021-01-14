package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41341us implements AbstractC27521Qi {
    public final /* synthetic */ AtomicLong A00;

    public /* synthetic */ C41341us(AtomicLong atomicLong) {
        this.A00 = atomicLong;
    }

    @Override // X.AbstractC27521Qi
    public final void AEp(long j) {
        this.A00.addAndGet(j);
    }
}
