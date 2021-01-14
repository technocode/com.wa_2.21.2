package X;

import android.os.SystemClock;

/* renamed from: X.1AI  reason: invalid class name */
public final class AnonymousClass1AI {
    public long A00;
    public final AbstractC240018k A01;

    public AnonymousClass1AI(AbstractC240018k r1) {
        C001801b.A1Q(r1);
        this.A01 = r1;
    }

    public final void A00() {
        if (this.A01 != null) {
            this.A00 = SystemClock.elapsedRealtime();
            return;
        }
        throw null;
    }

    public final boolean A01(long j) {
        long j2 = this.A00;
        if (j2 == 0) {
            return true;
        }
        if (this.A01 == null) {
            throw null;
        } else if (SystemClock.elapsedRealtime() - j2 > j) {
            return true;
        } else {
            return false;
        }
    }
}
