package X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1YF  reason: invalid class name */
public abstract class AnonymousClass1YF {
    public final Set A00 = new CopyOnWriteArraySet();

    public void A00(Object obj) {
        if (obj == null) {
            throw null;
        } else if (!this.A00.add(obj)) {
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" is already registered.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A01(Object obj) {
        if (obj == null) {
            throw null;
        } else if (!this.A00.remove(obj)) {
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" was not registered.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
