package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1FF  reason: invalid class name */
public class AnonymousClass1FF implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AnonymousClass071 A02;

    public AnonymousClass1FF(AnonymousClass071 r2) {
        this.A02 = r2;
        this.A01 = ((AnonymousClass072) r2).bytes.length;
    }

    public boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            AnonymousClass071 r2 = this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return Byte.valueOf(((AnonymousClass072) r2).bytes[i]);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
