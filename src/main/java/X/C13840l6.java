package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0l6  reason: invalid class name and case insensitive filesystem */
public final class C13840l6 implements Collection<V> {
    public final /* synthetic */ AbstractC06040Rm A00;

    public C13840l6(AbstractC06040Rm r1) {
        this.A00 = r1;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.A05();
    }

    public boolean contains(Object obj) {
        return this.A00.A03(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.A00.A01() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C06070Rp(this.A00, 1);
    }

    public boolean remove(Object obj) {
        AbstractC06040Rm r1 = this.A00;
        int A03 = r1.A03(obj);
        if (A03 < 0) {
            return false;
        }
        r1.A06(A03);
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        AbstractC06040Rm r5 = this.A00;
        int A01 = r5.A01();
        int i = 0;
        boolean z = false;
        while (i < A01) {
            if (collection.contains(r5.A04(i, 1))) {
                r5.A06(i);
                i--;
                A01--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        AbstractC06040Rm r5 = this.A00;
        int A01 = r5.A01();
        int i = 0;
        boolean z = false;
        while (i < A01) {
            if (!collection.contains(r5.A04(i, 1))) {
                r5.A06(i);
                i--;
                A01--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray() {
        AbstractC06040Rm r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i = 0; i < A01; i++) {
            objArr[i] = r5.A04(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.A00.A07(objArr, 1);
    }
}
