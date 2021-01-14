package X;

import android.os.Bundle;

/* renamed from: X.1jr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC35141jr extends AbstractC238017q {
    public final int A00;
    public final Bundle A01;
    public final /* synthetic */ AbstractC238217s A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC35141jr(AbstractC238217s r2, int i, Bundle bundle) {
        super(r2, Boolean.TRUE);
        this.A02 = r2;
        this.A00 = i;
        this.A01 = bundle;
    }

    public void A01(C34661ix r3) {
        if (!(this instanceof AnonymousClass268)) {
            AbstractC238217s r1 = ((AnonymousClass267) this).A01;
            AbstractC237717n r0 = r1.A0I;
            if (r0 != null) {
                ((C35281k5) r0).A00.AEY(r3);
            }
            r1.A06(r3);
            return;
        }
        AbstractC238217s r12 = ((AnonymousClass268) this).A00;
        r12.A08.AJN(r3);
        r12.A06(r3);
    }
}
