package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.2um  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62432um implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62432um(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        C002001d.A2N(indiaUpiPaymentActivity, 12);
        Intent intent = new Intent(indiaUpiPaymentActivity, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", indiaUpiPaymentActivity.A02);
        indiaUpiPaymentActivity.startActivity(intent);
        indiaUpiPaymentActivity.A0Z();
        indiaUpiPaymentActivity.finish();
    }
}
