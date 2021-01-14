package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3MQ  reason: invalid class name */
public abstract class AnonymousClass3MQ implements AbstractC64972z6 {
    public final AnonymousClass00S A00;
    public final AnonymousClass3MM A01;
    public final AnonymousClass3MP A02;
    public final AbstractC64942z3 A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final ConcurrentNavigableMap A06 = new ConcurrentSkipListMap();
    public final AtomicInteger A07 = new AtomicInteger(0);

    public AnonymousClass3MQ(AnonymousClass00S r3, AnonymousClass3MP r4, AnonymousClass3MM r5, AbstractC64942z3 r6) {
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A03 = r6;
    }

    public long A00() {
        if (this.A00.A00 != null) {
            return System.nanoTime();
        }
        throw null;
    }

    public void A01() {
        AnonymousClass3ZE r0 = (AnonymousClass3ZE) this;
        r0.A01.ANH((Runnable) r0.A02.get(), "qpl_fs_writer");
    }

    public final void A02(ConcurrentMap concurrentMap, short s, int i, long j) {
        if (!concurrentMap.isEmpty()) {
            for (Map.Entry entry : concurrentMap.entrySet()) {
                C64912z0 r4 = (C64912z0) entry.getValue();
                if (r4 != null) {
                    if (i >= 0) {
                        if (r4.A02 + TimeUnit.MILLISECONDS.toNanos((long) i) >= j) {
                        }
                    }
                    C64912z0 r1 = (C64912z0) concurrentMap.remove(entry.getKey());
                    if (r1 != null) {
                        r1.A00(s, j);
                        this.A05.add(r1);
                        this.A07.decrementAndGet();
                    }
                }
            }
            A01();
        }
    }

    public final void A03(ConcurrentMap concurrentMap, short s, boolean z, long j) {
        C64912z0 r1;
        if (!concurrentMap.isEmpty()) {
            Iterator it = new HashSet(concurrentMap.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C64912z0 r0 = (C64912z0) concurrentMap.get(next);
                if (r0 != null && ((!z || r0.A0A) && (r1 = (C64912z0) concurrentMap.remove(next)) != null)) {
                    r1.A00(s, j);
                    this.A05.add(r1);
                    this.A07.decrementAndGet();
                }
            }
            A01();
        }
    }

    @Override // X.AbstractC64972z6
    public boolean AAJ() {
        return !this.A05.isEmpty();
    }
}
