package X;

/* renamed from: X.0sy  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC18210sy {
    public boolean A00(AbstractC31571dR r2, C18250t2 r3, C18250t2 r4) {
        if (!(this instanceof C31561dQ)) {
            return ((C31551dP) this).A00.compareAndSet(r2, r3, r4);
        }
        synchronized (r2) {
            if (r2.listeners != r3) {
                return false;
            }
            r2.listeners = r4;
            return true;
        }
    }

    public boolean A01(AbstractC31571dR r2, C18260t3 r3, C18260t3 r4) {
        if (!(this instanceof C31561dQ)) {
            return ((C31551dP) this).A04.compareAndSet(r2, r3, r4);
        }
        synchronized (r2) {
            if (r2.waiters != r3) {
                return false;
            }
            r2.waiters = r4;
            return true;
        }
    }

    public boolean A02(AbstractC31571dR r2, Object obj, Object obj2) {
        if (!(this instanceof C31561dQ)) {
            return ((C31551dP) this).A01.compareAndSet(r2, obj, obj2);
        }
        synchronized (r2) {
            if (r2.value != obj) {
                return false;
            }
            r2.value = obj2;
            return true;
        }
    }
}
