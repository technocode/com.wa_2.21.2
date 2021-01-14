package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08y  reason: invalid class name and case insensitive filesystem */
public class C016608y {
    public static final C016608y A01 = new C016608y();
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public C05340Od A00(AnonymousClass02X r3) {
        C05340Od r0;
        ConcurrentHashMap concurrentHashMap = this.A00;
        synchronized (concurrentHashMap) {
            r0 = (C05340Od) concurrentHashMap.get(r3);
        }
        return r0;
    }
}
