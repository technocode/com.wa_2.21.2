package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3FE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FE {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass3FE(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
    }

    public final void A00(int i, C61712tc r7, C61072sS r8) {
        JSONArray A012;
        C28021Sn r3 = this.A00;
        HashMap hashMap = new HashMap();
        if (r8 != null) {
            hashMap.put("error_code", String.valueOf(r8.code));
            if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_failure", hashMap, r3.A03);
            }
        } else if (r7 != null) {
            hashMap.put("status", String.valueOf(i));
            if (i == 1) {
                Log.i("PAY: BrazilVerifyTaxId: Linked account, try to link merchant");
                hashMap.put("verify_type", r7.A08);
                hashMap.put("verify_id", r7.A07);
                hashMap.put("bank_code", r7.A02);
                hashMap.put("bank_name", r7.A03);
                hashMap.put("masked_account_number", r7.A05);
                hashMap.put("last4", r7.A04);
                hashMap.put("support_phone_number", r7.A06);
                if (r3.A00) {
                    AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
                    return;
                }
                return;
            }
            Log.i("PAY: BrazilVerifyTaxId: new merchant, try to reg merchant");
            List list = r7.A09;
            if (list != null && !list.isEmpty() && (A012 = C60842s5.A01(list)) != null) {
                hashMap.put("banks", A012.toString());
                if (r3.A00) {
                    AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
                }
            }
        } else {
            Log.w("PAY: BrazilPayBloksActivity startVerifyTaxId unexpected state");
        }
    }
}
