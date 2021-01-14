package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.04w  reason: invalid class name */
public class AnonymousClass04w {
    public final List A00 = new CopyOnWriteArrayList();

    public void A00(AnonymousClass0NW r3) {
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
            return;
        }
        StringBuilder sb = new StringBuilder("Observer ");
        sb.append(r3);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }

    public void A01(Object obj) {
        for (AnonymousClass0NW r0 : this.A00) {
            r0.AFk(obj);
        }
    }
}
