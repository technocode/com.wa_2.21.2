package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.3GS  reason: invalid class name */
public class AnonymousClass3GS implements AbstractC61272su {
    public final /* synthetic */ BrazilConfirmReceivePaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3GS(BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment, String str, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = brazilConfirmReceivePaymentFragment;
        this.A02 = str;
        this.A01 = paymentBottomSheet;
    }

    @Override // X.AbstractC61272su
    public void ADv(C43761yu r4) {
        Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
        this.A00.A0B.A01().A01(r4, new AnonymousClass3F9(this, r4, this.A01));
    }

    @Override // X.AbstractC61272su
    public void AJf(ArrayList arrayList, C61072sS r8) {
        JSONArray A03;
        Intent A012;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = this.A00;
        brazilConfirmReceivePaymentFragment.A01.A02();
        if (r8 != null || arrayList == null || arrayList.isEmpty() || (A03 = brazilConfirmReceivePaymentFragment.A06.A03(arrayList)) == null || C60842s5.A02(arrayList)) {
            AnonymousClass008.A0v("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: ", 0);
            brazilConfirmReceivePaymentFragment.A00.A01(brazilConfirmReceivePaymentFragment.A00(), 0, R.string.payment_verify_card_error).show();
            return;
        }
        String str = this.A02;
        String obj = A03.toString();
        C01970Ad r0 = brazilConfirmReceivePaymentFragment.A0B;
        r0.A04();
        C43761yu r2 = (C43761yu) r0.A06.A08(str);
        if (!(r2 == null || (A012 = brazilConfirmReceivePaymentFragment.A0E.A01(brazilConfirmReceivePaymentFragment.A0A(), r2, obj)) == null)) {
            brazilConfirmReceivePaymentFragment.A0h(A012);
        }
        PaymentBottomSheet paymentBottomSheet = this.A01;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A0w(false, false);
        }
    }
}
