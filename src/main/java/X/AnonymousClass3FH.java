package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3FH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FH {
    public final /* synthetic */ BrazilPayBloksActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3FH(BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A00 = brazilPayBloksActivity;
        this.A01 = str;
    }

    public final void A00(C61072sS r6) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A00;
        String str = this.A01;
        C28021Sn r2 = brazilPayBloksActivity.A00;
        if (r2 == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (r6 != null) {
            AnonymousClass1PT.A04(null, r6.code, r2);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("app_to_app_authorization_code", str);
            C28021Sn r22 = brazilPayBloksActivity.A00;
            if (r22.A00) {
                AnonymousClass008.A0f(r22, "on_success", hashMap, r22.A03);
            }
        }
    }
}
