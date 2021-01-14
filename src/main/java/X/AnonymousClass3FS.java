package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3FS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FS implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3GY A01;
    public final /* synthetic */ ConfirmPaymentFragment A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ AnonymousClass3FS(AnonymousClass3GY r1, ConfirmPaymentFragment confirmPaymentFragment, int i, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r1;
        this.A02 = confirmPaymentFragment;
        this.A00 = i;
        this.A03 = paymentBottomSheet;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass3GY r7 = this.A01;
        ConfirmPaymentFragment confirmPaymentFragment = this.A02;
        int i = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        Collection collection = (Collection) obj;
        if (collection != null) {
            PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_methods", new ArrayList<>(collection));
            paymentMethodsListPickerFragment.A0N(bundle);
            paymentMethodsListPickerFragment.A0Q(confirmPaymentFragment, 0);
            paymentMethodsListPickerFragment.A02 = new AnonymousClass3YH(r7, i);
            paymentBottomSheet.A0x(paymentMethodsListPickerFragment);
            return;
        }
        throw null;
    }
}
