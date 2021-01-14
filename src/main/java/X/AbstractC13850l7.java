package X;

/* renamed from: X.0l7  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC13850l7 {
    public boolean A00(AbstractC29771aA r2, C13890lB r3, C13890lB r4) {
        if (!(this instanceof C29761a9)) {
            return ((C29751a8) this).A00.compareAndSet(r2, r3, r4);
        }
        synchronized (r2) {
            if (r2.listeners != r3) {
                return false;
            }
            r2.listeners = r4;
            return true;
        }
    }

    public boolean A01(AbstractC29771aA r2, C13900lC r3, C13900lC r4) {
        if (!(this instanceof C29761a9)) {
            return ((C29751a8) this).A04.compareAndSet(r2, r3, r4);
        }
        synchronized (r2) {
            if (r2.waiters != r3) {
                return false;
            }
            r2.waiters = r4;
            return true;
        }
    }

    public boolean A02(AbstractC29771aA r2, Object obj, Object obj2) {
        if (!(this instanceof C29761a9)) {
            return ((C29751a8) this).A01.compareAndSet(r2, obj, obj2);
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
