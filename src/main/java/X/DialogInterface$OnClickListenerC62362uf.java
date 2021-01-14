package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.2uf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62362uf implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62362uf(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        dialogInterface.dismiss();
        indiaUpiPaymentActivity.A0Z();
        indiaUpiPaymentActivity.finish();
    }
}
