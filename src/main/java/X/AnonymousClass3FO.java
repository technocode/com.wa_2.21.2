package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.3FO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FO {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3FO(BrazilPayBloksActivity brazilPayBloksActivity, String str, C28021Sn r3) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r3;
    }

    public final void A00(C61072sS r10) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C28021Sn r2 = this.A00;
        if (r10 != null) {
            int i = r10.remainingRetries;
            HashMap hashMap = new HashMap();
            hashMap.put("remaining_retries", String.valueOf(i));
            hashMap.put("error_code", String.valueOf(r10.code));
            if (i >= 0) {
                AnonymousClass1V4 A012 = ((AnonymousClass1PT) brazilPayBloksActivity).A0L.A01();
                AnonymousClass3FM r7 = new AnonymousClass3FM(i);
                AnonymousClass3FP r8 = new AnonymousClass3FP(r2, hashMap);
                AnonymousClass00T r3 = A012.A03;
                r3.ANC(new C10650ey(r3, A012.A01, A012.A02, str, r7, r8), new Void[0]);
            } else if (r2.A00) {
                AnonymousClass008.A0f(r2, "on_failure", hashMap, r2.A03);
            }
        } else {
            r2.A00("on_success");
        }
    }
}
