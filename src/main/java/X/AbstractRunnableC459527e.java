package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.27e  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC459527e extends C41191ud implements Runnable, AbstractC27381Pn {
    public final C03140Ey A00 = new C03140Ey();
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final FutureTask A02 = new C27391Po(this, new CallableC27371Pm(this));

    @Override // X.C41191ud
    public void A02() {
        super.A02();
        this.A00.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b9, code lost:
        if (r11 == false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0897, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x089b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x089c, code lost:
        if (r9 != null) goto L_0x089e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08b0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08b4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0923, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0927, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x09b5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x09b9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x09c3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x09c7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09ec, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09f0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09fa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09fe, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b4d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b51, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0d1f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0d23, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x0ebc, code lost:
        if (r1 == false) goto L_0x0ebe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x0ece, code lost:
        if (r1 == false) goto L_0x0ebe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x0ed8, code lost:
        if (r1 == false) goto L_0x0ebe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:656:0x0d53  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03() {
        /*
        // Method dump skipped, instructions count: 4013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC459527e.A03():java.lang.Object");
    }

    public void A04() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    @Override // X.AbstractC27381Pn
    public void cancel() {
        this.A02.cancel(true);
    }

    public void run() {
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
                Object obj = futureTask.get();
                if (obj != null) {
                    A00(obj);
                    return;
                }
                throw null;
            } catch (InterruptedException | CancellationException e) {
                A01(e);
            } catch (ExecutionException e2) {
                A01(e2.getCause());
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    Thread.currentThread().interrupt();
                }
                Object obj2 = this.A02.get();
                if (obj2 != null) {
                    A00(obj2);
                    throw th;
                }
                throw null;
            } catch (InterruptedException | CancellationException e3) {
                A01(e3);
                throw th;
            } catch (ExecutionException e4) {
                A01(e4.getCause());
                throw th;
            }
        }
    }
}
