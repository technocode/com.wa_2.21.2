package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0f6  reason: invalid class name and case insensitive filesystem */
public final class C10730f6 extends AnonymousClass0JW {
    public C04360Kb A00;
    public WeakReference A01;
    public final long A02;
    public final AnonymousClass02N A03;
    public final boolean A04;
    public final boolean A05;

    public C10730f6(C04360Kb r2, Runnable runnable, long j, AnonymousClass02N r6, boolean z, boolean z2) {
        this.A00 = r2;
        this.A01 = new WeakReference(runnable);
        this.A03 = r6;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = j;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
    }

    public void A04() {
        this.A01 = null;
        this.A00 = null;
        super.A00.cancel(true);
    }
}
