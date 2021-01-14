package X;

import java.util.Iterator;

/* renamed from: X.0fs  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11200fs implements Iterator, AbstractC07140Wb {
    public AnonymousClass0SN A00;
    public AnonymousClass0SN A01;

    public AbstractC11200fs(AnonymousClass0SN r1, AnonymousClass0SN r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    @Override // X.AbstractC07140Wb
    public void AQN(AnonymousClass0SN r5) {
        AnonymousClass0SN r3 = this.A00;
        AnonymousClass0SN r2 = r3;
        AnonymousClass0SN r0 = null;
        if (r3 == r5 && r5 == this.A01) {
            this.A01 = null;
            this.A00 = null;
            r3 = null;
            r2 = null;
        }
        if (r3 == r5) {
            if (!(this instanceof AnonymousClass23W)) {
                r2 = r3.A01;
            } else {
                r2 = r3.A00;
            }
            this.A00 = r2;
        }
        AnonymousClass0SN r1 = this.A01;
        if (r1 == r5) {
            if (!(r1 == r2 || r2 == null)) {
                r0 = !(this instanceof AnonymousClass23W) ? r1.A00 : r1.A01;
            }
            this.A01 = r0;
        }
    }

    public boolean hasNext() {
        return this.A01 != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        AnonymousClass0SN r0;
        AnonymousClass0SN r1 = this.A01;
        AnonymousClass0SN r02 = this.A00;
        if (r1 == r02 || r02 == null) {
            r0 = null;
        } else if (!(this instanceof AnonymousClass23W)) {
            r0 = r1.A00;
        } else {
            r0 = r1.A01;
        }
        this.A01 = r0;
        return r1;
    }
}
