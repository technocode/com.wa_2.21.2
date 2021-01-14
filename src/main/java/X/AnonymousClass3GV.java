package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.3GV  reason: invalid class name */
public class AnonymousClass3GV implements AbstractC61522tJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C28021Sn A01;
    public final /* synthetic */ BrazilPayBloksActivity A02;
    public final /* synthetic */ Map A03;

    public AnonymousClass3GV(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2, int i, Map map) {
        this.A02 = brazilPayBloksActivity;
        this.A01 = r2;
        this.A00 = i;
        this.A03 = map;
    }

    @Override // X.AbstractC61522tJ
    public void AGx(C61072sS r6) {
        int i;
        int i2 = r6.code;
        if (i2 != 1448 || (i = this.A00) >= 1) {
            AnonymousClass1PT.A04(null, i2, this.A01);
        } else {
            this.A02.A0V(this.A03, this.A01, i + 1);
        }
    }

    @Override // X.AbstractC61522tJ
    public void AGy(AnonymousClass1VL r6) {
        if ("COMPLETED".equals(r6.A02)) {
            BrazilPayBloksActivity brazilPayBloksActivity = this.A02;
            C01980Ae r1 = ((AnonymousClass1PT) brazilPayBloksActivity).A0E;
            r1.A05(r1.A01("kyc"));
            if (brazilPayBloksActivity.A0C.A05()) {
                C10130e6 r2 = new C10130e6(brazilPayBloksActivity.A06, ((AnonymousClass1PT) brazilPayBloksActivity).A0L, brazilPayBloksActivity.A07);
                brazilPayBloksActivity.A02 = r2;
                brazilPayBloksActivity.A0V.ANC(r2, new Void[0]);
            }
            this.A01.A00("on_success");
        }
    }
}
