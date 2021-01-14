package X;

import android.content.Context;

/* renamed from: X.3XR  reason: invalid class name */
public class AnonymousClass3XR extends AbstractC68463Dh {
    public final /* synthetic */ C68493Dk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XR(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, C68493Dk r5) {
        super(context, r2, r3, r4);
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        this.A00.A00();
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        this.A00.A00();
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r14) {
        AnonymousClass0M5 A0D = r14.A0D("account");
        if (A0D == null || !"1".equals(A0D.A0G("cancel-status", null))) {
            this.A00.A00();
            return;
        }
        C68493Dk r2 = this.A00;
        C61112sW r0 = r2.A04;
        r0.A0D.ANC(new C10150eA(r0.A01, r0.A06, r0.A0C, r0.A0B, r0.A04, r0.A0A, r2.A01, r2.A02, 18, new RunnableEBaseShape11S0100000_I1_6(r2.A03, 14)), new Void[0]);
    }
}
