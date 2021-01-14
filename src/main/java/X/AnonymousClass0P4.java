package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0P4  reason: invalid class name */
public class AnonymousClass0P4 {
    public static final long A01 = TimeUnit.SECONDS.convert(1, TimeUnit.HOURS);
    public static volatile AnonymousClass0P4 A02;
    public final C002701k A00;

    public AnonymousClass0P4(C002701k r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0P4 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0P4.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0P4(C002701k.A00());
                }
            }
        }
        return A02;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        if (r1.equals("alarm") == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        if (r1.equals("work") == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        if (r1.equals("job") == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0P4.A01():int");
    }

    public long A02() {
        long A03 = (long) this.A00.A03(185);
        if (A03 < 1) {
            A03 = 1;
        } else if (A03 > 72) {
            A03 = 72;
        }
        return TimeUnit.MILLISECONDS.convert(A03, TimeUnit.HOURS);
    }

    public long A03() {
        long A03 = (long) this.A00.A03(186);
        if (A03 < 1) {
            A03 = 1;
        }
        long j = A01;
        if (A03 > j) {
            A03 = j;
        }
        return TimeUnit.MILLISECONDS.convert(A03, TimeUnit.SECONDS);
    }
}
