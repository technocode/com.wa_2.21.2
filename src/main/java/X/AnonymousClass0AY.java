package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0AY  reason: invalid class name */
public class AnonymousClass0AY implements Iterator {
    public int A00;
    public boolean A01;
    public final int A02;
    public final /* synthetic */ C003501s A03;

    public AnonymousClass0AY(C003501s r4) {
        this.A03 = r4;
        AnonymousClass00E.A0A(!r4.A00, "Nested iterations not allowed");
        r4.A00 = true;
        this.A02 = r4.A01.size();
    }

    public boolean hasNext() {
        if (this.A00 < this.A02) {
            return true;
        }
        if (this.A01) {
            return false;
        }
        this.A01 = true;
        C003501s r2 = this.A03;
        AnonymousClass00E.A0A(r2.A00, "Unexpected iteration state");
        r2.A00 = false;
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.A00;
        if (i < this.A02) {
            C003501s r1 = this.A03;
            this.A00 = i + 1;
            return r1.A01.get(i);
        }
        if (!this.A01) {
            this.A01 = true;
            C003501s r2 = this.A03;
            AnonymousClass00E.A0A(r2.A00, "Unexpected iteration state");
            r2.A00 = false;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
