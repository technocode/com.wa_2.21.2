package X;

import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.3FZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FZ implements AbstractC03150Ez {
    public final /* synthetic */ C05900Qy A00;
    public final /* synthetic */ AddPaymentMethodBottomSheet A01;
    public final /* synthetic */ BrazilPaymentActivity A02;

    public /* synthetic */ AnonymousClass3FZ(BrazilPaymentActivity brazilPaymentActivity, AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, C05900Qy r3) {
        this.A02 = brazilPaymentActivity;
        this.A01 = addPaymentMethodBottomSheet;
        this.A00 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A02;
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = this.A01;
        C05900Qy r1 = this.A00;
        List list = (List) obj;
        addPaymentMethodBottomSheet.A0w(false, false);
        brazilPaymentActivity.A0Z((AnonymousClass1VM) list.get(C28051Sr.A0D(list)), r1);
        brazilPaymentActivity.A01.A02();
    }
}
