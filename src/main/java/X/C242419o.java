package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.19o  reason: invalid class name and case insensitive filesystem */
public final class C242419o extends WeakReference {
    public final int A00;

    public C242419o(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.A00 = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C242419o.class) {
            if (this == obj) {
                return true;
            }
            C242419o r5 = (C242419o) obj;
            return this.A00 == r5.A00 && get() == r5.get();
        }
    }

    public final int hashCode() {
        return this.A00;
    }
}
