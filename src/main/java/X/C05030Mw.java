package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Mw  reason: invalid class name and case insensitive filesystem */
public final class C05030Mw<E> extends AbstractC05040Mx<E> {
    public static final C05030Mw A01;
    public final List A00;

    static {
        C05030Mw r1 = new C05030Mw();
        A01 = r1;
        ((AbstractC05040Mx) r1).A00 = false;
    }

    public C05030Mw() {
        this.A00 = new ArrayList(10);
    }

    public C05030Mw(List list) {
        this.A00 = list;
    }

    @Override // X.AbstractC04120Jd
    public AbstractC04120Jd ACC(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.A00);
            return new C05030Mw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, Object obj) {
        A00();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public Object remove(int i) {
        A00();
        Object remove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object set(int i, Object obj) {
        A00();
        Object obj2 = this.A00.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    public int size() {
        return this.A00.size();
    }
}
