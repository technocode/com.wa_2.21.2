package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.3FB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FB {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3FB(BrazilPayBloksActivity brazilPayBloksActivity, String str, C28021Sn r3) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r3;
    }

    public final void A00(C74723bO r7, C61072sS r8) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C28021Sn r3 = this.A00;
        if (r8 == null) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("remaining_validates", str2);
            hashMap.put("next_resend_ts", String.valueOf(C28051Sr.A0I(brazilPayBloksActivity.A08, str)));
            if (r7 != null) {
                if (!r7.A0X) {
                    str2 = "0";
                }
                hashMap.put("verified_state", str2);
                ((AnonymousClass1PT) brazilPayBloksActivity).A0L.A01().A01(r7.A03(), new AnonymousClass3FR(r3, hashMap));
            } else if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
            }
        } else {
            AnonymousClass1PT.A04(null, r8.code, r3);
        }
    }
}
