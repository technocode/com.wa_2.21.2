package X;

import java.util.Iterator;

/* renamed from: X.35P  reason: invalid class name */
public class AnonymousClass35P implements Iterable {
    public final int A00;
    public final Object[] A01;

    public AnonymousClass35P(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass35O(this.A01, this.A00);
    }
}
