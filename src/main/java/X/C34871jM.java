package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jM  reason: invalid class name and case insensitive filesystem */
public final class C34871jM implements AnonymousClass17V {
    public final AnonymousClass262 A00;

    public C34871jM(AnonymousClass262 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass17V
    public final boolean A3m() {
        return true;
    }

    @Override // X.AnonymousClass17V
    public final void AEX(Bundle bundle) {
    }

    @Override // X.AnonymousClass17V
    public final void AEZ(int i) {
    }

    @Override // X.AnonymousClass17V
    public final void ARQ(C34661ix r1, AnonymousClass16z r2, boolean z) {
    }

    @Override // X.AnonymousClass17V
    public final void A2C() {
        AnonymousClass262 r2 = this.A00;
        for (AbstractC34701j2 r0 : r2.A0A.values()) {
            r0.A3k();
        }
        r2.A05.A05 = Collections.emptySet();
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A47(AbstractC457025y r2) {
        this.A00.A05.A0K.add(r2);
        return r2;
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A4A(AbstractC457025y r3) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // X.AnonymousClass17V
    public final void connect() {
        AnonymousClass262 r1 = this.A00;
        Lock lock = r1.A0D;
        lock.lock();
        try {
            r1.A0E = new C34811jG(r1, r1.A08, r1.A09, r1.A03, r1.A04, lock, r1.A02);
            r1.A0E.A2C();
            r1.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
