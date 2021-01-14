package X;

import java.util.HashMap;

/* renamed from: X.3H4  reason: invalid class name */
public class AnonymousClass3H4 implements AbstractC61522tJ {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ AnonymousClass1PT A01;

    public AnonymousClass3H4(AnonymousClass1PT r1, C28021Sn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61522tJ
    public void AGx(C61072sS r4) {
        AnonymousClass1PT.A04(null, r4.code, this.A00);
    }

    @Override // X.AbstractC61522tJ
    public void AGy(AnonymousClass1VL r5) {
        HashMap hashMap = new HashMap();
        hashMap.put("kyc_status", r5.A02);
        C28021Sn r2 = this.A00;
        if (r2.A00) {
            AnonymousClass008.A0f(r2, "on_success", hashMap, r2.A03);
        }
    }
}
