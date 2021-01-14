package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0XN  reason: invalid class name */
public class AnonymousClass0XN {
    public static volatile AnonymousClass0XN A0B;
    public AnonymousClass0IP A00;
    public final AnonymousClass009 A01;
    public final C017109d A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass0IC A04;
    public final AnonymousClass04j A05;
    public final AnonymousClass0I8 A06;
    public final AnonymousClass09H A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();

    public AnonymousClass0XN(AnonymousClass009 r2, AnonymousClass09H r3, AnonymousClass01A r4, AnonymousClass04j r5, C017109d r6, AnonymousClass0I8 r7, AnonymousClass0IC r8) {
        this.A01 = r2;
        this.A07 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A02 = r6;
        this.A06 = r7;
        this.A04 = r8;
    }

    public static AnonymousClass0XN A00() {
        if (A0B == null) {
            synchronized (AnonymousClass0XN.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass0XN(AnonymousClass009.A00(), AnonymousClass09H.A01(), AnonymousClass01A.A00(), AnonymousClass04j.A00(), C017109d.A00(), AnonymousClass0I8.A01(), AnonymousClass0IC.A00());
                }
            }
        }
        return A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r12 == X.EnumC03840Hy.ADD_QUERY) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0QK A01(X.EnumC03840Hy r12, com.whatsapp.jid.UserJid r13) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XN.A01(X.0Hy, com.whatsapp.jid.UserJid):X.0QK");
    }

    public final synchronized AnonymousClass0IP A02() {
        AnonymousClass0IP r4;
        r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass0IP(this.A01, this.A07, this.A06.A07(), new AnonymousClass0Z5(this));
            this.A00 = r4;
        }
        return r4;
    }

    public final void A03(ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || ((executionException.getCause() instanceof Error) && !(executionException.getCause() instanceof AssertionError) && !(executionException.getCause() instanceof OutOfMemoryError))) {
            this.A01.A05(executionException, 3);
        }
    }
}
