package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62392ui implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62392ui(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        C002001d.A2N(indiaUpiPaymentActivity, 22);
        indiaUpiPaymentActivity.A0Z();
        indiaUpiPaymentActivity.finish();
    }
}
