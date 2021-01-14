package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0l4  reason: invalid class name and case insensitive filesystem */
public final class C13820l4 implements Set {
    public final /* synthetic */ AbstractC06040Rm A00;

    public C13820l4(AbstractC06040Rm r1) {
        this.A00 = r1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        AbstractC06040Rm r5 = this.A00;
        int A01 = r5.A01();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(r5 instanceof C06030Rl)) {
                ((C29741a7) r5).A00.put(key, value);
            } else {
                ((C06030Rl) r5).A00.add(key);
            }
        }
        return A01 != r5.A01();
    }

    public void clear() {
        this.A00.A05();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AbstractC06040Rm r2 = this.A00;
        int A02 = r2.A02(entry.getKey());
        if (A02 < 0) {
            return false;
        }
        Object A04 = r2.A04(A02, 1);
        Object value = entry.getValue();
        if (A04 == value) {
            return true;
        }
        if (A04 == null || !A04.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        AbstractC06040Rm r6 = this.A00;
        int i = 0;
        for (int A01 = r6.A01() - 1; A01 >= 0; A01--) {
            Object A04 = r6.A04(A01, 0);
            Object A042 = r6.A04(A01, 1);
            if (A04 == null) {
                hashCode = 0;
            } else {
                hashCode = A04.hashCode();
            }
            if (A042 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = A042.hashCode();
            }
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public boolean isEmpty() {
        return this.A00.A01() == 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator iterator() {
        return new C13830l5(this.A00);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
