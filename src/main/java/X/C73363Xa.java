package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3Xa  reason: invalid class name and case insensitive filesystem */
public class C73363Xa extends AbstractC68463Dh {
    public final /* synthetic */ C61292sw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73363Xa(C61292sw r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantGetStatusAction request error: ");
        sb.append(r4);
        Log.e(sb.toString());
        this.A00.A06.A00(0, null, r4);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantGetStatusAction response error: ");
        sb.append(r4);
        Log.e(sb.toString());
        this.A00.A06.A00(0, null, r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r9) {
        AnonymousClass0M5 A0D = r9.A0D("account");
        if (A0D != null) {
            int A02 = C006803i.A02(A0D.A0G("status", null), 0);
            A0D.A0G("verify-type", null);
            A0D.A0G("verify-id", null);
            A0D.A0G("last4", null);
            A0D.A0G("masked-account-number", null);
            A0D.A0G("bank-name", null);
            A0D.A0G("bank-code", null);
            A0D.A0G("support-phone-number", null);
            C006803i.A02(A0D.A0G("remaining-retries", null), -1);
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass0M5 r1 : A0D.A0H("bank")) {
                C74713bN r0 = new C74713bN();
                r0.A01(0, r1);
                arrayList.add(r0);
            }
            if (A0D.A0G("error-code", null) != null) {
                C006803i.A02(A0D.A0G("error-code", null), 0);
                A0D.A0G("error-text", null);
                this.A00.A06.A00(0, null, new C61072sS());
                return;
            }
            C61292sw r02 = this.A00;
            C61712tc r12 = new C61712tc(A0D);
            r02.A00 = r12;
            r02.A06.A00(A02, r12, null);
            return;
        }
        throw null;
    }
}
