package X;

import java.util.HashMap;

/* renamed from: X.3FK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FK {
    public final /* synthetic */ C28021Sn A00;

    public /* synthetic */ AnonymousClass3FK(C28021Sn r1) {
        this.A00 = r1;
    }

    public final void A00(C43771yv r6, C61072sS r7) {
        C28021Sn r3 = this.A00;
        HashMap hashMap = new HashMap();
        if (r7 == null) {
            AbstractC59432ne r0 = (AbstractC59432ne) r6.A06;
            if (r0 != null) {
                int i = r0.A00;
                boolean z = false;
                if ((i & 1) > 0) {
                    z = true;
                }
                if (!z) {
                    hashMap.put("sell_pending", "1");
                } else if ((i & 2) <= 0) {
                    hashMap.put("payout_pending", "1");
                }
            }
            if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
                return;
            }
            return;
        }
        hashMap.put("error_code", String.valueOf(r7.code));
        if (r3.A00) {
            AnonymousClass008.A0f(r3, "on_failure", hashMap, r3.A03);
        }
    }
}
