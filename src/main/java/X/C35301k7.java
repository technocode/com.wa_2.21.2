package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1k7  reason: invalid class name and case insensitive filesystem */
public final class C35301k7 implements AnonymousClass179 {
    public final /* synthetic */ AnonymousClass17A A00;
    public final /* synthetic */ AnonymousClass186 A01;
    public final /* synthetic */ AnonymousClass187 A02;
    public final /* synthetic */ C24611Bq A03;

    public C35301k7(AnonymousClass17A r1, C24611Bq r2, AnonymousClass186 r3, AnonymousClass187 r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass179
    public final void AEP(Status status) {
        Exception r1;
        boolean z = false;
        if (status.A01 <= 0) {
            z = true;
        }
        if (z) {
            AnonymousClass17A r6 = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) r6;
            if (basePendingResult != null) {
                C001801b.A1b(!basePendingResult.A0C, "Result has already been consumed.");
                C001801b.A1b(true, "Cannot await if then() has been called.");
                try {
                    if (!basePendingResult.A0A.await(0, timeUnit)) {
                        basePendingResult.A08(Status.A08);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.A08(Status.A06);
                }
                C001801b.A1b(basePendingResult.A09(), "Result is not ready.");
                AnonymousClass17C A022 = basePendingResult.A02();
                C24611Bq r2 = this.A03;
                AnonymousClass17B r12 = ((C35311k8) this.A01).A00;
                r12.A00 = A022;
                r2.A00.A08(r12);
                return;
            }
            throw null;
        }
        C24611Bq r22 = this.A03;
        if (this.A02 != null) {
            if (status.A02 != null) {
                r1 = new C34721j4(status);
            } else {
                r1 = new AnonymousClass170(status);
            }
            r22.A00.A07(r1);
            return;
        }
        throw null;
    }
}
