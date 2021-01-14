package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aO  reason: invalid class name and case insensitive filesystem */
public class C51982aO implements AnonymousClass35T {
    public final /* synthetic */ C52002aQ A00;

    public C51982aO(C52002aQ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass35T
    public void AHs() {
        C002001d.A2N(this.A00.A02, 0);
    }

    @Override // X.AnonymousClass35T
    public void AIc(boolean z, boolean z2) {
        C52002aQ r3 = this.A00;
        C002001d.A2N(r3.A02, 0);
        r3.A07.APv(0, R.string.register_wait_message);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r3.A05.A00.A0q();
        C10730f6 r0 = r3.A00;
        if (r0 != null) {
            r0.A04();
        }
        C10730f6 r4 = new C10730f6(r3.A0D, r3.A01, elapsedRealtime, r3.A0P, z, z2);
        r3.A00 = r4;
        r3.A0Q.ANC(r4, new Object[0]);
    }
}
