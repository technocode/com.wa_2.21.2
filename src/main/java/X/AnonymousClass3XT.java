package X;

import android.content.Context;

/* renamed from: X.3XT  reason: invalid class name */
public class AnonymousClass3XT extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C03340Fu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XT(C03340Fu r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        C018809u r2 = this.A01.A0G;
        StringBuilder sb = new StringBuilder("Tos onRequestError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        this.A00.AJP(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        C018809u r2 = this.A01.A0G;
        StringBuilder sb = new StringBuilder("Tos onResponseError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        this.A00.AJU(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r6) {
        AnonymousClass0M5 A0D = r6.A0D("accept_pay");
        C68443Df r3 = new C68443Df();
        if (A0D != null) {
            r3.A02 = "1".equals(A0D.A0G("accept", null));
            r3.A00 = "1".equals(A0D.A0G("outage", null));
            boolean equals = "1".equals(A0D.A0G("sandbox", null));
            r3.A01 = equals;
            this.A01.A0C.A06(equals);
        } else {
            r3.A02 = false;
        }
        this.A00.AJV(r3);
    }
}
