package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.3FL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FL {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3FL(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
        this.A02 = str;
    }

    public final void A00(C43761yu r7, C61072sS r8) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C28021Sn r4 = this.A00;
        String str = this.A02;
        if (r8 != null || r7 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("remaining_validates", "1");
            hashMap.put("next_resend_ts", String.valueOf(C28051Sr.A0I(brazilPayBloksActivity.A08, str)));
            AnonymousClass1PT.A04(hashMap, r8 != null ? r8.code : 0, r4);
            return;
        }
        r4.A00("on_success");
    }
}
