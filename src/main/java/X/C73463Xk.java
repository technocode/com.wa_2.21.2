package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public class C73463Xk extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass3E5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73463Xk(AnonymousClass3E5 r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardOTPSendAction onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A03.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardOTPSendAction onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A03.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r4) {
        AnonymousClass0M5 A0D;
        Log.i("PAY: BrazilVerifyCardOTPSendAction success");
        AnonymousClass0M5 A0D2 = r4.A0D("account");
        if (A0D2 == null || (A0D = A0D2.A0D("card")) == null) {
            this.A00.A03.A00(null, new C61072sS());
            return;
        }
        C74723bO r1 = new C74723bO();
        r1.A01(0, A0D);
        C43761yu r2 = (C43761yu) r1.A03();
        ((AbstractC61332t0) this.A00).A06.A01().A01(r2, new C68643Dz(this, r2));
    }
}
