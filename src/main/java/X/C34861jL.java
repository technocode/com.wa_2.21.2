package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jL  reason: invalid class name and case insensitive filesystem */
public final class C34861jL implements AnonymousClass176, AnonymousClass177 {
    public final /* synthetic */ C34811jG A00;

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
    }

    public C34861jL(C34811jG r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        C34811jG r2 = this.A00;
        r2.A05.ARV(new AnonymousClass296(r2));
    }

    @Override // X.AnonymousClass177
    public final void AEY(C34661ix r4) {
        C34811jG r2 = this.A00;
        Lock lock = r2.A0K;
        lock.lock();
        try {
            if (!r2.A07 || r4.A01()) {
                r2.A03(r4);
            } else {
                r2.A02();
                r2.A00();
            }
        } finally {
            lock.unlock();
        }
    }
}
