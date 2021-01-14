package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Rp  reason: invalid class name and case insensitive filesystem */
public final class C06070Rp implements Iterator {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC06040Rm A04;

    public C06070Rp(AbstractC06040Rm r2, int i) {
        this.A04 = r2;
        this.A03 = i;
        this.A01 = r2.A01();
    }

    public boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            AbstractC06040Rm r1 = this.A04;
            int i = this.A00;
            Object A042 = r1.A04(i, this.A03);
            this.A00 = i + 1;
            this.A02 = true;
            return A042;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.A02) {
            int i = this.A00 - 1;
            this.A00 = i;
            this.A01--;
            this.A02 = false;
            this.A04.A06(i);
            return;
        }
        throw new IllegalStateException();
    }
}
