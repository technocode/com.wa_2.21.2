package X;

import android.content.Context;

/* renamed from: X.3Xp  reason: invalid class name and case insensitive filesystem */
public class C73503Xp extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C61482tF A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73503Xp(C61482tF r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        AbstractC61782tj A6O = this.A01.A08.A03().A6O();
        if (A6O != null) {
            A6O.reset();
        }
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        AbstractC61782tj A6O = this.A01.A08.A03().A6O();
        if (A6O != null) {
            A6O.reset();
        }
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        C61482tF r0 = this.A01;
        r0.A0A.ANC(new AnonymousClass0e9(r0.A03, new RunnableEBaseShape11S0100000_I1_6(this, 17)), new Void[0]);
        AnonymousClass0GT r1 = this.A00;
        if (r1 != null) {
            r1.AJV(new C68443Df());
        }
    }
}
