package X;

import android.content.Context;

/* renamed from: X.3XP  reason: invalid class name */
public class AnonymousClass3XP extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C03340Fu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XP(C03340Fu r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r4) {
        AnonymousClass3DK r2;
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r2 = new AnonymousClass3DK(r0);
        } else {
            r2 = null;
        }
        this.A01.A02(r2, r4, true);
    }
}
