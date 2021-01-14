package X;

import android.content.Context;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public class C73533Xs extends AbstractC68463Dh {
    public final /* synthetic */ C61492tG A00;
    public final /* synthetic */ AnonymousClass3EX A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73533Xs(C61492tG r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass3EX r6) {
        super(context, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        this.A01.A00(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        C018809u r2 = this.A00.A06;
        StringBuilder sb = new StringBuilder("performDobComplianceCheck onResponseError: ");
        sb.append(r4);
        r2.A04(sb.toString());
        this.A01.A00(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        AnonymousClass3EX r3 = this.A01;
        C018809u r2 = r3.A01.A07;
        StringBuilder sb = new StringBuilder("performDobComplianceCheck onDobCheckComplete, eligible: ");
        sb.append(true);
        r2.A07(null, sb.toString(), null);
        r3.A02.A00.A00("on_success");
    }
}
