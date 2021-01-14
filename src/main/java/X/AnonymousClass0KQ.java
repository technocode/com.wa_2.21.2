package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0KQ  reason: invalid class name */
public class AnonymousClass0KQ {
    public static final long A09 = TimeUnit.MINUTES.toMillis(15);
    public static volatile AnonymousClass0KQ A0A;
    public long A00;
    public boolean A01;
    public final AnonymousClass00G A02;
    public final C02660Cy A03;
    public final AnonymousClass03A A04;
    public final AnonymousClass00T A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();

    public AnonymousClass0KQ(AnonymousClass00G r2, AnonymousClass03A r3, AnonymousClass00T r4, C02660Cy r5) {
        this.A02 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r5;
    }

    public static AnonymousClass0KQ A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0KQ.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0KQ(AnonymousClass00G.A01, AnonymousClass03A.A00(), C002101e.A00(), C02660Cy.A00());
                }
            }
        }
        return A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01() {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KQ.A01():void");
    }
}
