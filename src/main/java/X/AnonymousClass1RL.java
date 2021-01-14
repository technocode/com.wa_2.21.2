package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1RL  reason: invalid class name */
public class AnonymousClass1RL {
    public int A00;
    public int A01;
    public C50002Ta A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public volatile AtomicBoolean A06 = new AtomicBoolean();

    public AnonymousClass1RL(AnonymousClass1RQ r2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = concurrentHashMap;
        concurrentHashMap.put(r2, r2);
        this.A03 = r2.getId();
        this.A04 = r2.A9c();
        this.A00 = r2.A7F();
        this.A01 = r2.A7H();
    }
}
