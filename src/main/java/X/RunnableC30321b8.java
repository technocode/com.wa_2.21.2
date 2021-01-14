package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.1b8  reason: invalid class name and case insensitive filesystem */
public final class RunnableC30321b8 extends AbstractC15710oX implements Runnable {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public final /* synthetic */ AbstractC30331b9 A01;

    public RunnableC30321b8(AbstractC30331b9 r3) {
        this.A01 = r3;
    }

    public void run() {
        this.A01.A06();
    }
}
