package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.3Ge  reason: invalid class name and case insensitive filesystem */
public class C69213Ge implements AbstractC61272su {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public C69213Ge(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    @Override // X.AbstractC61272su
    public void ADv(C43761yu r3) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.A0K.A00();
        brazilPaymentCardDetailsActivity.A08.A01().A01(r3, new C68913Fa(this, r3));
    }

    @Override // X.AbstractC61272su
    public void AJf(ArrayList arrayList, C61072sS r7) {
        int i;
        JSONArray A03;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.A0K.A00();
        if (r7 == null) {
            if (arrayList == null || arrayList.isEmpty() || (A03 = brazilPaymentCardDetailsActivity.A03.A03(arrayList)) == null || C60842s5.A02(arrayList)) {
                i = 0;
            } else {
                Intent A01 = brazilPaymentCardDetailsActivity.A0A.A01(brazilPaymentCardDetailsActivity, (C43761yu) ((AbstractView$OnClickListenerC32271ec) brazilPaymentCardDetailsActivity).A07, A03.toString());
                AnonymousClass2DC.A05(A01, "payment_method_details");
                brazilPaymentCardDetailsActivity.A0H(A01, 1);
                return;
            }
        } else if (arrayList == null || arrayList.isEmpty()) {
            i = -233;
        } else {
            i = r7.code;
        }
        AnonymousClass008.A0v("PAY: BrazilGetVerificationMethods Error: ", i);
        brazilPaymentCardDetailsActivity.A00.A01(brazilPaymentCardDetailsActivity, i, R.string.payment_verify_card_error).show();
    }
}
