package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3XV  reason: invalid class name */
public class AnonymousClass3XV extends AbstractC68463Dh {
    public final /* synthetic */ C74483b0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XV(C74483b0 r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction onRequestError: ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00.A0B.A00(null, false, null, r4);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction onResponseError: ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00.A0B.A00(null, false, null, r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r9) {
        AnonymousClass0M5 A0D;
        AnonymousClass0M5[] r0;
        int length;
        AnonymousClass0M5 A0D2 = r9.A0D("account");
        if (A0D2 == null || (A0D = A0D2.A0D("card")) == null) {
            this.A00.A0B.A00(null, false, null, new C61072sS());
            return;
        }
        C74723bO r1 = new C74723bO();
        r1.A01(0, A0D);
        C43761yu r5 = (C43761yu) r1.A03();
        C74483b0 r7 = this.A00;
        r7.A0C.A01(r5, null);
        if (r1.A0X) {
            r7.A09.A01().A01(r5, new C68533Do(this, r5));
        } else if (!r1.A07) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass0M5 A0D3 = A0D2.A0D("verify-method-list");
            if (!(A0D3 == null || (r0 = A0D3.A03) == null || (length = r0.length) <= 0)) {
                for (int i = 0; i < length; i++) {
                    arrayList.add(new C61672tY(A0D3.A0C(i)));
                }
            }
            r7.A09.A01().A01(r5, new C68543Dp(this, r5, arrayList));
        } else {
            r7.A09.A01().A01(r5, new C68523Dn(this, r5));
        }
    }
}
