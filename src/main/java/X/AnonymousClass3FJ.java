package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3FJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FJ implements AbstractC61222sp {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass3FJ(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
    }

    @Override // X.AbstractC61222sp
    public final void AEy(C43761yu r6, ArrayList arrayList, C61072sS r8) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C28021Sn r2 = this.A00;
        HashMap hashMap = new HashMap();
        if (r8 != null) {
            hashMap.put("error_code", String.valueOf(r8.code));
            if (r2.A00) {
                AnonymousClass008.A0f(r2, "on_failure", hashMap, r2.A03);
            }
        } else if (r6 == null || arrayList == null || arrayList.isEmpty()) {
            AnonymousClass1PT.A04(null, -233, r2);
        } else {
            ((AnonymousClass1PT) brazilPayBloksActivity).A0L.A01().A01(r6, new AnonymousClass3FG(brazilPayBloksActivity, arrayList, r2, hashMap));
        }
    }
}
