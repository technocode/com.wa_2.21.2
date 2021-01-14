package X;

import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.0dH  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC09630dH {
    public final ThreadLocal A00 = new C09680dM(this);

    public Object A00() {
        if (this instanceof C09670dL) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        if (this instanceof C09660dK) {
            return new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        }
        if (this instanceof C09650dJ) {
            return new GregorianCalendar();
        }
        if (!(this instanceof C09640dI)) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
        }
        return new GregorianCalendar();
    }

    public synchronized Object A01() {
        Object obj;
        ThreadLocal threadLocal = this.A00;
        obj = ((WeakReference) threadLocal.get()).get();
        if (obj == null) {
            obj = A00();
            threadLocal.set(new WeakReference(obj));
        }
        return obj;
    }
}
