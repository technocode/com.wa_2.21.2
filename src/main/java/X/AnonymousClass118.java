package X;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.118  reason: invalid class name */
public class AnonymousClass118 {
    public static final AtomicInteger A0E = new AtomicInteger(0);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass113 A05;
    public AnonymousClass113 A06;
    public AnonymousClass115 A07;
    public AnonymousClass116 A08;
    public C33491gr A09;
    public final Context A0A;
    public final AnonymousClass117 A0B = new AnonymousClass117(this, Looper.getMainLooper());
    public final C37421oC A0C;
    public final Object A0D;

    public AnonymousClass118(Context context, Object obj, C37421oC r5) {
        A0E.incrementAndGet();
        this.A01 = -1;
        this.A03 = 0;
        this.A00 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = context;
        this.A0C = r5;
        this.A0D = obj;
    }

    public final void A00() {
        AnonymousClass113 r0;
        synchronized (this) {
            C37421oC r2 = this.A0C;
            Object obj = this.A05.A04;
            if (r2 != null) {
                C010206h r3 = r2.A00;
                AbstractC008905s r1 = ((AnonymousClass1GN) obj).A00;
                if (r3 == null) {
                    throw null;
                } else if (C008805h.A1L()) {
                    r3.A06 = null;
                    r3.A00 = r1;
                    r0 = this.A05;
                    this.A06 = r0;
                } else {
                    throw new RuntimeException("Committing Variables and Bound tree is only supported from the UI Thread");
                }
            } else {
                throw null;
            }
        }
        C33491gr r12 = this.A09;
        if (r12 != null) {
            r12.A00(r0.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (X.AnonymousClass0N2.A1c(r6.A00, r19, r3.height()) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        r2 = r9.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        monitor-enter(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        if (r14 <= r17.A00) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        r17.A00 = r14;
        r17.A05 = r2;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ed, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        if (r17.A07 != r9) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f3, code lost:
        r17.A07 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        if (r20 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
        r20[0] = r17.A05.A02.A02.A04.width();
        r20[1] = r17.A05.A02.A02.A04.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        monitor-exit(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0118, code lost:
        if (r17.A0C == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011e, code lost:
        if (X.AnonymousClass0N2.A1a() == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (X.AnonymousClass0N2.A1c(r6.A00, r19, r3.height()) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0124, code lost:
        r2 = r17.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012c, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0132, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r18, int r19, int[] r20) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass118.A01(int, int, int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r1 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r8 <= r11.A00) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r11.A00 = r8;
        r11.A05 = r1;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r11.A07 != r3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r11.A07 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r11.A0C == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (X.AnonymousClass0N2.A1a() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r2 = r11.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass116 r12) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass118.A02(X.116):void");
    }
}
