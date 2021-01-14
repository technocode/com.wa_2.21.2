package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2wO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnFocusChangeListenerC63422wO implements View.OnFocusChangeListener {
    public final /* synthetic */ IndiaUpiDisplaySecureQrCodeView A00;

    public /* synthetic */ View$OnFocusChangeListenerC63422wO(IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView) {
        this.A00 = indiaUpiDisplaySecureQrCodeView;
    }

    public final void onFocusChange(View view, boolean z) {
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A00;
        if (z && !TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0B.getText())) {
            PaymentAmountInputField paymentAmountInputField = indiaUpiDisplaySecureQrCodeView.A0B;
            paymentAmountInputField.setSelection(paymentAmountInputField.getText().length());
        }
    }
}
