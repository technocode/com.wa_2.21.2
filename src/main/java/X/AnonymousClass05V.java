package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05V  reason: invalid class name */
public class AnonymousClass05V<K, V> extends AnonymousClass05W<K, V> implements Map<K, V> {
    public AbstractC06040Rm A00;

    public AnonymousClass05V() {
    }

    public AnonymousClass05V(int i) {
        super(i);
    }

    public AnonymousClass05V(AnonymousClass05W r1) {
        if (r1 != null) {
            A08(r1);
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        AbstractC06040Rm r1 = this.A00;
        if (r1 == null) {
            r1 = new C29741a7(this);
            this.A00 = r1;
        }
        C13820l4 r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        C13820l4 r02 = new C13820l4(r1);
        r1.A00 = r02;
        return r02;
    }

    @Override // java.util.Map
    public Set keySet() {
        AbstractC06040Rm r1 = this.A00;
        if (r1 == null) {
            r1 = new C29741a7(this);
            this.A00 = r1;
        }
        C06050Rn r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        C06050Rn r02 = new C06050Rn(r1);
        r1.A01 = r02;
        return r02;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        A06(map.size() + super.A00);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        AbstractC06040Rm r1 = this.A00;
        if (r1 == null) {
            r1 = new C29741a7(this);
            this.A00 = r1;
        }
        C13840l6 r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C13840l6 r02 = new C13840l6(r1);
        r1.A02 = r02;
        return r02;
    }
}
