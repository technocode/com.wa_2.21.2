package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.1td  reason: invalid class name and case insensitive filesystem */
public class C40661td extends AnonymousClass0JW {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C04360Kb A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public C40661td(AbstractC004502c r3, C04360Kb r4, boolean z, boolean z2) {
        this.A02 = new WeakReference(r3);
        this.A01 = r4;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC004502c r0 = (AbstractC004502c) this.A02.get();
        if (r0 != null) {
            r0.AMi();
        }
    }
}
