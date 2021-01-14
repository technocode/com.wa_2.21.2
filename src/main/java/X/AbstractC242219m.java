package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19m  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC242219m {
    public void A00(Throwable th, Throwable th2) {
        if (!(this instanceof C35661kj) && (this instanceof C35651ki)) {
            C35651ki r0 = (C35651ki) this;
            if (th2 == th) {
                throw new IllegalArgumentException("Self suppression is not allowed.", th2);
            } else if (th2 != null) {
                C242519p r2 = r0.A00;
                ReferenceQueue referenceQueue = r2.A00;
                for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
                    r2.A01.remove(poll);
                }
                C242419o r02 = new C242419o(th, null);
                ConcurrentHashMap concurrentHashMap = r2.A01;
                List list = (List) concurrentHashMap.get(r02);
                if (list == null) {
                    list = new Vector(2);
                    List list2 = (List) concurrentHashMap.putIfAbsent(new C242419o(th, referenceQueue), list);
                    if (list2 != null) {
                        list = list2;
                    }
                }
                list.add(th2);
            } else {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
        }
    }
}
