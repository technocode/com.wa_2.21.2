package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.3FC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FC {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass3FC(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
    }

    public final void A00(C61072sS r5) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C28021Sn r3 = this.A00;
        if (r5 == null) {
            r3.A00("on_success");
        } else if (!brazilPayBloksActivity.A0D.A02(brazilPayBloksActivity, r5)) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(r5.code));
            if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_failure", hashMap, r3.A03);
            }
        }
    }
}
