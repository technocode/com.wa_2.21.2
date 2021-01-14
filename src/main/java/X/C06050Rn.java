package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0Rn  reason: invalid class name and case insensitive filesystem */
public final class C06050Rn implements Set {
    public final /* synthetic */ AbstractC06040Rm A00;

    public C06050Rn(AbstractC06040Rm r1) {
        this.A00 = r1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.A05();
    }

    public boolean contains(Object obj) {
        return this.A00.A02(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        AbstractC06040Rm r1 = this.A00;
        if (!(r1 instanceof C06030Rl)) {
            AnonymousClass05V r2 = ((C29741a7) r1).A00;
            for (Object obj : collection) {
                if (!r2.containsKey(obj)) {
                    return false;
                }
            }
            return true;
        }
        throw new UnsupportedOperationException("not a map");
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
        AbstractC06040Rm r4 = this.A00;
        int i = 0;
        for (int A01 = r4.A01() - 1; A01 >= 0; A01--) {
            Object A04 = r4.A04(A01, 0);
            if (A04 == null) {
                hashCode = 0;
            } else {
                hashCode = A04.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public boolean isEmpty() {
        return this.A00.A01() == 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator iterator() {
        return new C06070Rp(this.A00, 0);
    }

    public boolean remove(Object obj) {
        AbstractC06040Rm r1 = this.A00;
        int A02 = r1.A02(obj);
        if (A02 < 0) {
            return false;
        }
        r1.A06(A02);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        AbstractC06040Rm r1 = this.A00;
        if (!(r1 instanceof C06030Rl)) {
            AnonymousClass05V r3 = ((C29741a7) r1).A00;
            int size = r3.size();
            for (Object obj : collection) {
                r3.remove(obj);
            }
            return size != r3.size();
        }
        throw new UnsupportedOperationException("not a map");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        AbstractC06040Rm r1 = this.A00;
        if (!(r1 instanceof C06030Rl)) {
            return AbstractC06040Rm.A00(((C29741a7) r1).A00, collection);
        }
        throw new UnsupportedOperationException("not a map");
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        AbstractC06040Rm r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i = 0; i < A01; i++) {
            objArr[i] = r5.A04(i, 0);
        }
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return this.A00.A07(objArr, 0);
    }
}
