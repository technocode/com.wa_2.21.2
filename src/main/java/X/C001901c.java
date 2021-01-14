package X;

import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.Locale;

/* renamed from: X.01c  reason: invalid class name and case insensitive filesystem */
public class C001901c {
    public static final int A06 = 2;
    public static final int A07;
    public static final String A08;
    public static final byte[] A09 = {0, 10};
    public static volatile C001901c A0A;
    public AnonymousClass0LM A00;
    public MappedByteBuffer A01;
    public final AnonymousClass02H A02;
    public volatile File A03;
    public volatile String A04 = "unknown";
    public volatile boolean A05;

    static {
        String format = String.format(Locale.US, "%07d", Long.valueOf((System.currentTimeMillis() / 1000) % 10000000));
        A08 = format;
        A07 = format.getBytes().length + 1;
    }

    public C001901c(AnonymousClass00T r3) {
        this.A02 = new AnonymousClass02H(r3, true);
    }

    public static C001901c A00() {
        if (A0A == null) {
            synchronized (C001901c.class) {
                if (A0A == null) {
                    A0A = new C001901c(C002101e.A00());
                }
            }
        }
        return A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(java.io.File r4) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001901c.A01(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A02() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001901c.A02():java.util.Map");
    }

    public void A03(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append(" ");
        sb.append(str);
        this.A02.execute(new RunnableEBaseShape0S1100000_I0(this, sb.toString(), 3));
    }
}
