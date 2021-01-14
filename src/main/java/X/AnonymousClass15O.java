package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* renamed from: X.15O  reason: invalid class name */
public final class AnonymousClass15O extends Handler implements Runnable {
    public int A00;
    public AnonymousClass15M A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final AnonymousClass15P A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ AnonymousClass15S A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass15O(AnonymousClass15S r1, Looper looper, AnonymousClass15P r3, AnonymousClass15M r4, int i, long j) {
        super(looper);
        this.A09 = r1;
        this.A05 = r3;
        this.A01 = r4;
        this.A03 = i;
        this.A04 = j;
    }

    public void A00(long j) {
        AnonymousClass15S r4 = this.A09;
        boolean z = false;
        if (r4.A00 == null) {
            z = true;
        }
        C002001d.A3A(z);
        r4.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
            return;
        }
        this.A02 = null;
        r4.A02.execute(this);
    }

    public void A01(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.A07 = true;
            ((C34171i1) this.A05).A0A = true;
            if (this.A06 != null) {
                this.A06.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.A09.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ((AnonymousClass25V) this.A01).A05(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        if (r1 == 1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        if (r10.A06() != false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r27) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15O.handleMessage(android.os.Message):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0320, code lost:
        if (r3 == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0324, code lost:
        if (r14 < r27) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0326, code lost:
        r25 = r4;
        r3 = r0;
        r29 = r12;
        r27 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x032f, code lost:
        if (r12 >= r31) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0331, code lost:
        r1 = r4;
        r26 = r0;
        r31 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x033a, code lost:
        if (true == r3) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0552, code lost:
        if (r1 == -1) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x057a, code lost:
        r0.A00 = r9.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05fc A[SYNTHETIC, Splitter:B:314:0x05fc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 1659
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15O.run():void");
    }
}
