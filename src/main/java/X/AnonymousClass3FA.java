package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3FA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FA implements AbstractC03150Ez {
    public final /* synthetic */ BrazilConfirmReceivePaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public /* synthetic */ AnonymousClass3FA(BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = brazilConfirmReceivePaymentFragment;
        this.A01 = paymentBottomSheet;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A01;
        Collection collection = (Collection) obj;
        if (collection != null) {
            PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_methods", new ArrayList<>(collection));
            paymentMethodsListPickerFragment.A0N(bundle);
            paymentMethodsListPickerFragment.A0Q(brazilConfirmReceivePaymentFragment, 0);
            paymentMethodsListPickerFragment.A02 = new AnonymousClass3YG(brazilConfirmReceivePaymentFragment);
            paymentBottomSheet.A0x(paymentMethodsListPickerFragment);
            return;
        }
        throw null;
    }
}
