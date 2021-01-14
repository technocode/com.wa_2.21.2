package X;

import java.util.HashMap;

/* renamed from: X.3FN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FN {
    public final /* synthetic */ C28021Sn A00;

    public /* synthetic */ AnonymousClass3FN(C28021Sn r1) {
        this.A00 = r1;
    }

    public final void A00(C61692ta r5, C61072sS r6) {
        C28021Sn r3 = this.A00;
        HashMap hashMap = new HashMap();
        if (r6 == null) {
            hashMap.put("business_name", r5.A02);
            hashMap.put("owner_full_name", r5.A04);
            hashMap.put("verify_type", r5.A05);
            hashMap.put("bank_name", r5.A01);
            hashMap.put("credential_id", r5.A03);
            if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
                return;
            }
            return;
        }
        hashMap.put("error_code", String.valueOf(r6.code));
        if (r3.A00) {
            AnonymousClass008.A0f(r3, "on_failure", hashMap, r3.A03);
        }
    }
}
