package X;

import android.os.SystemClock;

/* renamed from: X.32U  reason: invalid class name */
public class AnonymousClass32U {
    public long A00;
    public long A01;
    public boolean A02;
    public final long A03;

    public AnonymousClass32U() {
        this.A03 = 4500;
    }

    public AnonymousClass32U(long j) {
        this.A03 = j;
    }

    public long A00() {
        long j = this.A00;
        return this.A02 ? j + (SystemClock.elapsedRealtime() - this.A01) : j;
    }

    public void A01() {
        if (!this.A02) {
            this.A01 = SystemClock.elapsedRealtime();
        }
        this.A02 = true;
    }

    public void A02() {
        if (this.A02) {
            this.A00 = (SystemClock.elapsedRealtime() - this.A01) + this.A00;
        }
        this.A02 = false;
    }
}
