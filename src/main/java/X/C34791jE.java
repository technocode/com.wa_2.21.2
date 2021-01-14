package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jE  reason: invalid class name and case insensitive filesystem */
public final class C34791jE implements AnonymousClass17V {
    public final AnonymousClass262 A00;

    public C34791jE(AnonymousClass262 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass17V
    public final void A2C() {
    }

    @Override // X.AnonymousClass17V
    public final void AEX(Bundle bundle) {
    }

    @Override // X.AnonymousClass17V
    public final void ARQ(C34661ix r1, AnonymousClass16z r2, boolean z) {
    }

    @Override // X.AnonymousClass17V
    public final boolean A3m() {
        AnonymousClass262 r2 = this.A00;
        Lock lock = r2.A05.A0L;
        lock.lock();
        lock.unlock();
        r2.A00(null);
        return true;
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A47(AbstractC457025y r1) {
        A4A(r1);
        return r1;
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A4A(AbstractC457025y r6) {
        try {
            AnonymousClass262 r4 = this.A00;
            C34881jN r3 = r4.A05;
            C236817c r1 = r3.A0D;
            r1.A02.add(r6);
            r6.A0B.set(r1.A00);
            C236316w r2 = r6.A00;
            AbstractC34701j2 r12 = (AbstractC34701j2) r3.A0J.get(r2);
            C001801b.A1R(r12, "Appropriate Api was not requested.");
            if (r12.isConnected() || !r4.A0B.containsKey(r2)) {
                r6.A0A(r12);
                return r6;
            }
            r6.A0B(new Status(1, 17, null, null));
            return r6;
        } catch (DeadObjectException unused) {
            AnonymousClass262 r0 = this.A00;
            C34801jF r22 = new C34801jF(this, this);
            HandlerC34951jU r13 = r0.A06;
            r13.sendMessage(r13.obtainMessage(1, r22));
            return r6;
        }
    }

    @Override // X.AnonymousClass17V
    public final void AEZ(int i) {
        AnonymousClass262 r1 = this.A00;
        r1.A00(null);
        r1.A07.ARX(i, false);
    }

    @Override // X.AnonymousClass17V
    public final void connect() {
    }
}
