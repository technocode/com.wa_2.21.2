package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.15h  reason: invalid class name and case insensitive filesystem */
public final class C233215h {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(Object obj) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C233115g r1 = (C233115g) it.next();
            if (r1.A02 == obj) {
                r1.A00 = true;
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
