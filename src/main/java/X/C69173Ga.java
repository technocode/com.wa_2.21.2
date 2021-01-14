package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.3Ga  reason: invalid class name and case insensitive filesystem */
public class C69173Ga implements AbstractC61272su {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public C69173Ga(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    @Override // X.AbstractC61272su
    public void ADv(C43761yu r3) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        ((AbstractActivityC34761jB) this.A00).A0M.A01().A01(r3, new AnonymousClass3FU(this));
    }

    @Override // X.AbstractC61272su
    public void AJf(ArrayList arrayList, C61072sS r7) {
        Intent A012;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        ((ActivityC004702f) brazilPaymentActivity).A0K.A00();
        if (r7 == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                brazilPaymentActivity.A02.A01(brazilPaymentActivity, 0, R.string.payment_card_cannot_verified_error).show();
                return;
            }
            JSONArray A03 = brazilPaymentActivity.A08.A03(arrayList);
            if (A03 != null && !C60842s5.A02(arrayList)) {
                String str = this.A01;
                String obj = A03.toString();
                C01970Ad r0 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0M;
                r0.A04();
                C43761yu r1 = (C43761yu) r0.A06.A08(str);
                if (r1 != null && (A012 = brazilPaymentActivity.A0K.A01(brazilPaymentActivity, r1, obj)) != null) {
                    AnonymousClass2DC.A05(A012, "verify_to_pay");
                    brazilPaymentActivity.A0H(A012, 1);
                    return;
                }
                return;
            }
        }
        Log.i("PAY: BrazilGetVerificationMethods Error: 0");
        brazilPaymentActivity.A02.A01(brazilPaymentActivity, 0, R.string.payment_verify_card_error).show();
    }
}
