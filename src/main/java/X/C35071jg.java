package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jg  reason: invalid class name and case insensitive filesystem */
public final class C35071jg implements AnonymousClass17Z {
    public final /* synthetic */ C35051je A00;

    public C35071jg(C35051je r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass17Z
    public final void ARX(int i, boolean z) {
        C35051je r2 = this.A00;
        Lock lock = r2.A0D;
        lock.lock();
        try {
            if (r2.A04) {
                r2.A04 = false;
                r2.A08.ARX(i, z);
                r2.A03 = null;
                r2.A02 = null;
                return;
            }
            r2.A04 = true;
            r2.A09.AEZ(i);
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AnonymousClass17Z
    public final void ARY(Bundle bundle) {
        C35051je r2 = this.A00;
        Lock lock = r2.A0D;
        lock.lock();
        try {
            r2.A03 = C34661ix.A04;
            C35051je.A00(r2);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AnonymousClass17Z
    public final void ARa(C34661ix r3) {
        C35051je r0 = this.A00;
        Lock lock = r0.A0D;
        lock.lock();
        try {
            r0.A03 = r3;
            C35051je.A00(r0);
        } finally {
            lock.unlock();
        }
    }
}
