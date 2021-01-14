package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3aO  reason: invalid class name and case insensitive filesystem */
public class C74233aO implements AnonymousClass2L5 {
    public final /* synthetic */ long A00 = 10000000;
    public final /* synthetic */ C43901zB A01;
    public final /* synthetic */ AnonymousClass347 A02;
    public final /* synthetic */ AtomicBoolean A03;

    @Override // X.AnonymousClass2L5
    public void AE1(AnonymousClass2L4 r1) {
    }

    @Override // X.AnonymousClass2L5
    public void AEt(AnonymousClass02N r1, C28481Um r2) {
    }

    public C74233aO(AnonymousClass347 r3, C43901zB r4, AtomicBoolean atomicBoolean) {
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = atomicBoolean;
    }

    @Override // X.AnonymousClass2L5
    public void AE0(AnonymousClass2L3 r6) {
        Iterator it = r6.A00.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AnonymousClass1VD) it.next()).A00.A0G;
        }
        C43901zB r2 = this.A01;
        long j2 = this.A00;
        r2.A01 = Long.valueOf((j / j2) * j2);
        this.A03.set(true);
        this.A02.A08.A07.remove(this);
    }
}
