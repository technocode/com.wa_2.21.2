package X;

import android.os.SystemClock;

/* renamed from: X.2F7  reason: invalid class name */
public class AnonymousClass2F7 {
    public final AnonymousClass00S A00;
    public final AnonymousClass00D A01;
    public final C001000o A02;
    public final C001400w A03;
    public final C02430Bz A04;
    public final AnonymousClass00T A05;

    public AnonymousClass2F7(AnonymousClass00S r1, AnonymousClass00T r2, C001400w r3, C001000o r4, AnonymousClass00D r5, C02430Bz r6) {
        this.A00 = r1;
        this.A05 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A04 = r6;
    }

    public final long A00() {
        long j;
        AnonymousClass00S r7 = this.A00;
        if (r7.A02 != 0) {
            long j2 = r7.A02;
            if (r7.A00 != null) {
                j = SystemClock.elapsedRealtime() + j2;
            } else {
                throw null;
            }
        } else {
            j = 0;
        }
        long j3 = j / 1000;
        return j3 == 0 ? r7.A01() / 1000 : j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r5 <= 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r5 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        if (r5 <= 0) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01() {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2F7.A01():void");
    }
}
