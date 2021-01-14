package X;

import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: X.25W  reason: invalid class name */
public final class AnonymousClass25W extends AbstractC34131hx implements AbstractC228913o {
    public long A00 = -9223372036854775807L;
    public AnonymousClass15U A01;
    public boolean A02;
    public final int A03 = 1048576;
    public final Uri A04;
    public final AnonymousClass13D A05;
    public final AnonymousClass15D A06;
    public final AnonymousClass15L A07;

    @Override // X.AbstractC229313t
    public void AC6() {
    }

    public AnonymousClass25W(Uri uri, AnonymousClass15D r4, AnonymousClass13D r5) {
        C34451iV r0 = new C34451iV();
        this.A04 = uri;
        this.A06 = r4;
        this.A05 = r5;
        this.A07 = r0;
    }

    public void A01(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 != j || this.A02 != z) {
            this.A00 = j;
            this.A02 = z;
            A00(new C34231i7(j, z), null);
        }
    }

    @Override // X.AbstractC229313t
    public AbstractC34201i4 A3Q(C229113r r10, AnonymousClass15H r11, long j) {
        AnonymousClass15E A3F = this.A06.A3F();
        AnonymousClass15U r0 = this.A01;
        if (r0 != null) {
            A3F.A1u(r0);
        }
        return new AnonymousClass25V(this.A04, A3F, this.A05.A3I(), this.A07, new C229513v(super.A03.A02, 0, r10), this, r11);
    }

    @Override // X.AbstractC229313t
    public void AMU(AbstractC34201i4 r5) {
        AnonymousClass25V r52 = (AnonymousClass25V) r5;
        if (r52.A0F) {
            for (C34211i5 r0 : r52.A0K) {
                r0.A04();
            }
        }
        AnonymousClass15S r1 = r52.A0U;
        AnonymousClass15O r02 = r1.A00;
        if (r02 != null) {
            r02.A01(true);
        }
        ExecutorService executorService = r1.A02;
        executorService.execute(new RunnableEBaseShape5S0100000_I1_0(r52, 40));
        executorService.shutdown();
        r52.A0N.removeCallbacksAndMessages(null);
        r52.A09 = null;
        r52.A0G = true;
        r52.A0Q.A03();
    }
}
