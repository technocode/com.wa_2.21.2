package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xh  reason: invalid class name and case insensitive filesystem */
public class C73433Xh extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass3FB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73433Xh(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, AnonymousClass3FB r5) {
        super(context, r2, r3, r4);
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilSubmitVerificationMethodAction onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilSubmitVerificationMethodAction onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        C74723bO r1;
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D != null) {
            AnonymousClass0M5 A0D2 = A0D.A0D("card");
            if (A0D2 != null) {
                r1 = new C74723bO();
                r1.A01(0, A0D2);
            } else {
                r1 = null;
            }
            this.A00.A00(r1, null);
            return;
        }
        this.A00.A00(null, new C61072sS());
    }
}
