package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xb  reason: invalid class name and case insensitive filesystem */
public class C73373Xb extends AbstractC68463Dh {
    public final /* synthetic */ C61302sx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73373Xb(C61302sx r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantLinkAction request error: ");
        sb.append(r3);
        Log.e(sb.toString());
        this.A00.A06.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantLinkAction response error: ");
        sb.append(r3);
        Log.e(sb.toString());
        this.A00.A06.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r6) {
        try {
            AnonymousClass0M5 A0E = r6.A0E("account");
            C61072sS A002 = C61072sS.A00(A0E);
            if (A002 != null) {
                this.A00.A06.A00(null, A002);
                return;
            }
            C74733bP r2 = new C74733bP();
            r2.A01(0, A0E.A0E("merchant"));
            C43771yv r22 = (C43771yv) r2.A03();
            this.A00.A05.A01().A01(r22, new C68593Du(this, r22));
        } catch (AnonymousClass1XC e) {
            Log.e("PAY: BrazilMerchantLinkAction/regMerchant: invalid response message", e);
            this.A00.A06.A00(null, new C61072sS());
        }
    }
}
