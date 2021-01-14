package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0Qs  reason: invalid class name */
public class AnonymousClass0Qs {
    public final long A00;
    public final List A01;
    public final Map A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04 = false;

    public AnonymousClass0Qs(long j, List list, Map map) {
        this.A00 = j;
        this.A01 = list;
        this.A02 = map;
    }
}
