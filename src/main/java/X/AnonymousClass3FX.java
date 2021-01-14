package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FX implements AbstractC03150Ez {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public /* synthetic */ AnonymousClass3FX(BrazilPaymentActivity brazilPaymentActivity, Intent intent) {
        this.A01 = brazilPaymentActivity;
        this.A00 = intent;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        Intent intent = this.A00;
        List list = (List) obj;
        if (brazilPaymentActivity.A03 != null) {
            String stringExtra = intent.getStringExtra("payment_method_credential_id");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1VM r1 = (AnonymousClass1VM) it.next();
                if (r1.A07.equals(stringExtra)) {
                    brazilPaymentActivity.A03.AIN(r1);
                    break;
                }
            }
        }
        brazilPaymentActivity.A01.A02();
    }
}
