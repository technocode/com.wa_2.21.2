package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.0Mx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC05040Mx<E> extends AbstractList<E> implements AbstractC04120Jd<E> {
    public boolean A00 = true;

    public void A00() {
        if (!this.A00) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(Object obj) {
        A00();
        return super.add(obj);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection collection) {
        A00();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        A00();
        return super.addAll(collection);
    }

    public void clear() {
        A00();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        A00();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        A00();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        A00();
        return super.retainAll(collection);
    }
}
