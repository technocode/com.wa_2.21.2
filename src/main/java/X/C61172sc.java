package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2sc  reason: invalid class name and case insensitive filesystem */
public class C61172sc {
    public final AbstractC61192se A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AtomicInteger A02;
    public final String[] A03;

    public C61172sc(int i, AbstractC61192se r4) {
        this.A02 = new AtomicInteger(i);
        this.A03 = new String[i];
        this.A00 = r4;
    }

    public void A00(int i, String str) {
        String[] strArr = this.A03;
        strArr[i] = str;
        if (this.A02.decrementAndGet() == 0 && this.A01.compareAndSet(false, true)) {
            this.A00.AKl(strArr);
        }
    }
}
