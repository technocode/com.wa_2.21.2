package X;

import java.util.HashMap;

/* renamed from: X.3GE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GE implements AbstractC61922tx {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ AnonymousClass1PT A01;

    public /* synthetic */ AnonymousClass3GE(AnonymousClass1PT r1, C28021Sn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61922tx
    public final void AJZ(C61072sS r5) {
        C28021Sn r2 = this.A00;
        if (r5 != null) {
            HashMap hashMap = new HashMap();
            int i = r5.code;
            if (i == 1440) {
                hashMap.put("remaining_retries", String.valueOf(r5.remainingRetries));
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "pin_incorrect", hashMap, r2.A03);
                }
            } else if (i == 1441) {
                hashMap.put("next_retry_ts", String.valueOf(r5.nextAttemptTs));
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "pin_rate_limited", hashMap, r2.A03);
                }
            } else {
                AnonymousClass1PT.A04(hashMap, i, r2);
            }
        } else {
            r2.A00("on_success");
        }
    }
}
