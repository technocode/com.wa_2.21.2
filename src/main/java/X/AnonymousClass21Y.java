package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.21Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass21Y implements AbstractC02170Ax {
    public static final /* synthetic */ AnonymousClass21Y A00 = new AnonymousClass21Y();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        if (C28651Vf.A06 == null) {
            synchronized (C28651Vf.class) {
                if (C28651Vf.A06 == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    C28821Vw A002 = C28821Vw.A00();
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
                    C28841Vy A003 = C28841Vy.A00();
                    if (C28851Vz.A01 == null) {
                        synchronized (C28851Vz.class) {
                            if (C28851Vz.A01 == null) {
                                C28841Vy.A00();
                                C28851Vz.A01 = new C28851Vz(r4);
                            }
                        }
                    }
                    C28851Vz r8 = C28851Vz.A01;
                    AbstractC28721Vm r9 = AbstractC28721Vm.A00;
                    if (r9 != null) {
                        C28651Vf.A06 = new C28651Vf(r4, A002, newFixedThreadPool, A003, r8, r9);
                    } else {
                        throw null;
                    }
                }
            }
        }
        C28651Vf r3 = C28651Vf.A06;
        if (C447421h.A01 == null) {
            synchronized (C447421h.class) {
                if (C447421h.A01 == null) {
                    C447421h.A01 = new C447421h(C28701Vk.A00());
                }
            }
        }
        C447421h r42 = C447421h.A01;
        C28841Vy A004 = C28841Vy.A00();
        if (C447721k.A01 == null) {
            synchronized (C447721k.class) {
                if (C447721k.A01 == null) {
                    C447721k.A01 = new C447721k(C28711Vl.A00());
                }
            }
        }
        C447721k r6 = C447721k.A01;
        C447621j A005 = C447621j.A00();
        if (C447521i.A05 == null) {
            synchronized (C447521i.class) {
                if (C447521i.A05 == null) {
                    C447521i.A05 = new C447521i(AnonymousClass01I.A00(), AnonymousClass01A.A00(), C014308b.A00(), C28701Vk.A00(), C28691Vj.A00());
                }
            }
        }
        C447521i r82 = C447521i.A05;
        if (C447321g.A00 == null) {
            synchronized (C447321g.class) {
                if (C447321g.A00 == null) {
                    C447321g.A00 = new C447321g();
                }
            }
        }
        return new C447821l(r3, r42, A004, r6, A005, r82, C447321g.A00);
    }
}
