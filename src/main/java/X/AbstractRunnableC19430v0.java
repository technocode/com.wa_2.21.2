package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0v0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC19430v0 implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (delayed instanceof AbstractRunnableC19430v0) {
            AbstractRunnableC19430v0 r10 = (AbstractRunnableC19430v0) delayed;
            long j = this.A01;
            long j2 = r10.A01;
            if (j == j2) {
                long j3 = this.A00 - r10.A00;
                if (j3 > 0) {
                    return -1;
                }
                if (j3 == 0) {
                    return 0;
                }
                return 1;
            }
            long j4 = j - j2;
            if (j4 < 0) {
                return -1;
            }
            if (j4 == 0) {
                return 0;
            }
            return 1;
        }
        throw new IllegalArgumentException("Comparing a Dispatchable to a non-Dispatchable.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractRunnableC19430v0)) {
            return false;
        }
        AbstractRunnableC19430v0 r7 = (AbstractRunnableC19430v0) obj;
        if (this.A00 != r7.A00) {
            return false;
        }
        String str = this.A02;
        if (str == null) {
            if (r7.A02 != null) {
                return false;
            }
        } else if (!str.equals(r7.A02)) {
            return false;
        }
        if (this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:118|119|(2:120|(1:122)(1:248))|123|124|125|126|127) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r6.equals("openstreetmap") != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c4, code lost:
        if (r6.equals("osm") != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        r0 = X.EnumC19140uX.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0190, code lost:
        if (r2 != null) goto L_0x0192;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x021f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 934
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC19430v0.run():void");
    }
}
