package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aP  reason: invalid class name and case insensitive filesystem */
public class C51992aP implements AnonymousClass35S {
    public final /* synthetic */ C52002aQ A00;

    public C51992aP(C52002aQ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        C52002aQ r0 = this.A00;
        C002001d.A2N(r0.A02, r0.A0I.A03);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        C52002aQ r2 = this.A00;
        C002001d.A2N(r2.A02, r2.A0I.A03);
        r2.A07.APv(0, R.string.register_wait_message);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r2.A05.A00.A0q();
        C10730f6 r0 = r2.A00;
        if (r0 != null) {
            r0.A04();
        }
        C10730f6 r3 = new C10730f6(r2.A0D, r2.A01, elapsedRealtime, r2.A0P, false, z);
        r2.A00 = r3;
        r2.A0Q.ANC(r3, new Object[0]);
    }
}
