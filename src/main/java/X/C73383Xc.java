package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xc  reason: invalid class name and case insensitive filesystem */
public class C73383Xc extends AbstractC68463Dh {
    public final /* synthetic */ C73393Xd A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73383Xc(C73393Xd r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction request error: ");
        sb.append(r3);
        Log.e(sb.toString());
        this.A00.A07.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction response error: ");
        sb.append(r3);
        Log.e(sb.toString());
        this.A00.A07.A00(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D != null) {
            C61692ta r3 = new C61692ta(A0D);
            C61072sS r2 = r3.A00;
            if (r2 == null) {
                this.A00.A07.A00(r3, null);
            } else {
                this.A00.A07.A00(null, r2);
            }
        } else {
            throw null;
        }
    }
}
