package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1vN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41631vN implements AbstractC27521Qi {
    public final /* synthetic */ AtomicLong A00;

    public /* synthetic */ C41631vN(AtomicLong atomicLong) {
        this.A00 = atomicLong;
    }

    @Override // X.AbstractC27521Qi
    public final void AEp(long j) {
        this.A00.addAndGet(j);
    }
}
