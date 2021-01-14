package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: X.3GW  reason: invalid class name */
public class AnonymousClass3GW implements AbstractC61272su {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3GW(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
        this.A02 = str;
    }

    @Override // X.AbstractC61272su
    public void ADv(C43761yu r4) {
        Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
        ((AnonymousClass1PT) this.A01).A0L.A01().A01(r4, new AnonymousClass3FD(this, this.A00));
    }

    @Override // X.AbstractC61272su
    public void AJf(ArrayList arrayList, C61072sS r8) {
        if (r8 != null) {
            AnonymousClass1PT.A04(null, r8.code, this.A00);
        } else if (arrayList != null && !arrayList.isEmpty()) {
            if (C60842s5.A02(arrayList)) {
                AnonymousClass1PT.A04(null, -233, this.A00);
                return;
            }
            BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
            JSONArray A03 = brazilPayBloksActivity.A0A.A03(arrayList);
            C43761yu r2 = (C43761yu) brazilPayBloksActivity.A09.A08(this.A02);
            if (A03 != null) {
                C28021Sn r3 = this.A00;
                HashMap A032 = brazilPayBloksActivity.A03.A03(r2, A03.toString());
                if (r3.A00) {
                    AnonymousClass008.A0f(r3, "on_success", A032, r3.A03);
                }
            }
        }
    }
}
