package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.01s  reason: invalid class name and case insensitive filesystem */
public class C003501s implements Iterable {
    public boolean A00;
    public final List A01 = new ArrayList();

    public void A00(Object obj) {
        if (!this.A00) {
            this.A01.add(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Observer ");
        sb.append(obj);
        sb.append(" added during iteration");
        throw new ConcurrentModificationException(sb.toString());
    }

    public boolean A01(Object obj) {
        List list = this.A01;
        if (!list.contains(obj)) {
            return false;
        }
        if (!this.A00) {
            list.remove(obj);
            return true;
        }
        StringBuilder sb = new StringBuilder("Observer ");
        sb.append(obj);
        sb.append(" removed during iteration");
        throw new ConcurrentModificationException(sb.toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass0AY(this);
    }
}
