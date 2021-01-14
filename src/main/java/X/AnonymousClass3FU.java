package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.3FU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FU implements AbstractC48012Ko {
    public final /* synthetic */ C69173Ga A00;

    public /* synthetic */ AnonymousClass3FU(C69173Ga r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00.A00;
        ((ActivityC004702f) brazilPaymentActivity).A0K.A00();
        if (brazilPaymentActivity.A03 != null && list.size() > 0) {
            brazilPaymentActivity.A03.AIN((AnonymousClass1VM) list.get(0));
        }
    }
}
