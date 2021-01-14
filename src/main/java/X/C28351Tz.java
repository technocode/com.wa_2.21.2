package X;

import java.util.Iterator;

/* renamed from: X.1Tz  reason: invalid class name and case insensitive filesystem */
public class C28351Tz implements Iterator {
    public final Iterator A00;

    public C28351Tz(Iterator it) {
        this.A00 = it;
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
