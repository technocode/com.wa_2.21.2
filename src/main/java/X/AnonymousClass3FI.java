package X;

import java.util.HashMap;

/* renamed from: X.3FI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FI {
    public final /* synthetic */ C28021Sn A00;

    public /* synthetic */ AnonymousClass3FI(C28021Sn r1) {
        this.A00 = r1;
    }

    public final void A00(C61072sS r5) {
        C28021Sn r3 = this.A00;
        if (r5 == null) {
            r3.A00("on_success");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(r5.code));
        if (r3.A00) {
            AnonymousClass008.A0f(r3, "on_failure", hashMap, r3.A03);
        }
    }
}
