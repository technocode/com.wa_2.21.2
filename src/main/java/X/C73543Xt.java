package X;

import android.content.Context;

/* renamed from: X.3Xt  reason: invalid class name and case insensitive filesystem */
public class C73543Xt extends AbstractC68463Dh {
    public final /* synthetic */ C61512tI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73543Xt(C61512tI r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r5) {
        C61512tI r3 = this.A00;
        C018809u r2 = r3.A06;
        StringBuilder sb = new StringBuilder("onRequestError: ");
        sb.append(r5);
        r2.A07(null, sb.toString(), null);
        r3.A05.AJe(null, r5);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r5) {
        C61512tI r3 = this.A00;
        C018809u r2 = r3.A06;
        StringBuilder sb = new StringBuilder("onResponseError: ");
        sb.append(r5);
        r2.A07(null, sb.toString(), null);
        r3.A05.AJe(null, r5);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D != null) {
            this.A00.A05.AJe(A0D.A0G("token-id", null), null);
        } else {
            this.A00.A05.AJe(null, new C61072sS());
        }
    }
}
