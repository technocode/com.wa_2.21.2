package androidx.work;

import X.AnonymousClass0s1;
import X.C17550rj;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public int A00;
    public C17550rj A01;
    public AnonymousClass0s1 A02;
    public UUID A03;
    public Executor A04;

    public WorkerParameters(UUID uuid, C17550rj r3, Collection collection, int i, Executor executor, AnonymousClass0s1 r7) {
        this.A03 = uuid;
        this.A01 = r3;
        new HashSet(collection);
        this.A00 = i;
        this.A04 = executor;
        this.A02 = r7;
    }
}
