package X;

import java.lang.ref.WeakReference;

/* renamed from: X.296  reason: invalid class name */
public final class AnonymousClass296 extends BinderC458126l {
    public final WeakReference A00;

    public AnonymousClass296(C34811jG r2) {
        this.A00 = new WeakReference(r2);
    }

    @Override // X.AbstractC24521Bh
    public final void ARZ(C36171lh r4) {
        C34811jG r1 = (C34811jG) this.A00.get();
        if (r1 != null) {
            AnonymousClass262 r0 = r1.A0G;
            C34851jK r2 = new C34851jK(r1, r1, r4);
            HandlerC34951jU r12 = r0.A06;
            r12.sendMessage(r12.obtainMessage(1, r2));
        }
    }
}
